package com.github.tkerber.tempest;

/**
 * A tempest UI.
 */
public interface UI{
    
    /**
     * The default UI is the basic CLI.
     */
    public static final UI DEFAULT_UI = CLI.INSTANCE;
    
    /**
     * Parses the command line arguments.
     * 
     * Updates the settings accordingly.
     */
    public Settings parseArgs(String[] str, Settings settings);
    
    /**
     * Run (from) the tempest!
     */
    public void run(Tempest t);
    
    // TODO
    
}
