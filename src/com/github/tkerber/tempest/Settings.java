package com.github.tkerber.tempest;

/**
 * Contains config options for tempest.
 */
public class Settings{
    
    /**
     * The local list of files (and directories) to be synchronised.
     */
    private SyncList localSyncList;
    /**
     * The remote list of files (and directories) to be synchronised.
     */
    private SyncList remoteSyncList;
    /**
     * A local log of the last time files were recorded as modified.
     */
    private SyncLog localSyncLog;
    /**
     * A remote log of the last time files were recorded as modified.
     */
    private SyncLog remoteSyncLog;
    
    /**
     * Settings should never be explicitly constucted, only changed or loaded.
     */
    private Settings(){
        // TODO
        this.localSyncList = null;
        this.remoteSyncList = null;
        this.localSyncLog = null;
        this.remoteSyncLog = null;
    }
    
    /**
     * Loads the settings from local config files and/or default values.
     * @return The program settings.
     */
    public static Settings load(){
        // TODO
        return null;
    }
    
    /**
     * Gets the local SyncList.
     * @return The local list of files (and directories) to be synchronised.
     */
    public SyncList getLocalSyncList(){
        return localSyncList;
    }
    
    /**
     * Gets the remote SyncList.
     * @return The remote list of files (and directories) to be synchronised.
     */
    public SyncList getRemoteSyncList(){
        return remoteSyncList;
    }
    
    /**
     * Sets the local SyncList.
     * @param sl The local list of files (and directories) to be synchronised.
     */
    public void setLocalSyncList(SyncList sl){
        localSyncList = sl;
    }
    
    /**
     * Sets the remote SyncList.
     * @param sl The remote list of files (and directories) to be synchronised.
     */
    public void setRemoteSyncList(SyncList sl){
        remoteSyncList = sl;
    }
    
    /**
     * Gets the local SyncLog.
     * @return A local log of the last time files were recorded as modified.
     */
    public SyncLog getLocalSyncLog(){
        return localSyncLog;
    }
    
    /**
     * Gets the remote SyncLog.
     * @return A remote log of the last time files were recorded as modified.
     */
    public SyncLog getRemoteSyncLog(){
        return remoteSyncLog;
    }
    
    /**
     * Sets the local SyncLog.
     * @param sl A local log of the last time files were recorded as modified.
     */
    public void setLocalSyncLog(SyncLog sl){
        localSyncLog = sl;
    }
    
    /**
     * Sets the remote SyncLog.
     * @param sl A remote log of the last time files were recorded as modified.
     */
    public void setRemoteSyncLog(SyncLog sl){
        remoteSyncLog = sl;
    }
    
}
