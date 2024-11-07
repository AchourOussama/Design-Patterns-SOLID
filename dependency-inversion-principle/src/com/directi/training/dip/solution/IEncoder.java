package com.directi.training.dip.solution;

import java.io.IOException;

public interface IEncoder {
    void encodeWithFiles() throws IOException;
    void encodeBasedOnNetworkAndDatabase() throws IOException;
}
