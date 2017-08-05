

public class Produto {

	private String nome;
	private int codigo;
	private double preco = 0;
	
	public Produto (int codigo, String nome, double preco)
	{
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}
// sobrescrita do método hashCode()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

//  Sobrescrita do método equals()
	@Override
	public boolean equals(Object object) {
		  if (!(object instanceof Produto)) // Verifica se o tipo de objeto passado é do tipo Produto
		    return false;
		  Produto outroProduto = (Produto) object;
		  
		 // compara os hashCode
		  if (this.hashCode() == outroProduto.hashCode())
					  return true;
		  else return false;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}





}


