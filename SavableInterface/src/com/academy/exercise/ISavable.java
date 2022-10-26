package com.academy.exercise;

import java.util.List;

public interface ISavable {

    public List<String> getObject();
    public void loadObject(List<String> values);
}
