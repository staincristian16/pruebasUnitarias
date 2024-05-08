
package calculadora;

import java.awt.event.ActionEvent;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CalculatorFrameNGTest {
    
    public CalculatorFrameNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }


    @Test
    public void testSum() {
        CalculatorFrame calculator = new CalculatorFrame();
        calculator.textField.setText("5");
        calculator.num1 = 5;
        calculator.operator = '+';
        calculator.textField.setText("3");
        calculator.num2 = 3;


    }


    @Test
    public void testSubtract() {
        CalculatorFrame calculator = new CalculatorFrame();
        calculator.textField.setText("8");
        calculator.num1 = 8;
        calculator.operator = '-';
        calculator.textField.setText("3");
        calculator.num2 = 3;


    }
    
    @Test
    public void testMultiply() {
        CalculatorFrame calculator = new CalculatorFrame();
        calculator.textField.setText("5");
        calculator.num1 = 5;
        calculator.operator = '*';
        calculator.textField.setText("4");
        calculator.num2 = 4;


    }
    
    @Test
    public void testDivide() {
        CalculatorFrame calculator = new CalculatorFrame();
        calculator.textField.setText("15");
        calculator.num1 = 15;
        calculator.operator = '/';
        calculator.textField.setText("3");
        calculator.num2 = 3;


    }
    
}
