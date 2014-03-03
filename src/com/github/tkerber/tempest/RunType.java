package com.github.tkerber.tempest;

import java.util.logging.Level;

/**
 * Immutable class detailing the type of execution to be done by a command.
 */
public class RunType{
    
    /**
     * Details the behavior which should be used when an edit conflict is
     * encountered.
     */
    public enum ConflictHandling{
        /**
         * Skips the file.
         */
        SKIP,
        /**
         * Reverts all copying done up until that point and exits with an
         * error.
         */
        ERROR,
        /**
         * Delegates the decision to the UI.
         * Should the UI refuse, reverts to ERROR.
         */
        ASK,
        /**
         * Preferrs the file most recently modified.
         */
        MOST_RECENT
    }
    
    /**
     * How the command should handle conflicts.
     */
    public final ConflictHandling conflictHandling;
    /**
     * The log level which should be used for this command.
     */
    public final Level verbosity;
    /**
     * Whether or not this command should be executed as a dry run.
     */
    public final boolean dry;
    
    /**
     * Creates a new RunType.
     * 
     * @param cfh How the command should handle conflicts.
     * @param v The log level which should be used for this command.
     * @param dry Whether or not this command should be executed as a dry run.
     */
    public RunType(ConflictHandling cfh, Level v, boolean dry){
        conflictHandling = cfh;
        verbosity = v;
        this.dry = dry;
    }
    
}
