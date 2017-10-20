package com.imfe.ejemploserviceimplementado.model;

import java.util.Random;

public class Hamburguesa implements Comestible {
	
	//Atributos
	private String nombre;
	private boolean queso;
	private boolean bacon;
	private boolean cebolla;
	
	//Constructores
	public Hamburguesa(String nombre,boolean queso,boolean bacon, boolean cebolla) {
		this.nombre=nombre;
		this.queso=queso;
		this.bacon=bacon;
		this.cebolla=cebolla;
	}
		
	public Hamburguesa (String nombre) {
		Random aleatorio=new Random();
		this.nombre=nombre;
		this.queso=aleatorio.nextBoolean();
		this.cebolla=aleatorio.nextBoolean();
		this.bacon=aleatorio.nextBoolean();
		
	}
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isQueso() {
		return queso;
	}

	public void setQueso(boolean queso) {
		this.queso = queso;
	}

	public boolean isBacon() {
		return bacon;
	}

	public void setBacon(boolean bacon) {
		this.bacon = bacon;
	}

	public boolean isCebolla() {
		return cebolla;
	}

	public void setCebolla(boolean cebolla) {
		this.cebolla = cebolla;
	}
	
	@Override
	public String toString(){
		String h="Hamburguesa "+this.nombre;
		
		h+=" con";
		
		if(this.queso) {
			h+=" queso";
		}
		if(this.bacon) {
			h+=" bacon";
		}
		if(this.cebolla) {
			h+=" cebolla";
		}
		if(!this.bacon && !this.cebolla && !this.queso) {
			h+=" nada";
		}
		
		return h;
	}

	@Override
	public double precio() {
		double precioBase=3;
		
		if(this.bacon) {
			precioBase+=0.75;
		}
		if(this.cebolla) {
			precioBase+=0.25;
		}
		if(this.queso) {
			precioBase+=0.5;
		}
		return precioBase;
	}

	@Override
	public String comer() {
		return "�am �am ->" +this.toString();
	}

}
