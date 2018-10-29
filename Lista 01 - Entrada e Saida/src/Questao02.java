import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // ctrl + shif + o
		
		System.out.println("Digite o valor em metros");
		double metros = sc.nextDouble();
		
		double mili = metros * 1000;
		
		System.out.println(metros + " m em milimitros é" + mili);
		System.out.printf("%.2f m em milimitros é %.2f mm\n", metros, mili);
		
	}

}
