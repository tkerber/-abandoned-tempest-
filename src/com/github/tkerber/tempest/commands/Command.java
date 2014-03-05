package com.github.tkerber.tempest.commands;

import com.github.tkerber.tempest.Settings;
import com.github.tkerber.tempest.UI;
import com.github.tkerber.tempest.RunType;

/**
 * Details an instruction which can be carried out.
 * 
 * This allows the seperation of the planning and execution of commands.
 * Implementing classes should be immutable.
 */
public interface Command{
    
    /**
     * Executes the command.
     * 
     * @param settings The setting under which the command should be run.
     * @param ui The ui to be used in callbacks within the command.
     * @param t Settings for the execution of the command.
     */
    public void execute(Settings settings, UI ui, RunType t);
    
}
