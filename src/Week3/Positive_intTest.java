package Week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestPositiveIntegerTest {

    @Test
    void test1() {
        Positive_int obj = new Positive_int();
        int res = obj.findSmallest("1698");
        assertEquals(res,2);
    }
    @Test
    void test2() {
        Positive_int obj = new Positive_int();
        int res = obj.findSmallest("689345");
        assertEquals(res,1);
    }

}