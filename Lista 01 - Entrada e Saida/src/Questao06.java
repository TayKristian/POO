import java.util.Scanner;
public class Questao06{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a dist�ncia em km");
        double distancia = s.nextDouble();
        System.out.println("Digite a velocidade em km/h");
        double vm = s.nextDouble();

        double tempo = distancia / vm;

        System.out.println("A dist�ncia percorrida foi de " 
        		+ tempo + " horas");
    }    
}