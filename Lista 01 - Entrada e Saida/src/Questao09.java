import java.util.Scanner;
public class Questao09{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite os dias alugados");
        int dias = s.nextInt();
        
        System.out.println("Digite os km rodados");
        double km = s.nextDouble(); 
        
        double aluguel = dias * 60 + km * 0.15;
        
        System.out.println("O aluguel do carro é R$ " + aluguel);
        
    }    
}