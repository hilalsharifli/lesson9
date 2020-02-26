package app;

abstract class Formatter {

    public Formatter() {
    }

    String print(String s, Formatter f) {
        System.out.println(s);
        return s;
    }

}
