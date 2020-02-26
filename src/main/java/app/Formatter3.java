package app;

public class Formatter3 extends Formatter {

    @Override
    String print(String s, Formatter f) {
        return super.print(s.toUpperCase(), f);
    }
}
