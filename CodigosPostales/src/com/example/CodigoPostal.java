package com.example;

public class CodigoPostal {
	private String codigo;
	private String colonia;
	
	public CodigoPostal(String codigo, String colonia) {
		this.codigo = codigo;
		this.colonia = colonia;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	@Override
	public String toString() {
		return "CodigoPostal [codigo=" + codigo + ", colonia=" + colonia + "]";
	}
	
}
