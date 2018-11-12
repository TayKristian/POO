import java.util.Scanner;
public class Questao07{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius");
        double c = s.nextDouble();
        
        double f = 1.8 * c + 32;
        
        System.out.println("A temperatura em Fahrenheit é " + f + " ºF");
      
    }    
}