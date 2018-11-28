package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        //work that ends with s
//        Pattern p3= Pattern.compile("\\b\\w+(?<!s)\\b");
//        Pattern p3= Pattern.compile("\\b\\w+[^s]\\b");
        Pattern p3= Pattern.compile("\\b\\w*[^s\\W]\\b");
        Matcher m3=p3.matcher("John's");
        while (m3.find()){
            System.out.println(m3.start()+" "+m3.group()+" ");
        }
        System.out.println(" ");
    }
}
