import java.util.Scanner;

public class CtoF {
    public static void main(String[] args){
        System.out.println("Bienvenido al convertidor de C a F");
        Scanner input = new Scanner(System.in);
        System.out.println("Dime los Celcius°");
        if (input.hasNextDouble()){
            double data = input.nextDouble();
            double formula = data * 9/5f + 32f;
            System.out.println(data + "C°" + " in Fahrenheit is " + formula + "°F");
            //aca habia un input.close(); porfa, no abusar, solo una alfinal jeje
        }
        else{
            System.out.println("hermano un numero, numeroooo");
            //aca habia un input.close(); porfa, no abusar, solo una alfinal jeje x2
        }
        input.close();
         // esto es malo ponerlo cuando se usa System.in
        //pero aca solo se usa una vez, asi que mejor cerrarlo :D
    }
}