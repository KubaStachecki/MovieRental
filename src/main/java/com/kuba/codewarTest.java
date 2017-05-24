package com.kuba;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


public class codewarTest {


    public static void main(String[] args) {

        String dna = "ATTCGD";


char [] dnac = dna.toCharArray();

        for (int i = 0; i <dnac.length ; i++) {
            if(dnac[i] == 'A'){dnac[i]= 'T';}
            else if(dnac[i] == 'T'){dnac[i] = 'A';}
            else if(dnac[i] == 'C'){dnac[i] = 'G';}
            else if(dnac[i] == 'G'){dnac[i] = 'C';}


        }

        System.out.println(Arrays.toString(dnac));



  //      System.out.println(tmp);
//
//
//        dna.chars().map(c -> (char)c).map(c ->{
////
//            if(c == 'A'){c = 'T';}
//            if(c == 'T'){c = 'A';}
//            if(c == 'C'){c = 'G';}
//            if(c == 'G'){c = 'C';}
////
//            return c;
//
//        }).map(c -> Character.toChars(c)).forEach(c -> System.out.print(c));
//
//
//
//


    }
}
