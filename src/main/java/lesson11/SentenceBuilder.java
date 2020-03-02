package lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class SentenceBuilder {
     void sentenceBuild() {
        ArrayList<String> subjects = new ArrayList<>(Arrays.asList("Noel", "The cat", "The dog"));
        ArrayList<String> verbs =    new ArrayList<>(Arrays.asList("wrote", "chased", "slept on"));
        ArrayList<String> objects =  new ArrayList<>(Arrays.asList("the book","the ball","the bed"));
        ArrayList<String> allPossible = new ArrayList<>();


        for (String a:subjects) {
            for (String b:verbs) {
                for (String c:objects) {
                    allPossible.add(String.format(a + " "  + b + " " + c + "\n"));
                }

            }

        }
        System.out.println(allPossible);

    }
}
