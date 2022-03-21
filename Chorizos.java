package com.venancio.dam.examen67;

import java.util.Objects;

public class Chorizos extends Embutido{
	final int PRECIO_DE_IBERICO = 12;
	final double PESO_CHOR_MIN = 0.5;

	final double PESO_CHOR_MAX = 2.5;
	final int PRECIO_CHOR_MIN = 5;
	final int PRECIO_CHOR_MAX = 30;
	
	private boolean iberico;
	
	
	public Chorizos(int id) {
		super();
		String marca=generacionMarca();
		int precioChor = generacionRanodmInt(PRECIO_CHOR_MAX, PRECIO_CHOR_MIN);
		double pesoChor = generacionRandomDouble(PESO_CHOR_MIN, PESO_CHOR_MAX);
		if(precioChor>PRECIO_DE_IBERICO)
			this.iberico=true;
		else
			this.iberico=false;
		super.peso=pesoChor;
		super.precio=precioChor;
		super.marca=marca;
		super.id=id;
	}


	public boolean isIberico() {
		return iberico;
	}

	public void setIberico(boolean iberico) {
		this.iberico = iberico;
	}
	@Override
	public int hashCode() {
		return Objects.hash(PESO_CHOR_MAX, PESO_CHOR_MIN, PRECIO_CHOR_MAX, PRECIO_CHOR_MIN, PRECIO_DE_IBERICO, iberico);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chorizos other = (Chorizos) obj;
		return Double.doubleToLongBits(PESO_CHOR_MAX) == Double.doubleToLongBits(other.PESO_CHOR_MAX)
				&& Double.doubleToLongBits(PESO_CHOR_MIN) == Double.doubleToLongBits(other.PESO_CHOR_MIN)
				&& PRECIO_CHOR_MAX == other.PRECIO_CHOR_MAX && PRECIO_CHOR_MIN == other.PRECIO_CHOR_MIN
				&& PRECIO_DE_IBERICO == other.PRECIO_DE_IBERICO && iberico == other.iberico;
	}


	@Override
	public String toString() {
		return "Chorizos [PRECIO_DE_IBERICO=" + PRECIO_DE_IBERICO + ", PESO_CHOR_MIN=" + PESO_CHOR_MIN
				+ ", PESO_CHOR_MAX=" + PESO_CHOR_MAX + ", PRECIO_CHOR_MIN=" + PRECIO_CHOR_MIN + ", PRECIO_CHOR_MAX="
				+ PRECIO_CHOR_MAX + ", iberico=" + iberico + "]";
	}
	
}

