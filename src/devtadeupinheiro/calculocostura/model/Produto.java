package devtadeupinheiro.calculocostura.model;

import java.math.BigDecimal;

public class Produto {
	
	private String descricao;
	private String mangas;
	private String consumoTecido;
	private String consumoAviamentos; //0,60 bot�es+0,44 linha e fio+,18 travetes em 3 bolsos
	private String costureira;
	private String acabamento; // 0,20 limpeza + 6 travetes a 0,03 + 6 bot�es a 0,3
	private String faixasRefletivas;
	private String golaPunho;
	private String sugestaoPreco;
	private String outrasDescricoes;
	
	/*
	private String descricao = "BATA MODELO ABERTA";
	private String mangas;
	private String consumoTecido;
	private String consumoAviamentos = "1.22"; //0,60 bot�es+0,44 linha e fio+,18 travetes em 3 bolsos
	private String costureira = "4.5";
	private String acabamento = "2.18"; // 0,20 limpeza + 6 travetes a 0,03 + 6 bot�es a 0,3
	private String faixasRefletivas = "3.25";
	private String golaPunho = "0";
	private String sugestaoPreco = "75.90";
	private String outrasDescricoes = "Gola simples, fechamento frontal em 5 bot�es transparentes, "
			+ "com protetor de bot�es, 1 bolso sobreposto no peito esquerdo, 2 bolsos sobrepostos inferiores";
	*/
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMangas() {
		return mangas;
	}
	public void setMangas(String mangas) {
		this.mangas = mangas;
	}
	public String getConsumoTecido() {
		return consumoTecido;
	}
	public void setConsumoTecido(String consumoTecido) {
		this.consumoTecido = consumoTecido;
	}
	public String getConsumoAviamentos() {
		return consumoAviamentos;
	}
	public void setConsumoAviamentos(String consumoAviamentos) {
		this.consumoAviamentos = consumoAviamentos;
	}
	public String getCostureira() {
		return costureira;
	}
	public void setCostureira(String costureira) {
		this.costureira = costureira;
	}
	public String getOutrasDescricoes() {
		return outrasDescricoes;
	}
	public void setOutrasDescricoes(String outrasDescricoes) {
		this.outrasDescricoes = outrasDescricoes;
	}
	public String getAcabamento() {
		return acabamento;
	}
	public void setAcabamento(String acabamento) {
		this.acabamento = acabamento;
	}	
	public String getFaixasRefletivas() {
		return faixasRefletivas;
	}
	public void setFaixasRefletivas(String faixasRefletivas) {
		this.faixasRefletivas = faixasRefletivas;
	}	
	public String getSugestaoPreco() {
		return sugestaoPreco;
	}
	public void setSugestaoPreco(String sugestaoPreco) {
		this.sugestaoPreco = sugestaoPreco;
	}
	
	public String getGolaPunho() {
		return golaPunho;
	}
	public void setGolaPunho(String golaPunho) {
		this.golaPunho = golaPunho;
	}
	
	
	public void tipoManga (String manga) {
		
		if (manga == "mangalonga") {
			this.mangas = "MANGA LONGA";
			this.consumoTecido = "1.4";
		} else if (manga == "mangacurta") {
			this.mangas = "MANGA CURTA";
			this.consumoTecido = "1.2";
		} 
		
	}

}
