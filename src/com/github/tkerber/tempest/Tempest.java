package com.github.tkerber.tempest;

import com.github.tkerber.tempest.commands.Command;

/**
 * A program for syncing system settings.
 */
public class Tempest{
    
    /**
     * The program settings.
     */
    private Settings settings;
    /**
     * The programs UI.
     * 
     * This may involve very little user and even less interface.
     */
    private UI ui;
    
    /**
     * Runs.
     * 
     * @param args The command line arguments to be parsed by the UI.
     */
    public static void main(String[] args){
        new Tempest(UI.DEFAULT_UI, args).run();
    }
    
    /**
     * Creates a tempest!
     * 
     * @param ui The program's UI.
     * @param args The command line arguments, to be parsed by the UI.
     */
    public Tempest(UI ui, String[] args){
        this.ui = ui;
        settings = ui.parseArgs(args, Settings.load());
    }
    
    /**
     * Run (from) the tempest!
     */
    public void run(){
        ui.run(this);
    }
    
    /**
     * Executes a command.
     * 
     * @param t The settins for the command to be executed.
     */
    public void execute(Command c, RunType t){
        c.execute(settings, ui, t);
    }
    
}
