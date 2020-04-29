package com.globant.university;

public class Profesor extends Persona {

	private boolean tiempo_completo;
	private double salario_base;
	private double salario;
	private int time;
	private int anos;
	private String tipo;
	public Profesor(String name, int id, double salario_base, int time, boolean tiempo_completo, int anos) {
		super(name, id);
		this.salario_base=salario_base;
		this.tiempo_completo=tiempo_completo;
		this.time=time;
		this.salario=calcularSalario();
		this.anos=anos;
		
		// TODO Auto-generated constructor stub
	}
	public double calcularSalario() {
		if (tiempo_completo == true) {
			salario=(anos*1.10)+salario_base;
			
		}else {
			
			salario=(salario_base*time);
		}
		
		return salario;
		
	}
	
	public int getAnos() {
		return anos;
	}
	public void setAnos(int anos) {
		this.anos = anos;
	}
	public void setSalario_base(double salario_base) {
		this.salario_base = salario_base;
	}
	public String getTiempo_completo() {
		
		if(tiempo_completo == true) {
			tipo="Tiempo Completo";
		}else {
			
			tipo="Medio Tiempo";
		}
		return tipo;
	}
	public void setTiempo_completo(boolean tiempo_completo) {
		this.tiempo_completo = tiempo_completo;
	}
	public double getSalario_base() {
		return salario_base;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	
	
	
}
