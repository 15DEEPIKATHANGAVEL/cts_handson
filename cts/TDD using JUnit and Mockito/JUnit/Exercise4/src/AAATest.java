import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;


public class AAATest {


    Calculator calculator;


    // Setup method
    @Before
    public void setUp(){

        calculator = new Calculator();

        System.out.println("Setup completed");

    }



    // Teardown method
    @After
    public void tearDown(){

        calculator = null;

        System.out.println("Cleanup completed");

    }



    @Test
    public void testAddition(){


        // Arrange
        int a = 10;
        int b = 20;


        // Act
        int result = calculator.add(a,b);


        // Assert
        assertEquals(30,result);


    }



    @Test
    public void testSubtraction(){


        // Arrange
        int a = 20;
        int b = 10;


        // Act
        int result = calculator.subtract(a,b);


        // Assert
        assertEquals(10,result);


    }


}