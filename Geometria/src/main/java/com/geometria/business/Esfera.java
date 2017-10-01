package com.geometria.business;

public class Esfera extends Figura{
	
	
	
public float calculaArea(){
		
		Esfera esfera = new Esfera();
		
		float r = esfera.getRadio();
		
		float aT = (float) ((4 * Math.PI)*(r*r));
		
		return aT;
	}

	public float calculaVolumen(){
		
		Esfera esfera = new Esfera();
		
		float r = esfera.getRadio();
		
		float v= (float) ((4 * Math.PI)*(r*r*r)/3);
 
		return v;
	}

}
