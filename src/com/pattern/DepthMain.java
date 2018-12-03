package com.pattern;

import java.util.ArrayList;
import java.util.List;

public class DepthMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> list = new ArrayList<String>();
        list.add("小明");
        list.add("小红");

        //深度复制：对象中的属性和对象中的对象都复制
        DepthPerson depthPerson = new DepthPerson();
        depthPerson.setName("张三");
        depthPerson.setFriendNames(list);
        DepthPerson cloneDepthPerson = depthPerson.clone();//深度复制

        System.out.println(depthPerson.getName());
        System.out.println(depthPerson.getFriendNames());
        System.out.println(cloneDepthPerson.getName());
        System.out.println(cloneDepthPerson.getFriendNames());
        System.out.println("--------------------------------------------");

        list.add("小兰");
        System.out.println(depthPerson.getName());
        System.out.println(depthPerson.getFriendNames());
        System.out.println(cloneDepthPerson.getName());
        System.out.println(cloneDepthPerson.getFriendNames());
    }
}
