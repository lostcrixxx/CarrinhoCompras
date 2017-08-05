

public class ProdutoComTamanho extends Produto {

	private int tamanho;
	
	public ProdutoComTamanho(int codigo,String nome, double preco, int tamanho) {
		super(codigo, nome, preco);
		this.tamanho = tamanho;
		
	}

// sobrescrita do método hashCode()
	@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result  + tamanho;
			return result;
		}


//  Sobrescrita do método equals()
	@Override
	public boolean equals(Object object) {
		  if (!(object instanceof ProdutoComTamanho)) // Verifica se o tipo de objeto passado é do tipo ProdutoComTamanho
		    return false;
		  ProdutoComTamanho outroProduto = (ProdutoComTamanho) object;
		  
		 // compara os hashCode
		  if (this.hashCode() == outroProduto.hashCode())
					  return true;
		  else return false;
	}
	
	
	
	
	
	
}
