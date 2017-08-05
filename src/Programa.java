

public class Programa {

	public static void main(String[] args) {
		
		CarrinhoDeCompras car;
		
		Produto p1 = new Produto(001, "Produto 1", 11.00);
		Produto p2 = new Produto(002, "Produto 2", 11.00);
		Produto p3 = new Produto(003, "Produto 3", 11.00);
		
		car = new CarrinhoDeCompras();
		
		car.adicionaProduto(p1, 2);
		car.adicionaProduto(p2, 2);
		car.adicionaProduto(p3, 2);
		
		System.out.println("Quantidade: " + car.getQuantidadeNoCarrinho());
		System.out.println("Valor Total: R$ " + car.getPrecoTotalCarrinho());
		
		
		
		

	}

}
