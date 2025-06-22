import java.util.Scanner;

public class Dia2file { //debe ser publico, clase del mismo nombre del archivo
    public static void main(String[] args){
        System.out.println("Welcome to the number calculator");
/*      Scanner num1 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double finalnum1 = num1.nextDouble();
        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter the second number: ");*/

        //resulta que no es necesario hacer 2 objetos Scanner, puedo usar uno para leer varios datos, lo muestro

        Scanner num = new Scanner(System.in); //aca normal creo el objeto de Scanner "num" ese mismo se usara 2 veces
        System.out.println("Enter the first number: ");//imprimo un mete el primer numero
        double finalnum1 = num.nextDouble();//aca usamos el metodo nextDouble que copia lo que se le DARA y lo guardara en finalnum1
        System.out.println("Enter the second number: ");//imprimo un mete el 2do numero
        double finalnum2 = num.nextDouble();// y aca lo mismo, usamos nextDouble que copia lo que se le DARA en este caso, y lo guardara en finalnum2
        double sumnumber = finalnum1 + finalnum2; //suma los 2 cosos que se le dio y lo guarda en la variable sumnumber
        System.out.println("The sum of the numbers are: " + sumnumber);  //imprime sumnumber
    }
}