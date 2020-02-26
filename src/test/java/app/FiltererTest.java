package lesson10;

import lesson10.Filterer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiltererTest {

    @Test
    void filter() {
        String expected = "qzwsx";
        String actual = Filterer.filter("QAZWSX");
        assertEquals(expected,actual);
    }
}