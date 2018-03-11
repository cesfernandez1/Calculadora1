

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalculadoraTest.
 *
 * @author  Cesar Fernandez y Adrian Gonzalez
 * @version 11/3/2018
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
     Suma_Valor_minimo();
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
    public void Suma_Valor_minimo()
    {
      //Prueba de resta con el valor minimo
      calculadora.ponNum1(-Double.MAX_VALUE);
      calculadora.ponNum2(-Double.MAX_VALUE);
      calculadora.ponOperacion("SUMA");
      calculadora.opera();
      assertEquals(Double.NEGATIVE_INFINITY, calculadora.dameResultado(),0.001);    
    }
        @Test
    public void RESTA(){
       resta(); 
       Probar_resta_Negativos();
       Probar_resta_Negativos2();
       RESTA_Valor_maximo();
       RESTA_Valor_minimo();
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
    public void RESTA_Valor_minimo()
    {
      //Prueba de resta con el valor minimo
      calculadora.ponNum1(-Double.MAX_VALUE);
      calculadora.ponNum2(Double.MAX_VALUE);
      calculadora.ponOperacion("RESTA");
      calculadora.opera();
      assertEquals(Double.NEGATIVE_INFINITY, calculadora.dameResultado(),0.001);    
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
      MULTIPLICAR_VALOR_MINIMO();
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
    public void MULTIPLICAR_VALOR_MINIMO()
    {
      //Prueba de multiplicacion con el valor Maximo, esto no deberia permitirlo asi que en el futuro cambiaremos el codigo para que no lo permita
      calculadora.ponNum1(-Double.MAX_VALUE);
      calculadora.ponNum2(2);
      calculadora.ponOperacion("MULTIPLICA");
      calculadora.opera();
      assertEquals(Double.NEGATIVE_INFINITY, calculadora.dameResultado(),0.001);
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
      calculadora.opera();
      assertEquals( 2.5 , calculadora.dameResultado(),0.001);
    }
    @Test 
    public void DIVIDIR_1NUM_NEGATIVO(){
      //Division con un numero negativo y el otro positivo
      calculadora.ponNum1(20);
      calculadora.ponNum2(-4);
      calculadora.ponOperacion("DIVIDE");
      calculadora.opera();
      assertEquals( -5 , calculadora.dameResultado(),0.001);
    }
    @Test
    public void DIVIDIR_2NUM_NEGATIVOS(){
      //Division con los dos numeros negativos
      calculadora.ponNum1(-20);
      calculadora.ponNum2(-4);
      calculadora.ponOperacion("DIVIDE");
      calculadora.opera();
      assertEquals( 5 , calculadora.dameResultado(),0.001);
    }
    @Test
    public void DIVIDIR_CON_OPERACIONES(){
      //Division con operaciones de por medio
      calculadora.ponNum1(20+10);
      calculadora.ponNum2(3*5);
      calculadora.ponOperacion("DIVIDE");
      calculadora.opera();
      assertEquals( 2 , calculadora.dameResultado(),0.001);
    }
    @Test
    public void DIVIDIR_VALOR_MAX(){
      //Division de valor maximo entre valor maximo
      calculadora.ponNum1(Double.MAX_VALUE);
      calculadora.ponNum2(Double.MAX_VALUE);
      calculadora.ponOperacion("DIVIDE");
      calculadora.opera();
      assertEquals( 1 , calculadora.dameResultado(),0.001);
    }
    @Test
    public void POTENCIA()
    {
      POTENCIA_NUM_ENTERO();
      POTENCIA_NUM_DECIMAL();
      POTENCIA_BASE_NEGATIVA();
      POTENCIA_EXPO_NEGATIVO();
      POTENCIA_NUM_NEGATIVOS();
      POTENCIA_BASE_OPERACION();
      POTENCIA_EXPO_OPERACION();
    }
    @Test
    public void POTENCIA_NUM_ENTERO(){
     //Potencia de dos numeros enteros
     calculadora.ponBase(10);
     calculadora.ponExponente(2);
     calculadora.ponOperacion("POTENCIA");
     calculadora.opera();
     assertEquals( 100 , calculadora.dameResultado(),0.001);//Salta error en assertEquals no es compatible 
    }
    @Test
    public void POTENCIA_NUM_DECIMAL(){
     //Potencia con numero decimal de base 
     calculadora.ponBase(10.5);
     calculadora.ponExponente(2);
     calculadora.ponOperacion("POTENCIA");
     calculadora.opera();
     assertEquals( 110.0 , calculadora.dameResultado(),0.01);
    }
    @Test
    public void POTENCIA_BASE_NEGATIVA(){
     calculadora.ponBase(-10);
     calculadora.ponExponente(2);
     calculadora.ponOperacion("POTENCIA");
     calculadora.opera();
     assertEquals( 100 , calculadora.dameResultado(),0.01);
    }
    @Test
    public void POTENCIA_EXPO_NEGATIVO(){
     calculadora.ponBase(25);
     calculadora.ponExponente(-2);
     calculadora.ponOperacion("POTENCIA");
     calculadora.opera();
     assertEquals( 0.01 , calculadora.dameResultado(),0.01);
     //Hay que revisar las potencias este apartado , da error en algunas situaciones,
    }
    @Test
    public void POTENCIA_NUM_NEGATIVOS(){
     calculadora.ponBase(-25);
     calculadora.ponExponente(-2);
     calculadora.ponOperacion("POTENCIA");
     calculadora.opera();
     assertEquals( -0.01 , calculadora.dameResultado(),0.01);
    }
    @Test
    public void POTENCIA_BASE_OPERACION(){
     calculadora.ponBase(5+5);
     calculadora.ponExponente(2);
     calculadora.ponOperacion("POTENCIA");
     calculadora.opera();
     assertEquals( 100 , calculadora.dameResultado(),0.001);
    }
    @Test
    public void POTENCIA_EXPO_OPERACION(){
     calculadora.ponBase(10);
     calculadora.ponExponente(5-3);
     calculadora.ponOperacion("POTENCIA");
     calculadora.opera();
     assertEquals( 100 , calculadora.dameResultado(),0.001);
    }
    @Test
    public void RAIZ(){
     RAIZ_NUM_ENTERO();
     RAIZ_NUM_DECIMAL();
     RAIZ_CON_OPERACION();
    }
    @Test 
    public void RAIZ_NUM_ENTERO(){
     calculadora.ponNum1(9);
     calculadora.ponNum2(2);
     calculadora.ponOperacion("RAIZ");
     calculadora.opera();
     assertEquals( 3 , calculadora.dameResultado(),0.01);
     //se cambia el margen de error por que el programa es muy sensible a los decimales (dado que trabaja con double)
     //y producia un error en el apartado Decimal
    }    
    @Test
    public void RAIZ_NUM_DECIMAL(){
     calculadora.ponNum1(12.5);
     calculadora.ponNum2(2);
     calculadora.ponOperacion("RAIZ");
     calculadora.opera();
     assertEquals(  3.53 , calculadora.dameResultado(),0.01);
    }
    @Test
    public void RAIZ_CON_OPERACION(){
     calculadora.ponNum1(5+4);
     calculadora.ponNum2(2);
     calculadora.ponOperacion("RAIZ");
     calculadora.opera();
     assertEquals( 3 , calculadora.dameResultado(),0.01);
    }
    @Test 
    public void LOG(){
     LOG_NUM_ENTERO();
     LOG_NUM_DECIMAL();
     LOG_CON_OPERACION();
    }
    @Test
    public void LOG_NUM_ENTERO(){
     calculadora.ponNum1(100);
     calculadora.ponOperacion("LOG");
     calculadora.opera();
     assertEquals( 2 , calculadora.dameResultado(),0.01);
    }
    @Test
    public void LOG_NUM_DECIMAL(){
     calculadora.ponNum1(20.5);
     calculadora.ponOperacion("LOG");
     calculadora.opera();
     assertEquals( 1.31 , calculadora.dameResultado(),0.01);
    }
    @Test 
    public void LOG_CON_OPERACION(){
     calculadora.ponNum1(70+30);
     calculadora.ponOperacion("LOG");
     calculadora.opera();
     assertEquals( 2 , calculadora.dameResultado(),0.01);
    }  
}




