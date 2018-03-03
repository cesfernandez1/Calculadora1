

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalculadoraTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CalculadoraTest
{
    /**
     * Default constructor for test class CalculadoraTest
     */
    Calculadora calculadora;
    
    public CalculadoraTest()
    {
      
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
       calculadora = new Calculadora();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void suma(){
      //prueba para ver si suma correctamente
      calculadora.ponNum1(2);
      calculadora.ponNum2(2);
      calculadora.ponOperacion("SUMA");
      calculadora.opera();
      assertEquals(4 , calculadora.dameResultado(),0.1);//dado que trabajamos con double es necesario indicar el margen de error , en este caso es de 0.1
    }
    public void suma(){
        //Prueba de suma con el Num1 negativo
        calculadora.ponNum1(-1);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("SUMA");
        calculador.opera();
        assertEquals(4 , calculadora.dameResultado(),0.1);
    }
    public void resta(){
        //prueba de resta
        calculadora.ponNum1(5);
        calculadora.ponNum2(3);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(2 , calculadora.dameResultado(),0.1);
    }
    public void resta(){
        //prueba de resta con Num1 negativo
        calculadora.ponNum1(-2);
        calculadora.ponNum2(6);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(4 , calculadora.dameResultado(),0.1);
    }
}

    
