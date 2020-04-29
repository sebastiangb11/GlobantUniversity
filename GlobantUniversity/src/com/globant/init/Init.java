package com.globant.init;

import java.util.ArrayList;
import java.util.List;

import com.globant.university.Asignatura;
import com.globant.university.Estudiante;
import com.globant.university.Profesor;

public class Init {
	public static ArrayList<Asignatura> asignaturas = new ArrayList<>();
	public static ArrayList<Profesor> profesores = new ArrayList<>();
	public static ArrayList<Estudiante> estudiantes = new ArrayList<>();
	
	public  ArrayList<Profesor>  initProfesor() {
		
		
		 profesores.add( new Profesor ("Sebastian",001,100,5,true,1));
		 profesores.add( new Profesor ("Catalina",002,200,5,false,2));
		 profesores.add( new Profesor ("Angie",003,300,5,true,3));
		 profesores.add( new Profesor ("Juan Jose",004,400,5,false,4));
		/* for (int i = 0; i < profesores.size(); i++) {
				profesores.get(i).calcularSalario();
				System.out.println(profesores.get(i).calcularSalario()+" "+profesores.get(i).getName()+" "+profesores.get(i).getTiempo_completo());
		 }*/
		return profesores;
		
	}
	
	public static ArrayList<Estudiante>  initestudiante() {
		
		//int estudia[] ;
		//estudia=new int[] {2,3,4}
		ArrayList<Integer> asig = new ArrayList<>();
		asig.add(0);
		asig.add(1);
		asig.add(2);
		
		ArrayList<Integer> asig1 = new ArrayList<>();
		asig1.add(0);
		asig1.add(2);
		asig1.add(3);
		ArrayList<Integer> asig2 = new ArrayList<>();
		asig2.add(0);
		asig2.add(3);
		asig2.add(2);
		ArrayList<Integer> asig3 = new ArrayList<>();
		asig3.add(0);
		asig3.add(2);
		asig3.add(1);
		
		ArrayList<Integer> asig4 = new ArrayList<>();
		asig4.add(0);
		asig4.add(3);
		asig4.add(1);
		ArrayList<Integer> asig5 = new ArrayList<>();
		asig5.add(0);
		asig5.add(2);
		asig5.add(1);
		
		
		
		estudiantes.add( new Estudiante ("Julian",101,20,asig));
		estudiantes.add( new Estudiante ("Nicolas",202,21,asig1));
		estudiantes.add( new Estudiante ("Jhon",303,35,asig2));
		estudiantes.add( new Estudiante ("Felipe",404,40,asig3));
		estudiantes.add( new Estudiante ("Carlos",505,35,asig4));
		estudiantes.add( new Estudiante ("Daniel",606,40,asig5));
		/* for (int i = 0; i < estudiantes.size(); i++) {
			
				System.out.println(estudiantes.get(i).getName()+" "+estudiantes.get(i).getEdad()+""+estudiantes.get(i).getAsigna());
				
				for (int k = 0; k < estudiantes.get(i).getAsigna().size(); k++) {
					System.out.println(asignaturas.get(estudiantes.get(i).setAsigna1(k)).getName());
					System.out.println(asignaturas.get(i).getName());
				}
		 }*/
		return estudiantes;
		
	}
	
	public static ArrayList<Asignatura>  initAsignatura() {
		//ArrayList<Asignatura> asignaturas = new ArrayList<>();
		
		
				 
		asignaturas.add( new Asignatura ("Matematicas","Torre I salon 203",111  , 001));
		asignaturas.add( new Asignatura ("Fisica","Torre II salon 401", 222, 002));
		 asignaturas.add( new Asignatura ("Programacion I","Torre III salon 202",333, 003));
		 asignaturas.add( new Asignatura ("Electiva  I","Torre IV salon 605",444, 004));
		/* for (int i = 0; i < asignaturas.size(); i++) {
			 
				System.out.println(asignaturas.get(i).getName()+" "+asignaturas.get(i).getAula()+" "+asignaturas.get(i).getCodigo());
		 }*/
		return asignaturas;
		
	}
	
	
}
