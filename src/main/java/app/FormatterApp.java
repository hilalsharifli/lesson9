package app;

import lesson10.Filterer;

public class FormatterApp {
  static void print(String s, Formatter f) {
  }

  public static void main(String[] args) {

    Formatter fmt1 = new Formatter1();
    Formatter fmt2 = new Formatter2();
    Formatter fmt3 = new Formatter3();
    print("hello", fmt1); // hello
    print("hello", fmt2); // HELLO
   // print("hello", fmt3); // ***********
                            // *  HELLO  *
                            // ***********


  }
}
