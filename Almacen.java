package com.venancio.dam.examen67;


public class Almacen {
	final int EJE_X_EST_PRE=5;
	final int EJE_Y_EST_PRE=5;
	private Embutido estanteria[][];
	private int idDelEmb;
	
	public Almacen() {
		this.estanteria = new Embutido[EJE_Y_EST_PRE][EJE_X_EST_PRE]; 
		idDelEmb = 1;
	}
	
	public Almacen(int i, int j) {
		this.estanteria = new Embutido[i][j];
	}

	public Embutido[][] getEstanteria() {
		return estanteria;
	}

	public void setEstanteria(Embutido[][] estanteria) {
		this.estanteria = estanteria;
	}
	
	public boolean agregarProducto() {
		int posY=-1;
		int posX=-1;
		boolean rellenar = false;
		for(int i = 0; i < estanteria.length; i++) {
			for(int j = 0; j < estanteria[i].length; j++) {
				if(estanteria[i][j]==null && rellenar==false) { //mal optimizado
					rellenar = true;
					posY=i;
					posX=j;
				}
			}
		}
		if(rellenar==true) {
			if(idDelEmb%2==0) {
				Jamones js = new Jamones(++idDelEmb);
				estanteria[posY][posX]=js;
				return true;
			} else {
				Chorizos ch = new Chorizos(idDelEmb);
				estanteria[posY][posX]=ch;
				return true;
			}
		}
		return false;
	}


	public void mostrarInfo(){
		for(int i = 0; i < estanteria.length; i++) {
			for(int j = 0; j < estanteria[i].length; j++) {
				System.out.println(estanteria[i][j]);
				}
			}
	}
	
	
	 
	
	
	
}
