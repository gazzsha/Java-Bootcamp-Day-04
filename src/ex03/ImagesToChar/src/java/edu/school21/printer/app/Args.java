package edu.school21.printer.app;

import com.beust.jcommander.Parameter;

import com.beust.jcommander.Parameters;

@Parameters(separators = "=")
public class Args {
    @Parameter(names = {"--black"})
    String black;
    @Parameter(names = {"--white"})
    String white;
}
