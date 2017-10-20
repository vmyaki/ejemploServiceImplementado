package com.imfe.ejemploserviceimplementado.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.imfe.ejemploserviceimplementado.model.Hamburguesa;
import com.imfe.ejemploserviceimplementado.model.Hotdog;

@Service
public class ComidaServiceImpl implements ComidaService {

	@Override
	public Hamburguesa serviceHamburguesa() {
		return new Hamburguesa("Hamburguesa desde service");
	}

	@Override
	public Hotdog serviceHotdog() {
		return new Hotdog("Hotdog desde service");
	}

	@Override
	public List<Hamburguesa> serviceHamburguesa(int cantidad) {
		List <Hamburguesa> lista= new ArrayList<Hamburguesa>();
		
		//Por ejemplo, podemos controlar el número de buger pedidas
		if(cantidad<=0) {
			cantidad=Math.abs(cantidad);
		}
		
		//Si pide más de diez, lo capamos a 10, ya que no caben mas de 10 burger en la parrilla
		if(cantidad>10) {
			cantidad=10;
		}
		//Creamos las burger
		for (int i=0; i<=cantidad; i++) {
			lista.add(new Hamburguesa("Nº" +i+1));
		}
		
		return lista;
		
	}

	@Override
	public List<Hotdog> serviceHotdog(int cantidad) {
		
		List<Hotdog> lista=new ArrayList <Hotdog>();
		
		//Así controlamos que no pongan un negativo
		cantidad=Math.abs(cantidad);
		
		//Limitamos el pedido de hotdog a 20
		if(cantidad>20) cantidad=20;
		
		//Hacemos tantos perritos como nos pidan
		for(int i=0; i<cantidad; i++) {
			
			lista.add(new Hotdog ("Nº"+ i+1));
		}
		return lista;
		
		
	}
	
	

}
