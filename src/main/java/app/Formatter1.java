package app;

public class Formatter1 extends Formatter{

    @Override
    String print(String s, Formatter f) {
        return s.toLowerCase();
    }
}

