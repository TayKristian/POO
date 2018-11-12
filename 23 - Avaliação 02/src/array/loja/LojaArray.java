package array.loja;

public class LojaArray {
	
	private Loja[] shopping;
	private int quant;
	
	public LojaArray() {
		shopping = new Loja[10];
		quant = 0;
	}
	
	public LojaArray(int tamanho) {
		shopping = new Loja[tamanho];
		quant = 0;
	}
	
	// inserir
		public boolean inserirLoja(Loja LojaI) {
			if(!estaCheio()) {
				shopping[quant] = LojaI;
				quant++;
				return true;
			}
			return false;
		}
		
		private boolean estaCheio() {
			return quant == shopping.length;		
		}
		
		private int quantLojas() {
			return quant;
		}
		
	// remover
		public boolean removerLoja(Loja codigo) {
			int pos = -1;
			for (int i = 0; i < quant; i++) {
				if (codigo.equals(shopping[i])) {
					pos = i;
					break;
				}
			}
			
			if (pos != -1) {
				for (int i = 0; i < quant; i++) {
					shopping[i] = shopping[i + 1];
				}
				shopping[quant - 1] = null;
				quant--;
				return true;
			}
			return false;
		}
		
	// listar
		public Loja[] listarTodos() {
			Loja novo[] = new Loja[quant];
			
			for (int i = 0; i < quant; i++) {
				novo[i] = shopping[i];
			}
			return novo;
		}
		
	// informar
		public int quantidade() {
			return quant;
		}
		
	// pesquisar
		public Loja pesquisarLoja(String nome) {
			for (int i = 0; i < quant; i++) {
				if (nome == shopping[i].getNome()) {
					return shopping[i];
				}
			}
			return null;
		}
}
