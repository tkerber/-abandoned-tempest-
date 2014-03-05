package com.github.tkerber.tempest;

import java.util.Map;

/**
 * Keeps track of the items being synchronised.
 */
public class SyncList{
    
    /**
     * The actual sync "list".
     * 
     * Map the mountprefix to a mapping of paths to SyncItems.
     */
    private Map<String, Map<String, SyncItem>> sl;
    
    /**
     * Adds a file to the synclist, selecting an appropriate mountprefix.
     * @param file The path of the file to add to the synclist.
     * @param si The sync setting for this individual item.
     */
    public void add(String file, SyncItem i){
        // TODO
    }
    
    /**
     * Adds a file from the synclist.
     * @param mountprefix The file's mountprefix.
     * @param file The file path, relative to the mountprefix.
     * @param si The sync settings for this individual item.
     */
    public void add(String mountprefix, String file, SyncItem i){
        // TODO
    }
    
    /**
     * Removes a file from the synclist, selecting an appropriate mountprefix.
     * @param file The path of the file to remove from the synclist.
     */
    public void remove(String file){
        // TODO
    }
    
    /**
     * Removes a file from the synclist.
     * @param mountprefix The file's mountprefix.
     * @param file The file path, relative to the mountprefix.
     */
    public void remove(String mountprefix, String file){
        // TODO
    }
    
}
