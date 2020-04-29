package com.globant.university;

import java.util.ArrayList;

import com.globant.init.*;
public class Estudiante extends Persona {

	private int edad;
	private int asignatura [];
	private ArrayList<Integer> asigna = new ArrayList<>();
	
	public Estudiante(String name, int id, int edad,  ArrayList<Integer> asigna) {
		// TODO Auto-generated constructor stub
		super(name, id);
		this.edad=edad;
		this.asigna=asigna;
	}

	public int[] getAsignatura() {
				
		return asignatura;
	}

	public void setClase(int[] clase) {
		this.asignatura = clase;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<Integer> getAsigna() {
		return asigna;
	}

	public void setAsigna(ArrayList<Integer> asigna) {
		this.asigna = asigna;
	}
	
	public int setAsigna1(int i) {
		//this.asigna = asigna;
		return asigna.get(i);
	}

	public void setAsignatura(int[] asignatura) {
		this.asignatura = asignatura;
	}

	

}
