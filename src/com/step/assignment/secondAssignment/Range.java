package com.step.assignment.secondAssignment;

import java.util.ArrayList;

public abstract class Range <T> {
    abstract ArrayList<T> getAll();
    abstract boolean contains(T element);
}
