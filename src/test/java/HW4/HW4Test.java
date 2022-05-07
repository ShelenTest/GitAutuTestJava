package HW4;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class HW4Test {

    @Test
    public void positiveTest() throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(6, triangle.aria(3, 4, 5));

    }

    @ParameterizedTest
    @CsvSource({"-3, 4, 5"})
    public void negativeValueTest(int a, int b, int c) throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(6, triangle.aria(a,b,c));
    }

    @ParameterizedTest
    @CsvSource({"0, 4, 5"})
    public void valueIsNullTest(int a, int b, int c) throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(6, triangle.aria(a,b,c));
    }

    @ParameterizedTest
    @CsvSource({"10, 4, 5"})
    public void triangleOrNoTest(int a, int b, int c) throws ExceptionNotTriangle {
        Triangle triangle = new Triangle();
        Assertions.assertTrue(triangle.triangleOrNo(a,b,c));
    }


}
