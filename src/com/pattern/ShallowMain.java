package com.pattern;

import java.util.ArrayList;
import java.util.List;

public class ShallowMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> list = new ArrayList<String>();
        list.add("小明");
        list.add("小红");

        //浅度复制：只复制对象中的属性。对象中的对象，只复制地址
        ShallowPerson shallowPerson = new ShallowPerson();
        shallowPerson.setName("张三");
        shallowPerson.setFriendNames(list);
        ShallowPerson cloneShallowPerson = shallowPerson.clone();//浅度复制

        System.out.println(shallowPerson.getName());
        System.out.println(shallowPerson.getFriendNames());
        System.out.println(cloneShallowPerson.getName());
        System.out.println(cloneShallowPerson.getFriendNames());
        System.out.println("--------------------------------------------");

        list.add("小兰");
        System.out.println(shallowPerson.getName());
        System.out.println(shallowPerson.getFriendNames());
        System.out.println(cloneShallowPerson.getName());
        System.out.println(cloneShallowPerson.getFriendNames());
    }
}
