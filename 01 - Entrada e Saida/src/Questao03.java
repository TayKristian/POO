import java.util.Scanner;
public class Questao03{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os dias");
        int dia = s.nextInt();
        System.out.println("Digite os horas");
        int hor = s.nextInt();
        System.out.println("Digite os minutos");
        int min = s.nextInt();
        System.out.println("Digite os segundos");
        int seg = s.nextInt();

        int total = dia * 86400 + hor * 3600 + min * 60 + seg;

        System.out.println("O tempo total em segundos é " + total);
    }    
}