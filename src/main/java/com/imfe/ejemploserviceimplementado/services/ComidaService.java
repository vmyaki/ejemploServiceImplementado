package com.imfe.ejemploserviceimplementado.services;

import java.util.List;

import com.imfe.ejemploserviceimplementado.model.Hamburguesa;
import com.imfe.ejemploserviceimplementado.model.Hotdog;

public interface ComidaService {
	
	public Hamburguesa serviceHamburguesa();
	public List<Hamburguesa> serviceHamburguesa(int cantidad); //Pedimos una lista de burger
	
	public Hotdog serviceHotdog();
	public List<Hotdog> serviceHotdog(int cantidad);
}
