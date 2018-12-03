package com.pattern;

import java.util.List;

/**
 * 浅度复制
 */
public class ShallowPerson implements Cloneable{
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
    protected ShallowPerson clone() throws CloneNotSupportedException {
        ShallowPerson person = (ShallowPerson)super.clone();
        return person;
    }
}
