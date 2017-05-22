package com.kuba;

import java.util.List;
import java.util.Arrays;

/**
 * Created by RENT on 2017-05-22.
 */
public class codewarTest {


        public String toJadenCase(String phrase) {
            // TODO put your code below this comment

            List<String> wisdom = Arrays.asList(phrase.split(" ")).stream()

                    .forEach(s -> {

                        String res ="" + s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();

                        return res;

                    });

            StringBuilder js = new StringBuilder();

            for(String s : wisdom){
                js.append(s);
                js.append(" ");

            }



            return js.toString();
        }

    }
}
