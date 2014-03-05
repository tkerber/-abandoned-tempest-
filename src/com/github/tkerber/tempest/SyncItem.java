package com.github.tkerber.tempest;

/**
 * Keeps track of the settings for synchronization of a single item.
 */
public class SyncItem{
    
    /**
     * Whether or not to recurse into directories.
     * 
     * Has no effect except on directories.
     */
    public final boolean recursive;
    /**
     * Whether or not to replace occurrences of the mountprefix with a
     * variable.
     */
    public final boolean prefixReplace;
    /**
     * The tags of this item.
     */
    public final String[] tags;
    
    /**
     * Creates a new SyncItem.
     */
    public SyncItem(boolean recursive, boolean prefixReplace, String[] tags){
        this.recursive = recursive;
        this.prefixReplace = prefixReplace;
        this.tags = tags;
    }
    
}
