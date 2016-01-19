import org.junit.After;
import org.junit.Before;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by m18 on 14.01.2016.
 */
public class Test {
    @Before
    public void Test() {
        System.out.println("Test Started");
    }

    @org.junit.Test
    public void testAddTwoValues() {

        CalcuTron calc = new CalcuTron();

        assertEquals(4, calc.sqrt(2));


    }

    @org.junit.Test
    public void testSubTwoValues() {

        CalcuTron calc = new CalcuTron();

        assertEquals(-200, calc.sub(500, 700));


    }

    @org.junit.Test
    public void testMultTwoValues() {

        CalcuTron calc = new CalcuTron();

        assertEquals(250, calc.div(500, 2));
    }

    @org.junit.Test
    public void testDivTw() {

        CalcuTron calc = new CalcuTron();

        assertEquals(502, calc.mult(500, 2));
    }







    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!! ");}}





