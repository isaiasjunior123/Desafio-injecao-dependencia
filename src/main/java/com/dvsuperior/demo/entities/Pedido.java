package com.dvsuperior.demo.entities;

public class Pedido {

	private Long codigo;
	private double valorBasico;
	private double porcentagemDesconto;
	
	
	public Pedido(Long codigo, double valorBasico, double porcentagemDesconto) {
		this.codigo = codigo;
		this.valorBasico = valorBasico;
		this.porcentagemDesconto = porcentagemDesconto;
	}


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public double getValorBasico() {
		return valorBasico;
	}


	public void setValorBasico(double valorBasico) {
		this.valorBasico = valorBasico;
	}


	public double getPorcentagemDesconto() {
		return porcentagemDesconto;
	}


	public void setPorcentagemDesconto(double porcentagemDesconto) {
		this.porcentagemDesconto = porcentagemDesconto;
	}
	
	
	
	
	

}
