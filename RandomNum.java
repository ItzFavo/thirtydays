import java.io.InputStream;
import java.util.Scanner;


public class RandomNum{
        public static void main(String[] Args){
        System.out.println("Bienvenido al generador de numeros aleatorios entre 0 y 100");
        int random = (int) (Math.random() * 101); //toca poner el (int) ya que esto le dice, mira se que generas un double, pero quiero que sea int
        System.out.println(random);

        System.out.println("A jugar, Adivina el numero!");

        random = (int) (Math.random() * 101);
        while (true){
                Scanner input = new Scanner(System.in);
                int playerNum = input.nextInt();
        if (playerNum > random){
                System.out.println("menos!");
        } else if (playerNum < random){
                System.out.println("Mas!");
        } else {
                System.out.println("Yees! ese es el numero capo");
                break;
        }}
    }
}