package com.globant.university;

import java.util.ArrayList;

public class Asignatura {

	private String name;
	private String aula;
	//private int estudiante[];
	private int codigo;
	
	private int profe; 
	
	public Asignatura(String name, String aula, int codigo, int profe) {
		this.name=name;
		this.aula=aula;
		this.codigo=codigo;
		this.profe=profe;
		
		
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getProfe() {
		return profe;
	}

	public void setProfe(int profe) {
		this.profe = profe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	
	

}
