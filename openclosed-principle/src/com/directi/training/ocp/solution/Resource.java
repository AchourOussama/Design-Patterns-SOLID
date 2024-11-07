package com.directi.training.ocp.solution;

public interface Resource {
    int allocate();
    void free(int resourceId);
}