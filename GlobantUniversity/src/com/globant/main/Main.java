	package com.globant.main;

import java.util.ArrayList;
import java.util.Scanner;


import com.globant.university.Asignatura;
import com.globant.university.Profesor;
import com.globant.university.Universidad;
import com.globant.init.Init;

public class Main {
	 public static Init inicio = new Init();
	public static Universidad universidad = new Universidad();
	 public static int in=0;
	public static void main(String[] args) {
		 
		// TODO Auto-generated method stub
		if(in==0) {
		inicio.initProfesor();
		inicio.initAsignatura();
		inicio.initestudiante();
		in=1;
		}
		int action;
		int action2;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("----------------------------------------");
	        System.out.println("    MENU PRINCIPAL");
	        System.out.println("----------------------------------------");
			System.out.println("----------------------------------------");
	        System.out.println("Pulse 1 para visualizar profesores");
	        System.out.println("Pulse 2 para visualizar clases");
	        System.out.println("Pulse 3 para crear estudiante");
	        System.out.println("Pulse 4 para Crear Asignatura");
	        System.out.println("Pulse 5 para Listar Estudiantes");
	        System.out.println("Pulse 6 para salir");
			System.out.println("----------------------------------------");
	        action = sc.nextInt();
			
			switch(action) {
			case 1 : 
				universidad.mostrarProfesores();
				break;
			case 2 : 
				universidad.mostrarClases();
				
				break;
			case 3 : 
				
				universidad.crearEstudiante();
	            break;
			
			
			case 4 : 
			
				universidad.crearAsignatura();
            break;
		
		
				
			case 5 : 
				
				universidad.listaEstudiantes();
	            break;
			case 6 : 
				
				System.out.println("Adios");
	            break;
			}
			
			}while(action !=6);
			
			
		//sc.close();
		
		

		
		

	}

}
