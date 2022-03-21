package com.venancio.dam.examen67;

import java.util.Objects;

public class Jamones extends Embutido {
	final double PESO_JAM_MIN = 5;
	final double PESO_JAM_MAX = 10;
	final int PRECIO_JAM_MIN = 300;
	final int PRECIO_JAM_MAX = 700;
	

	private double porcentajeIberico;
	private boolean descuento;
	
	public Jamones(int id) {
		super();
		String marca=generacionMarca();
		int precioJAM = generacionRanodmInt(PRECIO_JAM_MAX, PRECIO_JAM_MIN);
		double pesoJAM = generacionRandomDouble(PESO_JAM_MIN, PESO_JAM_MAX);
		if(generacionRanodmInt(1, 0)==1) {
			this.descuento=true;
		} else {
			this.descuento=false;
		}
		int enteroPorcentajeIberico = precioJAM/3;
		this.porcentajeIberico = enteroPorcentajeIberico/10;
		super.peso=pesoJAM;
		super.precio=precioJAM;
		super.marca=marca;
		super.id=id;
	}

	public double getPorcentajeIberico() {
		return porcentajeIberico;
	}
	
	public void setPorcentajeIberico(double porcentajeIberico) {
		this.porcentajeIberico = porcentajeIberico;
	}

	public boolean isDescuento() {
		return descuento;
	}

	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(PESO_JAM_MAX, PESO_JAM_MIN, PRECIO_JAM_MAX, PRECIO_JAM_MIN, descuento, porcentajeIberico);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jamones other = (Jamones) obj;
		return Double.doubleToLongBits(PESO_JAM_MAX) == Double.doubleToLongBits(other.PESO_JAM_MAX)
				&& Double.doubleToLongBits(PESO_JAM_MIN) == Double.doubleToLongBits(other.PESO_JAM_MIN)
				&& PRECIO_JAM_MAX == other.PRECIO_JAM_MAX && PRECIO_JAM_MIN == other.PRECIO_JAM_MIN
				&& descuento == other.descuento
				&& Double.doubleToLongBits(porcentajeIberico) == Double.doubleToLongBits(other.porcentajeIberico);
	}

	@Override
	public String toString() {
		return "Jamones [PESO_JAM_MIN=" + PESO_JAM_MIN + ", PESO_JAM_MAX=" + PESO_JAM_MAX + ", PRECIO_JAM_MIN="
				+ PRECIO_JAM_MIN + ", PRECIO_JAM_MAX=" + PRECIO_JAM_MAX + ", porcentajeIberico=" + porcentajeIberico
				+ ", descuento=" + descuento + "]";
	}
	
	
}
