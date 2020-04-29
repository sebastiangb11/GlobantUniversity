package com.globant.university;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.globant.init.Init;



public class Universidad extends Init{
	
	int action1;
	int busqueda = 99;
	int busqueda2 = 99;
	
	String nombre;
	int id;
	int edad;
	int cod;
	int cod2;
	String aula;
	int profe;
	int estudent=0;

	
	

	
	public void mostrarProfesores() {
		System.out.println("----------------------------------------");
        System.out.println("    LISTA PROFESORES");
        System.out.println("----------------------------------------");
		
		for (int i = 0; i < profesores.size(); i++) {
			
			profesores.get(i).calcularSalario();
			System.out.println("Nombre: "+profesores.get(i).getName()+
								", Salario base: "+profesores.get(i).getSalario_base()+
								", Salario real: "+profesores.get(i).getSalario()+
								", Tipo de profesor: "+profesores.get(i).getTiempo_completo()+
								", Anos de experiencia: "+profesores.get(i).getAnos()+
								" y Horas por semana: "+profesores.get(i).getTime());					
	 }
	}
	
	
	public void mostrarClases() {
		Scanner sc1 = new Scanner(System.in);
		int valor =0;
		System.out.println("----------------------------------------");
        System.out.println("    LISTA ASIGNATURAS");
        System.out.println("----------------------------------------");
		 for (int i = 0; i < asignaturas.size(); i++) {
			 
				System.out.println("Clase: "+asignaturas.get(i).getName()+
						", Aula: "+asignaturas.get(i).getAula()+
						" y Codigo: "+asignaturas.get(i).getCodigo());
		 }
		 
		 System.out.println("----------------------------------------");
	     System.out.println("Ingrese Codigo de la clase");
	     System.out.println("----------------------------------------");
	     
	     action1 = sc1.nextInt();
	     valor=validarClase(action1);
	    
	     if(valor != 99) {
	    	 //System.out.println(validarProfe(asignaturas.get(valor).getProfe()));
	     int profe=validarProfe(asignaturas.get(valor).getProfe());
	     
	     System.out.println("Clase: "+asignaturas.get(valor).getName()+
					", Aula: "+asignaturas.get(valor).getAula()+
					", Codigo: "+asignaturas.get(valor).getCodigo()
					);
	     
	     System.out.println(" Profesor: "+profesores.get(profe).getName());
	     
	     
	     for (int i = 0; i < estudiantes.size(); i++) {
	    	 //System.out.println(valor+"estudian");
	    	 for (int k = 0; k < estudiantes.get(i).getAsigna().size(); k++) {
	    		 
	    		 //System.out.println( estudiantes.get(i).setAsigna1(k)+"clase de studiante");
	    		if(estudiantes.get(i).setAsigna1(k)==valor) {
	    			System.out.println(" Alumno: "+estudiantes.get(i).getName());
	    		}
	    			
	    		    	
	    		    	
	    	 }
	    	// 
	     }
	     }
	}
	
	public int validarClase(int cod) {
		busqueda=99;
		//System.out.println(cod);
		//System.out.println(asignaturas.size());
		for (int i = 0; i < asignaturas.size(); i++) {
			//System.out.println(asignaturas.get(i).getCodigo());
			if(asignaturas.get(i).getCodigo()==cod) {
				busqueda=i;
				//System.out.println(busqueda);
			}
			
		}
		if (busqueda == 99) {
			System.out.println("Clase no existe");
			
			}
			//busqueda=9999;
			
		return busqueda;
	 
		
	}
	
	
	public int validarProfe(int cod) {
		busqueda=99;
		busqueda2=99;
		for (int i = 0; i < profesores.size(); i++) {
			//System.out.println(asignaturas.get(i).getCodigo());
			
			if(profesores.get(i).getId()==cod) {
				busqueda2=i;
				//System.out.println(busqueda2);
			}
			
		}
		
			//busqueda=9999;
			
		return busqueda2;
	 
		
	}
	
	
	
