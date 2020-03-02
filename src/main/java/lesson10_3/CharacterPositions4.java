package lesson10_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class CharacterPositions4 {
  public static void main(String[] args) {
    String origin = "Hello World";
    HashMap<Character, List<Integer>> map = new HashMap<>();

    IntStream.range(0, origin.length()).forEach(i -> {
      char c = origin.charAt(i);
      List<Integer> positions = map.getOrDefault(c, new ArrayList<>());
      positions.add(i);
      map.put(c, positions);
    });
      map.forEach((c, n) ->
        System.out.printf("Letter: '%c', positions:%s\n", c, n));


  }
}
