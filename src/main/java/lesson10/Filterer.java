package lesson10;

public class Filterer {
    static boolean isVow(char c) {
        final String vowel = "AEIOUaeouui";
        return
                vowel.contains(String.valueOf(c));
    }

    static String filter(String origin) {
        String result = new String();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < origin.length(); i++) {
            char c = origin.charAt(i);
            if (isVow(c)) continue;
            else str.append(c);
            }
        result="" + str;
        return result.toLowerCase();
    }

}
