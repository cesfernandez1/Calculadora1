
/**
 * Write a description of class Calculadora here.
 * 
 * @author  Cesar Fernandes y Adrian Gonzalez
 * @version 26/2/2018
 */



public class Calculadora
{
    // instance variables - replace the example below with your own
    
    private int num1;//Cambiar a double en el futuro para que sea mas preciso
    private double num2;
    private double rdo;
    private Operacion op;

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        //initialise instance variables
        num1 = 0;
        num2 = 0;
        op = op.POTENCIA; 

        
    }
    
    
    
    public void ponNum1(int n1)
    {
        // put your code here
        //Tienemos que añadir en estos dos apartados(ponNum1 y 2) un par de lineas para que pregunter el numero 
      this.num1 = n1;

        
    }
    
    public void ponNum2(double n2)
    {
        // put your code here
             this.num2 = n2;
        
    }

    public void opera()
    {
        switch(op){
            
            case SUMA:
                rdo=num1+num2;
                break;
            case RESTA:
                rdo=num1-num2;
                break;
            case MULTIPLICA:
                rdo=num1*num2;
                break;
            case DIVIDE:
                rdo=num1/num2;
                break;
             case POTENCIA:
                rdo=(int)Math.pow(num1,num2);
                break;
            case RAIZ:
                rdo=(double)Math.pow(num1,1/num2); 
                break;
            case FACTORIAL:
            //En en futuro haremos cambios en los apartados PonNum1, PonNum2 y otros apartados del programa para que solo pregunte 1 numero
                for(int Factorial = 1 ; Factorial <=num1; num1++)
                num1 *= Factorial;
                break;  
            case LOG:
                    rdo=Math.log10(num1);
                    break;
                    

        }
    }
    public void ponOperacion(String opera){
        switch(opera){
        
        case "SUMA":
            op=op.SUMA;
            break;
        case "RESTA":
            op=op.RESTA;
            break;
        case "MULTIPLICA":
            op=op.MULTIPLICA;
            break;
        case "DIVIDE":
            op=op.DIVIDE;
            break;
        case "POTENCIA":
            op=op.POTENCIA;
            break;
        case "RAIZ": 
            op=op.RAIZ;
            break;
         case "FACTORIAL": 
            op=op.RAIZ;
            break;
            case "LOG":
            op=op.RAIZ;
            break;
        }
    }
    public double dameResultado()
    {
        // put your code here
        return rdo;
    }
    
    public void muestraTodosResultados(){
        System.out.println("Num1="+Integer.toString(num1)+" Num2=" + Double.toString(num2));
        System.out.println("Suma :" + Double.toString(num1+num2));
        System.out.println("Resta :"+ Double.toString(num1-num2));
        System.out.println("Multiplica :" + Double.toString(num1*num2));
        System.out.println("Divide :"+ Double.toString(num1/num2)); 
        System.out.println("Potencia:" + Double.toString(rdo=(int)Math.pow(num1,num2))); 
<<<<<<< HEAD
        //Hay que cambiar esta linea(RAIZ) por otra , da resulados erroneos(Probablemente debido al tipo de datos)
        System.out.println("Raiz :" +Double.toString(rdo=(double)Math.pow(num1,1/num2))); 
        //Se añadira la opcion Factorial en el futuro
=======
        //Hay que cambiar esta linea(RAIZ) por otra , da resulados erroneos(Probablemente debido al tipo de datos))
        System.out.println("Raiz :"+ Double.toString(num1,1/num2)); 
        //System.out.println("Factorial :") En proceso de incluir las fatoriales
>>>>>>> 1c410ca4152aa3ef45401789476cb27728439552
        System.out.println("LOG : " +Double.toString(Math.log10(num1)));
    }
}
