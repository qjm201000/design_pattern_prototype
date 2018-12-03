package com.pattern;

import java.util.ArrayList;
import java.util.List;

public class DepthPerson implements Cloneable{
    private String name;
    private List<String> friendNames;

    public List<String> getFriendNames() {
        return friendNames;
    }

    public void setFriendNames(List<String> friendNames) {
        this.friendNames = friendNames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected DepthPerson clone() throws CloneNotSupportedException {
        List<String> list = new ArrayList<String>();
        DepthPerson person = (DepthPerson)super.clone();
        for(String frientName :this.getFriendNames()){
            list.add(frientName);
        }
        person.setFriendNames(list);
        return person;
    }
}
