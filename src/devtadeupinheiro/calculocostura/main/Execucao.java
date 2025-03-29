package devtadeupinheiro.calculocostura.main;

import java.math.BigDecimal;
import java.util.Scanner;

import devtadeupinheiro.calculocostura.model.Produto;
import devtadeupinheiro.calculocostura.model.BrimProfissionalPesado;
import devtadeupinheiro.calculocostura.model.CustosPeca;
import devtadeupinheiro.calculocostura.model.EscolhaItem;

public class Execucao {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escolha abaixo qual o item:");
		System.out.println("-------MENU-------");
		System.out.println("1 - BATA" + "\n"
						  + "2 - CAL�A" + "\n"
						  + "3 - CAMISA SOCIAL" + "\n"
						  + "4 - CAL�A SOCIAL" + "\n"
						  + "5 - CAMISA POLO" + "\n"
						  + "6 - CAMISA GOLA CARECA" + "\n");
		int opcao = scan.nextInt();
		StringBuilder escolhaItem = new StringBuilder("");
		escolhaItem.append(opcao);
		
		
		switch (opcao) {
			case 1:
				System.out.println("1 - ABERTA" + "\n" + "2 - POLO" + "\n" + "3 - GOLA V");
				opcao = scan.nextInt();
				escolhaItem.append(opcao);
				break;
		}
		
		switch (opcao) {
			case 1:
			System.out.println("1 - MANGA LONGA" + "\n" + "2 - MANGA CURTA");
			opcao = scan.nextInt();
			escolhaItem.append(opcao);
			break;
		}
		
		
		System.out.println(escolhaItem);
		
		EscolhaItem ei = new EscolhaItem(escolhaItem.toString());
		
		//CRIAR UM LOOP PARA IMPEDIR QUE D� PROBLEMA COM QUANTIDADE NULA, TIPO ERRADO OU ABAIXO DE 10. ABAIXO DE 10 DA ERRO NOS CALCULOS DE CUSTOSPECA
		System.out.println("Qual a quantidade de pe�as?");
		opcao = scan.nextInt();
		
		System.out.println("A pintura da frente s�o quantas cores?" + "\n" + "Digite 0 para nenhuma");
		int pinturaPequena = scan.nextInt();
		
		System.out.println("A pintura das costas s�o quantas cores?" + "\n" + "Digite 0 para nenhuma");
		int pinturaGrande = scan.nextInt();
		
		//calculo bata aberta manga longa
		if (ei.getCodigo().equals("111")) {
			
			var produto = new Produto();
			produto.tipoManga("mangalonga");
			
			var tecido = new BrimProfissionalPesado();
			
			var calculos = new Calculos();
			BigDecimal preco = calculos.calculo(produto.getConsumoTecido(), produto.getConsumoAviamentos(), produto.getCostureira(), tecido);
			System.out.println(preco.toString() + "pre�o");
			
			var custosPeca = new CustosPeca();
			String precoTemp = custosPeca.calculoDespesas(opcao, produto);
			BigDecimal custoCorte = custosPeca.custoCorte(opcao);
			System.out.println(precoTemp);
			
			var custoPintura = new BigDecimal(0);
			custoPintura.add(custosPeca.pinturaMaisCores(pinturaPequena, pinturaGrande));
			System.out.println(custoPintura.toString());
			
			var precoProdutoFinal = new BigDecimal(0);
			precoProdutoFinal = precoProdutoFinal.add(preco);
			precoProdutoFinal = precoProdutoFinal.add(new BigDecimal(precoTemp));
			precoProdutoFinal = precoProdutoFinal.add(custoCorte);
			precoProdutoFinal = precoProdutoFinal.add(custoPintura);
			
			System.out.println(precoProdutoFinal.toString());
		}
		
	}

}