	public void crearEstudiante() {
		ArrayList<Integer> clas = new ArrayList<>();
		
		 clas.clear();
		String respuesta = "no";
        Scanner teclado = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        
		System.out.println("----------------------------------------");
	     System.out.println("Ingrese Nombre del estudiante: ");
	     System.out.println("----------------------------------------");
	     
	     nombre = teclado.nextLine();
	     
	     System.out.println("----------------------------------------");
	     System.out.println("Ingrese ID del estudiante: ");
	     System.out.println("----------------------------------------");
	     
	     id = sca.nextInt();
	     
	     System.out.println("----------------------------------------");
	     System.out.println("Ingrese Edad del estudiante: ");
	     System.out.println("----------------------------------------");
	     
	     edad = sca.nextInt();
		
		 
         
         do {
        	 System.out.println("----------------------------------------");
    	     System.out.println("Ingrese codigo de la clase: ");
    	     System.out.println("----------------------------------------");  
    	     cod = sca.nextInt();
    	     //productos.add(new Product());
    	    cod2=validarClase(cod);
    	    if( validarClase(cod)!= 99) {
    	    	clas.add(cod2);
    	    }
    	     
  
             System.out.println("¿Desea agregar Otra clase?  (si/no)");
             respuesta = teclado.nextLine();
         } while (respuesta.equalsIgnoreCase("si"));
         
         //System.out.println(clas);
         //System.out.println( estudiantes.size());
         estudiantes.add( new Estudiante (nombre,id,edad,clas));
        
         //for (int i = 0; i < estudiantes.size(); i++) {
 			
			//	System.out.println(estudiantes.get(i).getName()+" "+estudiantes.get(i).getEdad()+""+estudiantes.get(i).getAsigna());
				
				//for (int k = 0; k < estudiantes.get(i).getAsigna().size(); k++) {
					//System.out.println(asignaturas.get(estudiantes.get(i).setAsigna1(k)).getName());
					//System.out.println(asignaturas.get(i).getName());
				//}
		// }
         
         
       
        
       
	}
	
	
	
	public void crearAsignatura() {
		
		String respuesta = "no";
        Scanner teclado = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        int cod2=99;
        
		System.out.println("----------------------------------------");
	     System.out.println("Ingrese Nombre de la Asignatura: ");
	     System.out.println("----------------------------------------");
	     
	     nombre = teclado.nextLine();
	     System.out.println("----------------------------------------");
	     System.out.println("Ingrese Aula de la Asignatura: ");
	     System.out.println("----------------------------------------");
	     aula = teclado.nextLine();
	     System.out.println("----------------------------------------");
	     System.out.println("Ingrese Codigo de la Asignatura: ");
	     System.out.println("----------------------------------------");
	     
	     id = sca.nextInt();
	     
	     System.out.println("----------------------------------------");
	     System.out.println("Ingrese ID del profesor: ");
	     System.out.println("----------------------------------------");
	     
	     profe = sca.nextInt();
	     asignaturas.add( new Asignatura (nombre,aula,id  , profe));
	     
	     do {
        	 System.out.println("----------------------------------------");
    	     System.out.println("Ingrese ID del Estudiante: ");
    	     System.out.println("----------------------------------------");  
    	     cod = sca.nextInt();
    	     //productos.add(new Product());
    	    cod2=validarEstudiante(cod);
    	    if( cod2!= 99) {
    	    	//System.out.println(cod2);
    	    	//int puesto= estudiantes.get(cod2).getAsigna().size();
    	    	
    	    	int ubicacion= asignaturas.size()-1;
    	    	//System.out.println(estudiantes.get(cod2).getAsigna());
    	    	
    	    	estudiantes.get(cod2).getAsigna().add(ubicacion);
    	    	
    	    	//clas.add(cod2);
    	    	
    	    }
  
             System.out.println("¿Desea agregar Otra clase?  (si/no)");
             respuesta = teclado.nextLine();
         } while (respuesta.equalsIgnoreCase("si"));
	     
	     
		
	}

	
	public int validarEstudiante(int cod) {
		busqueda=99;
		for (int i = 0; i < estudiantes.size(); i++) {
			//System.out.println(asignaturas.get(i).getCodigo());
			if(estudiantes.get(i).getId()==cod) {
				busqueda=i;
			}
			
		}
		if (busqueda == 99) {
			System.out.println("Estudiante no existe");
			
			}
			//busqueda=9999;
			
		return busqueda;
	}
		public void listaEstudiantes() {
			System.out.println("----------------------------------------");
	        System.out.println("    LISTA ESTUDIANTES");
	        System.out.println("----------------------------------------");
			for (int i = 0; i < estudiantes.size(); i++) {
				
				System.out.println("Nombre : "+estudiantes.get(i).getName()+
						", Edad: "+estudiantes.get(i).getEdad()+
						", Identificacion "+estudiantes.get(i).getId()+
						" y numero de clases inscritas: "+estudiantes.get(i).getAsigna().size());
				for (int k = 0; k < estudiantes.get(i).getAsigna().size(); k++) {
					//System.out.println(estudiantes.get(i).getAsigna().size());
					System.out.println("Clase : "+asignaturas.get(estudiantes.get(i).setAsigna1(k)).getName());
					
				}
				
				
	    	}
		}
	

}
