package lesson10_3;

import java.util.*;
import java.util.Set;

public class charCount {
   String charCounterMethod(String text) {

        Set<String> textchars;
        textchars = new HashSet<>();
       for (int i = 0; i < text.length(); i++) {
            textchars.add("" + text.charAt(i));
       }
       System.out.println(textchars);
        StringBuilder str = new StringBuilder();
        String result;

        for (String i : textchars) {
            int counter = 0;
            for (int j = 0; j < text.length(); j++) {
                if (i.equals(""+ text.charAt(j))) counter++;
            }
            str.append(i + ":" + counter  + "\n");
        }
        return result = "" + str;
    }
}

