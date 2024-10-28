package model;

import java.util.ArrayList;
import java.util.List;

public class Venda {
double total = 0;
	
	private List<Produto> produtos;
	
	public Venda() {
		this.produtos = new ArrayList<>();
	}
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
		
	public double calcularTotalVendas() {
		for(Produto produto : produtos) {
			total +=produto.valorTotal();
		}
		return total;
	}
	
	public void exibirNotaDeVenda() {
		System.out.println("Nota de Venda");
		System.out.println("---------------------------------\n");
		for(Produto produto : produtos) {
			System.out.printf("Produto: %s\n", produto.getNome());
            System.out.printf("Quantidade: %d\n", produto.getQuant());
            System.out.printf("Preço Unitário: R$%.2f\n", produto.getPreco());
			System.out.println("------------------------------- \n");
		}
		System.out.printf("Valor Total da Venda: R$%.2f \n", calcularTotalVendas());
	}
	
}
