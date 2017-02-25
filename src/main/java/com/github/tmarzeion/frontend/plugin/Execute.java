package com.github.tmarzeion.frontend.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * @goal execute
 * @requiresProject false
 */
public class Execute extends AbstractMojo {

    /**
     * @parameter expression="${dir}"
     */
    private String dir;

    /**
     * @parameter expression="${command}"
     */
    private String command;


    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("HELLO WORLD");
    }

}
