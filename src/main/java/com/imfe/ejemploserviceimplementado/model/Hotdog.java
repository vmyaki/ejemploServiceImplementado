package com.imfe.ejemploserviceimplementado.model;

import java.util.Random;

public class Hotdog implements Comestible {
	//Atributos
	private String nombre;
	private boolean salsas;
	private boolean cebollaFrita;
	
	//Constructores
	public Hotdog(String nombre, boolean salsas, boolean cebollaFrita) {
		super();
		this.nombre = nombre;
		this.salsas = salsas;
		this.cebollaFrita = cebollaFrita;
	}
	
	public Hotdog(String nombre) {
		Random r=new Random();
		this.nombre = nombre;
		this.salsas = r.nextBoolean();
		this.cebollaFrita = r.nextBoolean();
	}
	
	//M�todos
	//Getters y Setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isSalsas() {
		return salsas;
	}
	public void setSalsas(boolean salsas) {
		this.salsas = salsas;
	}
	public boolean isCebollaFrita() {
		return cebollaFrita;
	}
	public void setCebollaFrita(boolean cebollaFrita) {
		this.cebollaFrita = cebollaFrita;
	}

	
	
	//ToString
	@Override
	public String toString() {
		return "Hotdog [nombre=" + nombre + ", salsas=" + salsas + ", cebollaFrita=" + cebollaFrita + "]";
	}

	@Override
	public double precio() {
		return 0.50;
	}

	@Override
	public String comer() {
		return "�am �am ->" +this.toString();
	}
	
	
	
	
	
}
