package view;

import model.Produto;
import model.Venda;

public class Main {
	public static void main(String[] args) {
		Produto p1 = new Produto("Esmalte", 10.50, 2);
		Produto p2 = new Produto("Creme para pentear", 26.90, 1);
		Produto p3 = new Produto("Gel de Limpeza", 80, 1);
		Produto p4 = new Produto("Lenço Demaquilante", 15.80, 2);
		
		
		Venda venda = new Venda();
		venda.addProduto(p1);
		venda.addProduto(p2);
		venda.addProduto(p3);
		venda.addProduto(p4);
		
		venda.exibirNotaDeVenda();
	}
}
