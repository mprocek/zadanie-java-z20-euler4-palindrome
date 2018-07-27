import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class PalindromeLogicTest {

    private PalindromeLogic palindromeLogic;

    @Before
    public void init(){
        palindromeLogic = new PalindromeLogic();
    }

    @Test
    public void shouldReturnFor10(){
        //given
        int a = 10;

        //when
        int result = palindromeLogic.palindromeCalc(a);

        //then
        assertThat(result, is(9));
    }

    @Test
    public void shouldReturnFor100(){
        //given
        int a = 100;

        //when
        int result = palindromeLogic.palindromeCalc(a);

        //then
        assertThat(result, is(9009));
    }
}
