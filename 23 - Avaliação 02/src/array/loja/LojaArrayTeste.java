package array.loja;

import java.util.Scanner;

public class LojaArrayTeste {

	public static void main(String[] args) {
		
		Scanner loj = new Scanner(System.in);
		System.out.println("Digite a quantidade de lojas podem ser adicionadas:");
		int quantidade = loj.nextInt();
		LojaArray la = new LojaArray(quantidade);
		Loja loja;
		
		for(;;) {
			System.out.println("Seja Bem Vindo!");
			System.out.println("1 - Inserir loja");
			System.out.println("2 - Remover loja");
			System.out.println("3 - Listar Produtos");
			System.out.println("4 - Pesquisar lojas");
			System.out.println("0 - Finalizar");
			int op = loj.nextInt();
			
			switch (op) {
			case 1:
				System.out.println("Digite o código: ");
				long codigo = loj.nextLong();
				
				System.out.println("Nome: ");
				String nome = loj.next();
				
				System.out.println("Tipo: ");
				String tipo = loj.next();
				
				System.out.println("Proprietário: ");
				String proprietario = loj.next();
				
				loja = new Loja(codigo, nome, tipo, proprietario);
				
				if (la.inserirLoja(loja)) {
					System.out.println("Loja cadastrada com sucesso!");
				} else {
					System.out.println("Lista lotada!");
				}
				
				break;
			
			case 2:
				System.out.println("Digite o código da loja a ser removida: ");
				long codigoRem = loj.nextLong();
				
				loja = new Loja();
				loja.setCodigo(codigoRem);
				
				if (la.removerLoja(loja)) {
					System.out.println("Produto removido!");
				} else {
					System.out.println("Não foi possível remover a loja!");
				}
				
				break;
			case 3:
				Loja lojas[] = la.listarTodos();
				
				if (lojas.length > 0) {
					for (Loja l : lojas) {
						System.out.println(l);
					}
				} else {
					System.out.println("Não existe nenhuma loja cadastrada!");
				}
				
				break;
			
			case 4:
				System.out.println("Digite o nome da loja");
				String nomPesq = loj.next();
				loja = la.pesquisarLoja(nomPesq);
				if (loja != null) {
					System.out.println(loja);
				} else {
					System.out.println("Loja não encontrada!");
				}
				
				break;
				
			case 0:
				System.out.println("Programa finalizado");
				System.exit(0);
				break;

			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}
}