import java.util.Scanner;
public class Questao08{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit");
        double f = s.nextDouble();
        
        double c  = (f - 32) / 1.8;
        
        System.out.println("A temperatura em Celsius é " + c);
      
    }    
}