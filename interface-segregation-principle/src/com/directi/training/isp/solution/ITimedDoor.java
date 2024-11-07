package com.directi.training.isp.solution;

public interface ITimedDoor {
    void lock();
    void unlock();
    void open();
    void close();
    void timeOutCallback();
}