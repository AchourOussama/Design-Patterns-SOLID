package com.directi.training.isp.solution;

public interface ISensingDoor {
    void lock();
    void unlock();
    void open();
    void close();
    void proximityCallback();
}