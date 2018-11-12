import java.util.Scanner;
public class Questao04{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o salario");
        double salario = s.nextDouble();
        System.out.println("Digite o aumento");
        double perc = s.nextDouble();

        double aumento = salario * perc / 100;
        
        double novo = salario + aumento;
        System.out.println("O novo salario é R$ " + novo);
    }    
}