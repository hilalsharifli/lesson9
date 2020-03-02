package lesson10_3;

import java.util.*;

public class CharacterPositions2 {
  public static void main(String[] args) {
    String origin = "Hello World";
    HashMap<Character, Integer> map = new HashMap<>();
     Set<Character> characterList = new HashSet<Character>(Arrays.asList());
    origin.chars()

        .mapToObj(n -> (char)n)
            .forEach(c -> {
          int count = 1;
          if (map.containsKey(c)) {
            count = map.get(c) + 1;
          }
          map.put(c, count);
        });
    map.forEach((c, n) ->
            System.out.printf("Letter: '%c', count:%d\n", c, n));

      for (char el:characterList) {
          System.out.println();
      }
  }
}
