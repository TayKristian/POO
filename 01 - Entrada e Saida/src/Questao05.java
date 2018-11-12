import java.util.Scanner;
public class Questao05{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o preço da mercadoria");
        double preco = s.nextDouble();
        System.out.println("Digite o percentual de desconto");
        double perc = s.nextDouble();

        double desconto = preco * perc / 100;

        double novo = preco - desconto;

        System.out.println("O desconto foi de R$ " + desconto);
        System.out.println("O valor a ser pago é R$ " + novo);
    }    
}