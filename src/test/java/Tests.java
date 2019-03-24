import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {


    @Test
    public void test() {
        Main main = new Main();
        String result = "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu";
        assertEquals(result, main.accum("ZpglnRxqenU") );
    }

    @Test
    public void test1() {
        Main main = new Main();
        String result = "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc";
        assertEquals(result, main.accum("HbideVbxncC") );
    }

}
