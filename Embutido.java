package com.venancio.dam.examen67;

import java.util.Random;

public class Embutido {
	protected int id;
	protected double peso;
	protected int precio;
	protected String marca;
	
	public Embutido() {
		
	}
	public Embutido(int id, double peso, int precio, String marca) {
		this.id = id;
		this.peso = peso;
		this.precio = precio;
		this.marca = marca;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	protected String generacionMarca() {
		final String[] MARCAS = {"El pozo", "5j", "Joselito", "Blazquez", "Maximiliano"};
		final int NUM_MARCAS = 5;
		Random rd = new Random();
		return MARCAS[rd.nextInt(NUM_MARCAS)];
		
	}
	protected double generacionRandomDouble(double max, double min) {
		Random rd = new Random();
		double variable = min+(max-min)*rd.nextDouble();
		return variable;
	}
	
	protected int generacionRanodmInt(int max, int min) {
		Random rd = new Random();
		int variable = rd.nextInt(max-min+1)+min;
		return variable;
	}
	@Override
	public String toString() {
		return "Embutido [id=" + id + ", peso=" + peso + ", precio=" + precio + ", marca=" + marca + "]";
	}
	
}
