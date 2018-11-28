package com;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //(?=(regex))
        //lookahead
//        Pattern p= Pattern.compile("q(?=u)"); // (?=(regex)) - \\1
        Pattern p= Pattern.compile("q(?!u)");
//        Matcher m=p.matcher("quqa");
        Matcher m=p.matcher("Iraq");
        while (m.find()){
            System.out.println(m.start()+" "+m.group()+" ");
        }
        System.out.println(" ");

        //lookbehind
        Pattern p2= Pattern.compile("(?<!a)b");
        Matcher m2=p2.matcher("cb");
        while (m2.find()){
            System.out.println(m2.start()+" "+m2.group()+" ");
        }
        System.out.println(" ");

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
