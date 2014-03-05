package com.github.tkerber.tempest;

import java.util.Map;

/**
 * Keeps track of the last known modification date of files (or in the case
 * deletion, the data the deletion was processed by tempest.
 * 
 * This is used, for example, to ensure that deletions are processed correctly
 * and not seen simply as the file not yet having been synced.
 * 
 * There is a local and remote copy of this. If the modification date on the
 * local copy is before that of a local file, it has been modified. Equally
 * with the remote file. If both have been modified, a conflict occurs.
 * 
 * Remote modification dates are looked up in a remote file, so that deleted
 * files still have a date associated with them.
 */
public class SyncLog{
    
    /**
     * The last modification dates of files.
     * 
     * Map of mountprefix to map of path to unix timestamp.
     */
    private Map<String, Map<String, Long>> dates;
    
    /**
     * Gets the last modification date of a file.
     * 
     * @param prefix The mountprefix the file is on.
     * @param path The path of the file relative to the mountprefix.
     * @return The unix timestamp of when the file was last recorded.
     */
    public long getTime(String prefix, String path){
        return dates.get(prefix).get(path);
    }
    
    /**
     * Sets the last modification date of a file.
     * 
     * @param prefix The mountprefix the file is on.
     * @param path The path of the file relative to the mountprefix.
     * @param when The unix timestamp to record for the file.
     */
    public void touch(String prefix, String path, long when){
        dates.get(prefix).put(path, when);
    }
    
}
