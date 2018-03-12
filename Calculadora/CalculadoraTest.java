

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalculadoraTest.
 *
 * @author  Cesar Fernandez y Adrian Gonzalez
 * @version 12/3/2018
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
    public void Suma()
    {
        //Caso 1 :prueba para ver si suma correctamente
      calculadora.ponNum1(2);
      calculadora.ponNum2(2);
      calculadora.ponOperacion("SUMA");
      calculadora.opera();
      assertEquals(4 , calculadora.dameResultado(),0.001);
      //dado que trabajamos con double es necesario indicar el margen de error 
      
      //Caso 2:Prueba de suma con el Num1 negativo
      calculadora.ponNum1(3.2);
      calculadora.ponNum2(4.6);
      calculadora.ponOperacion("SUMA");
      calculadora.opera();
      assertEquals(7.8 , calculadora.dameResultado(),0.001); 
      
      //Caso 3:Prueba de suma con el Num1 negativo
      calculadora.ponNum1(-3.2);
      calculadora.ponNum2(-4.6);
      calculadora.ponOperacion("SUMA");
      calculadora.opera();
      assertEquals(-7.8 , calculadora.dameResultado(),0.001);   
            
      //Caso 4:Prueba de suma con el Num1 negativo
      calculadora.ponNum1(-1);
      calculadora.ponNum2(5);
      calculadora.ponOperacion("SUMA");
      calculadora.opera();
      assertEquals(4 , calculadora.dameResultado(),0.001); 
      
      //Caso 5:Prueba de suma con el Num1 negativo
      calculadora.ponNum1(-1*2); 
      calculadora.ponNum2(5);
      calculadora.ponOperacion("SUMA");
      calculadora.opera();
      assertEquals(3 , calculadora.dameResultado(),0.001); 
      
      //Caso 6:Prueba de suma con el MAX_VALUES
      calculadora.ponNum1(Double.MAX_VALUE);
      calculadora.ponNum2(Double.MAX_VALUE);
      calculadora.ponOperacion("SUMA");
      calculadora.opera();
      assertEquals(Double.POSITIVE_INFINITY, calculadora.dameResultado(),0.001); 
      
      //Caso 7:Prueba de resta con el valor minimo
      calculadora.ponNum1(-Double.MAX_VALUE);
      calculadora.ponNum2(-Double.MAX_VALUE);
      calculadora.ponOperacion("SUMA");
      calculadora.opera();
      assertEquals(Double.NEGATIVE_INFINITY, calculadora.dameResultado(),0.001);
    }  
        @Test
    public void RESTA(){
        //Caso 1:prueba de resta
        calculadora.ponNum1(5);
        calculadora.ponNum2(3);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(2 , calculadora.dameResultado(),0.001);
       
        //Caso 2:Prueba de resta con el Num1 negativo
        calculadora.ponNum1(-1);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(-6, calculadora.dameResultado(),0.001);
        
        //Caso 3:Prueba de resta con el Num1 negativo
        calculadora.ponNum1(1);
        calculadora.ponNum2(-5);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(6, calculadora.dameResultado(),0.001);
        
        //Caso 4:Prueba de resta con el MAX_VALUES
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(Double.MAX_VALUE);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(0, calculadora.dameResultado(),0.001); 
        
        //Caso 5:Prueba de resta con el MAX_VALUES
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(Double.MAX_VALUE);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(0, calculadora.dameResultado(),0.001); 
        
        //Caso 6:Prueba de resta con el valor minimo
        calculadora.ponNum1(-Double.MAX_VALUE);
        calculadora.ponNum2(Double.MAX_VALUE);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(Double.NEGATIVE_INFINITY, calculadora.dameResultado(),0.001);
        
        
    }
        @Test
    public void MULTIPLICAR()
    { 
      //Caso 1:Prueba de multiplicacion con numeros enteros
      calculadora.ponNum1(2);
      calculadora.ponNum2(4);
      calculadora.ponOperacion("MULTIPLICA");
      calculadora.opera();
      assertEquals(8, calculadora.dameResultado(),0.001);
      
      //Caso 2:Prueba de multiplicacion con numeros decimales
      calculadora.ponNum1(2.2);
      calculadora.ponNum2(4.4);
      calculadora.ponOperacion("MULTIPLICA");
      calculadora.opera();
      assertEquals(9.68, calculadora.dameResultado(),0.001); 
      
      //Caso 3:Prueba de multiplicacion con un numero negativo
      calculadora.ponNum1(-2.2);
      calculadora.ponNum2(4.4);
      calculadora.ponOperacion("MULTIPLICA");
      calculadora.opera();
      assertEquals(-9.68, calculadora.dameResultado(),0.001);
      
      //Caso 4:Prueba de multiplicacion con dos numero negativo
      calculadora.ponNum1(-2.2);
      calculadora.ponNum2(-4.4);
      calculadora.ponOperacion("MULTIPLICA");
      calculadora.opera();
      assertEquals(9.68, calculadora.dameResultado(),0.001);
      
      //Caso 5:Prueba de multiplicacion con operaciones dentro del apartado de NUM1 y NUM2
      calculadora.ponNum1(2+6);
      calculadora.ponNum2(2*2);
      calculadora.ponOperacion("MULTIPLICA");
      calculadora.opera();
      assertEquals(32, calculadora.dameResultado(),0.001); 
      
      //caso 6:Prueba de multiplicacion con el valor Maximo
      calculadora.ponNum1(Double.MAX_VALUE);
      calculadora.ponNum2(Double.MAX_VALUE);
      calculadora.ponOperacion("MULTIPLICA");
      calculadora.opera();
      assertEquals(Double.POSITIVE_INFINITY, calculadora.dameResultado(),0.001);
      
      //Caso 7:Prueba de multiplicacion con el valor Minimo
      calculadora.ponNum1(-Double.MAX_VALUE);
      calculadora.ponNum2(2);
      calculadora.ponOperacion("MULTIPLICA");
      calculadora.opera();
      assertEquals(Double.NEGATIVE_INFINITY, calculadora.dameResultado(),0.001);
    }

    @Test
    public void DIVIDIR()
    { 
      //Caso 1:Division de numeros enteros
      calculadora.ponNum1(10);
      calculadora.ponNum2(2);
      calculadora.ponOperacion("DIVIDE");
      calculadora.opera();
      assertEquals(5 , calculadora.dameResultado(),0.001);
      
      //Caso 2:Division con numeros decimales
      calculadora.ponNum1(13.75);
      calculadora.ponNum2(5.5);
      calculadora.ponOperacion("DIVIDE");
      calculadora.opera();
      assertEquals( 2.5 , calculadora.dameResultado(),0.001);
      
      //Caso 3:Division con un numero negativo y el otro positivo
      calculadora.ponNum1(20);
      calculadora.ponNum2(-4);
      calculadora.ponOperacion("DIVIDE");
      calculadora.opera();
      assertEquals( -5 , calculadora.dameResultado(),0.001);
      
      //Caso 4:Division con los dos numeros negativos
      calculadora.ponNum1(-20);
      calculadora.ponNum2(-4);
      calculadora.ponOperacion("DIVIDE");
      calculadora.opera();
      assertEquals( 5 , calculadora.dameResultado(),0.001);
      
      //Caso 5:Division con operaciones de por medio
      calculadora.ponNum1(20+10);
      calculadora.ponNum2(3*5);
      calculadora.ponOperacion("DIVIDE");
      calculadora.opera();
      assertEquals( 2 , calculadora.dameResultado(),0.001);
      
      //Caso 6:Division de valor maximo entre valor maximo
      calculadora.ponNum1(Double.MAX_VALUE);
      calculadora.ponNum2(Double.MAX_VALUE);
      calculadora.ponOperacion("DIVIDE");
      calculadora.opera();
      assertEquals( 1 , calculadora.dameResultado(),0.001);
      
      //Caso 7:Divisor mayor que el dividendo
      calculadora.ponNum1(4);
      calculadora.ponNum2(6);
      calculadora.ponOperacion("DIVIDE");
      calculadora.opera();
      assertEquals(0.6666 , calculadora.dameResultado(),0.001);
    }

    @Test
    public void POTENCIA()
    {
     //Caso 1:Potencia de dos numeros enteros
     calculadora.ponBase(10);
     calculadora.ponExponente(2);
     calculadora.ponOperacion("POTENCIA");
     calculadora.opera();
     assertEquals( 100 , calculadora.dameResultado(),0.001);//Salta error en assertEquals no es compatible 
     
     //Caso 2:Potencia con numero decimal de base 
     calculadora.ponBase(10.5);
     calculadora.ponExponente(2);
     calculadora.ponOperacion("POTENCIA");
     calculadora.opera();
     assertEquals( 110.0 , calculadora.dameResultado(),0.01);
     
     //Caso 3: Potencia con base negativa
     calculadora.ponBase(-10);
     calculadora.ponExponente(2);
     calculadora.ponOperacion("POTENCIA");
     calculadora.opera();
     assertEquals( 100 , calculadora.dameResultado(),0.01);
     
     //Caso 4: Potencia con exponente negativa
     calculadora.ponBase(25);
     calculadora.ponExponente(-2);
     calculadora.ponOperacion("POTENCIA");
     calculadora.opera();
     assertEquals( 0.01 , calculadora.dameResultado(),0.01);
     //Hay que revisar las potencias este apartado , da error en algunas situaciones,
     
     //Caso 5: Potencia con base y exponente negativa
     calculadora.ponBase(-25);
     calculadora.ponExponente(-2);
     calculadora.ponOperacion("POTENCIA");
     calculadora.opera();
     assertEquals( -0.01 , calculadora.dameResultado(),0.01);
     
      //Caso 6: Potencia con operaciones en la base
     calculadora.ponBase(5+5);
     calculadora.ponExponente(2);
     calculadora.ponOperacion("POTENCIA");
     calculadora.opera();
     assertEquals( 100 , calculadora.dameResultado(),0.001);
     
      //Caso 7: Potencia con operaciones en la exponente
     calculadora.ponBase(10);
     calculadora.ponExponente(5-3);
     calculadora.ponOperacion("POTENCIA");
     calculadora.opera();
     assertEquals( 100 , calculadora.dameResultado(),0.001);
     
      //Caso 8: Potencia con limetes negativos
     calculadora.ponBase(-Double.MAX_VALUE);
     calculadora.ponExponente(-Double.MAX_VALUE);
     calculadora.ponOperacion("POTENCIA");
     calculadora.opera();
     assertEquals( 0 , calculadora.dameResultado(),0.001);
     
    }
    @Test
    public void RAIZ(){
      //Caso 1: Calcular Raiz
     calculadora.ponNum1(9);
     calculadora.ponNum2(2);
     calculadora.ponOperacion("RAIZ");
     calculadora.opera();
     assertEquals( 3 , calculadora.dameResultado(),0.01);
     //se cambia el margen de error por que el programa es muy sensible a los decimales (dado que trabaja con double)
     //y producia un error en el apartado Decimal
     
     //Caso 2: Calcular Raiz con decimales
     calculadora.ponNum1(12.5);
     calculadora.ponNum2(2);
     calculadora.ponOperacion("RAIZ");
     calculadora.opera();
     assertEquals(  3.53 , calculadora.dameResultado(),0.01);
     
     //Caso 3: Calcular Raiz con operaciones
     calculadora.ponNum1(5+4);
     calculadora.ponNum2(2);
     calculadora.ponOperacion("RAIZ");
     calculadora.opera();
     assertEquals( 3 , calculadora.dameResultado(),0.01);
     
     //Caso 4: Raiz en la que se prueba con limites en la que uno es negativo
     calculadora.ponBase(Double.MAX_VALUE);
     calculadora.ponExponente(-Double.MAX_VALUE);
     calculadora.ponOperacion("POTENCIA");
     calculadora.opera();
     assertEquals( 0 , calculadora.dameResultado(),0.001);
    }
    @Test 
    public void LOG(){
     //Caso 1 :Calcular un logaritmo
     calculadora.ponNum1(100);
     calculadora.ponOperacion("LOG");
     calculadora.opera();
     assertEquals( 2 , calculadora.dameResultado(),0.01);
     
     //Caso 2 :Calcular un logaritmo con decimales
     calculadora.ponNum1(20.5);
     calculadora.ponOperacion("LOG");
     calculadora.opera();
     assertEquals( 1.31 , calculadora.dameResultado(),0.01);
     
     //Caso 3 :Calcular un logaritmo con operaciones
     calculadora.ponNum1(70+30);
     calculadora.ponOperacion("LOG");
     calculadora.opera();
     assertEquals( 2 , calculadora.dameResultado(),0.01);
     
     //Caso 4 :Calcular un logaritmo negativo
     calculadora.ponNum1(-100);
     calculadora.ponOperacion("LOG");
     calculadora.opera();
     //no esperamos resultados pues no existe
     assertEquals( Double.NaN, calculadora.dameResultado(),0.01);
     
     //Caso 4 :Calcular un logaritmo 0
     calculadora.ponNum1(0);
     calculadora.ponOperacion("LOG");
     calculadora.opera();
     //no esperamos resultados pues no existe
     assertEquals( Double.NEGATIVE_INFINITY, calculadora.dameResultado(),0.01);
     
    }  
    
        @Test 
    public void FACTORIAL(){
     //Caso 1 :Calcular un logaritmo
     calculadora.ponNum1(7);
     calculadora.ponOperacion("FACTORIAL");
     calculadora.opera();
     assertEquals( 5040 , calculadora.dameResultado(),0.01);
     
     //Caso 2 :Calcular un logaritmo negativo
     calculadora.ponNum1(-7);
     calculadora.ponOperacion("FACTORIAL");
     calculadora.opera();
     assertEquals( 5040 , calculadora.dameResultado(),0.01);
     
    }
}




