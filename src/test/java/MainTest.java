import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void backwardsTest(){
        //given
        String input = "Hallo";
        //when
        String actual = Main.backwards(input);
        //then
        assertEquals( "ollaH", actual);
    }
    @Test
    void sortTest() {
        //given
        int[] array = {4,3,2,1};
        int[] solut = {1,2,3,4};
        //when
        int[] actual = Main.sort(array);
        //then
        assertArrayEquals(actual, solut);
    }
    @Test
    void toarrayTest() {
        //given
        String test = "hallo";
        char[] solut = {'h', 'a', 'l', 'l', 'o'};
        //when
        char[] actual = Main.toarray(test);
        //then
        assertArrayEquals(actual, solut);
        //TODO: change equalation method
    }
    @Test
    void quersummeTest() {
        //given
        int number = 255;
        //when
        int actual = Main.quersumme(number);
        //then
        assertEquals(9,actual);
    }
}
