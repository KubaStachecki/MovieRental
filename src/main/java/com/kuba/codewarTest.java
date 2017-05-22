package com.kuba;

import java.util.List;
import java.util.Arrays;

/**
 * Created by RENT on 2017-05-22.
 */
public class codewarTest {


    public static void main(String[] args) {




    String phrase = "Must return null when the arg is null";

    List<String> wisdom = Arrays.asList(phrase.split(" ")) ;

        System.out.println(wisdom.toString());


    for(String s : wisdom){

        String tmp =  s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        System.out.println(tmp);
        s = tmp;
    }




//            .stream().map(i -> i.toString())
//
//            .forEach(s -> {
//
//                s = "" + s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
//
//            });

    StringBuilder js = new StringBuilder();

for(String s : wisdom){
        js.append(s);
        js.append(" ");

    }


        System.out.println( js.toString());


}}
