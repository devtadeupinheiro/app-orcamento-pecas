package devtadeupinheiro.calculocostura.testes;

import devtadeupinheiro.calculocostura.main.Calculos;
import devtadeupinheiro.calculocostura.model.*;
import devtadeupinheiro.calculocostura.controller.*;
public class CalculosTeste {
	
	public static void main (String[] args) {
		
		var produtoPersistencia = new ProdutoDAO();
		var produtoTeste = new Produto();
		
		produtoTeste.setDescricao("BATA MODELO ABERTA");
		produtoTeste.setMangas("MANGA LONGA");
		produtoTeste.setConsumoTecido("1.4");
		produtoTeste.setConsumoAviamentos("1.22");
		produtoTeste.setCostureira("4.5");
		produtoTeste.setAcabamento("2.18");
		produtoTeste.setFaixasRefletivas("3.3");
		produtoTeste.setGolaPunho("0");
		produtoTeste.setSugestaoPreco("75.9");
		produtoTeste.setOutrasDescricoes("Gola simples, fechamento frontal em 5 bot�es transparentes,"
		+ "com protetor de bot�es, 1 bolso sobreposto no peito esquerdo, 2 bolsos sobrepostos inferiores");
		
		
		produtoPersistencia.inserirProduto(produtoTeste);
		produtoPersistencia.toString();		
		
	}

}
