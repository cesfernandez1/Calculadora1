

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalculadoraTest.
 *
 * @author  Cesar Fernandez y Adrian Gonzalez
 * @version 5/3/2018
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
     //Se creado Suma por si queremos hacer todas las pruebas solo de Suma, de todas formas las pruebas estaran separadas para poder localizar errores con mayor facilidad
     Probar_suma();
     ProbarSuma_decimales();
     ProbarSuma_Negativos();
     ProbarSuma_1Negativo();
     Suma_Valor_maximo();
     ProbarSuma_con_operaciones();
    }
    @Test
    public void Probar_suma(){
      //prueba para ver si suma correctamente
      calculadora.ponNum1(2);
      calculadora.ponNum2(2);
      calculadora.ponOperacion("SUMA");
      calculadora.opera();
      assertEquals(4 , calculadora.dameResultado(),0.001);//dado que trabajamos con double es necesario indicar el margen de error , en este caso es de 0.001
    }
    
      @Test
    public void ProbarSuma_decimales()
    {
      //Prueba de suma con el Num1 negativo
      calculadora.ponNum1(3.2);
      calculadora.ponNum2(4.6);
      calculadora.ponOperacion("SUMA");
      calculadora.opera();
      assertEquals(7.8 , calculadora.dameResultado(),0.001);    
    }
    
    @Test
    public void ProbarSuma_Negativos()
    {
      //Prueba de suma con el Num1 negativo
      calculadora.ponNum1(-3.2);
      calculadora.ponNum2(-4.6);
      calculadora.ponOperacion("SUMA");
      calculadora.opera();
      assertEquals(-7.8 , calculadora.dameResultado(),0.001);    
    }
    
    @Test
    public void ProbarSuma_1Negativo()
    {
      //Prueba de suma con el Num1 negativo
      calculadora.ponNum1(-1);
      calculadora.ponNum2(5);
      calculadora.ponOperacion("SUMA");
      calculadora.opera();
      assertEquals(4 , calculadora.dameResultado(),0.001);    
    }
    @Test
    public void ProbarSuma_con_operaciones()
    {
      //Prueba de suma con el Num1 negativo
      calculadora.ponNum1(-1*2); 
      calculadora.ponNum2(5);
      calculadora.ponOperacion("SUMA");
      calculadora.opera();
      assertEquals(3 , calculadora.dameResultado(),0.001);    
    }
    @Test
    public void Suma_Valor_maximo()
    {
      //Prueba de suma con el MAX_VALUES
      //Tenemos que cambiar el codigo para que no pueda superar el valor maximo
      calculadora.ponNum1(Double.MAX_VALUE);
      calculadora.ponNum2(Double.MAX_VALUE);
      calculadora.ponOperacion("SUMA");
      calculadora.opera();
      assertEquals(Double.POSITIVE_INFINITY, calculadora.dameResultado(),0.001);    
    }
    
    @Test
    public void resta(){
        //prueba de resta
        calculadora.ponNum1(5);
        calculadora.ponNum2(3);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(2 , calculadora.dameResultado(),0.001);
       
    }
    @Test
    public void Probar_resta_Negativos()
    {
        //Prueba de resta con el Num1 negativo
        calculadora.ponNum1(-1);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(-6, calculadora.dameResultado(),0.001);    
    }
    @Test
    public void Probar_resta_Negativos2()
    {
        //Prueba de resta con el Num1 negativo
        calculadora.ponNum1(1);
        calculadora.ponNum2(-5);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(6, calculadora.dameResultado(),0.001);    
    }
     @Test
    public void RESTA_Valor_maximo()
    {
      //Prueba de resta con el MAX_VALUES
      calculadora.ponNum1(Double.MAX_VALUE);
      calculadora.ponNum2(Double.MAX_VALUE);
      calculadora.ponOperacion("RESTA");
      calculadora.opera();
      assertEquals(0, calculadora.dameResultado(),0.001);    
    }
        @Test
    public void MULTIPLICAR()
    { 
      MULTIPLICAR_NUM_ENTEROS();
      MULTIPLICAR_NUM_DECIMALES();
      MULTIPLICAR_NUM_NEGATIVOS();
      MULTIPLICAR_2NUM_NEGATIVOS();
      MULTIPLICAR_CON_OPERACIONES();
      MULTIPLICAR_VALOR_MAX();
        
    }
    @Test
    public void MULTIPLICAR_NUM_ENTEROS()
    {
      //Prueba de multiplicacion con numeros enteros
      calculadora.ponNum1(2);
      calculadora.ponNum2(4);
      calculadora.ponOperacion("MULTIPLICA");
      calculadora.opera();
      assertEquals(8, calculadora.dameResultado(),0.001);    
    }
    @Test
    public void MULTIPLICAR_NUM_DECIMALES()
    {
      //Prueba de multiplicacion con numeros decimales
      calculadora.ponNum1(2.2);
      calculadora.ponNum2(4.4);
      calculadora.ponOperacion("MULTIPLICA");
      calculadora.opera();
      assertEquals(9.68, calculadora.dameResultado(),0.001);    
    }
    @Test
    public void MULTIPLICAR_NUM_NEGATIVOS()
    {
      //Prueba de multiplicacion con un numero negativo
      calculadora.ponNum1(-2.2);
      calculadora.ponNum2(4.4);
      calculadora.ponOperacion("MULTIPLICA");
      calculadora.opera();
      assertEquals(-9.68, calculadora.dameResultado(),0.001);    
    }
    @Test
    public void MULTIPLICAR_2NUM_NEGATIVOS()
    {
      //Prueba de multiplicacion con dos numero negativo
      calculadora.ponNum1(-2.2);
      calculadora.ponNum2(-4.4);
      calculadora.ponOperacion("MULTIPLICA");
      calculadora.opera();
      assertEquals(9.68, calculadora.dameResultado(),0.001);    
    }
    @Test
    public void MULTIPLICAR_CON_OPERACIONES()
    {
      //Prueba de multiplicacion con operaciones dentro del apartado de NUM1 y NUM2
      calculadora.ponNum1(2+6);
      calculadora.ponNum2(2*2);
      calculadora.ponOperacion("MULTIPLICA");
      calculadora.opera();
      assertEquals(32, calculadora.dameResultado(),0.001);    
    }
    @Test
    public void MULTIPLICAR_VALOR_MAX()
    {
      //Prueba de multiplicacion con el valor Maximo, esto no deberia permitirlo asi que en el futuro cambiaremos el codigo para que no lo permita
      calculadora.ponNum1(Double.MAX_VALUE);
      calculadora.ponNum2(Double.MAX_VALUE);
      calculadora.ponOperacion("MULTIPLICA");
      calculadora.opera();
      assertEquals(Double.POSITIVE_INFINITY, calculadora.dameResultado(),0.001);    
    }
    @Test
    public void DIVIDIR()
    { 
      DIVIDIR_NUM_ENTEROS();
      DIVIDIR_NUM_DECIMALES();
      DIVIDIR_1NUM_NEGATIVO();
      DIVIDIR_2NUM_NEGATIVOS();
      DIVIDIR_CON_OPERACIONES();
      DIVIDIR_VALOR_MAX();
    }
    @Test 
    public void DIVIDIR_NUM_ENTEROS()
    {
      //Division de numeros enteros
      calculadora.ponNum1(10);
      calculadora.ponNum2(2);
      calculadora.ponOperacion("DIVIDE");
      calculadora.opera();
      assertEquals(5 , calculadora.dameResultado(),0.001);
    }
    @Test 
    public void DIVIDIR_NUM_DECIMALES()
    {
      //Division con numeros decimales
      calculadora.ponNum1(13.75);
      calculadora.ponNum2(5.5);
      calculadora.ponOperacion("DIVIDE");
      assertEquals( 2.5 , calculadora.dameResultado(),0.001);
    }
    @Test 
    public void DIVIDIR_1NUM_NEGATIVO(){
      //Division con un numero negativo y el otro positivo
      calculadora.ponNum1(20);
      calculadora.ponNum2(-4);
      calculadora.ponOperacion("DIVIDE");
      assertEquals( -5 , calculadora.dameResultado(),0.001);
    }
    @Test
    public void DIVIDIR_2NUM_NEGATIVOS(){
      //Division con los dos numeros negativos
      calculadora.ponNum1(-20);
      calculadora.ponNum2(-4);
      calculadora.ponOperacion("DIVIDE");
      assertEquals( 5 , calculadora.dameResultado(),0.001);
    }
    @Test
    public void DIVIDIR_CON_OPERACIONES(){
      //Division con operaciones de por medio
      calculadora.ponNum1(20+10);
      calculadora.ponNum2(3*5);
      calculadora.ponOperacion("DIVIDE");
      assertEquals( 2 , calculadora.dameResultado(),0.001);
    }
    @Test
    public void DIVIDIR_VALOR_MAX(){
      //Division de valor maximo entre valor maximo
      calculadora.ponNum1(Double.MAX_VALUE);
      calculadora.ponNum2(Double.MAX_VALUE);
      calculadora.ponOperacion("DIVIDE");
      assertEquals( 1 , calculadora.dameResultado(),0.001);
    }
}




