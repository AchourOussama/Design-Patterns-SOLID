package com.directi.training.dip.solution;

import java.io.IOException;

public class EncodingModuleClient
{
    private static IEncoder encoder;
    public static void main(String[] args) throws IOException
    {
        encoder.encodeWithFiles();
        encoder.encodeBasedOnNetworkAndDatabase();
    }
}
