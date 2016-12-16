package prueba1;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Aplicacion {
	
	String[] nombres = {"Alberto", "Ana", "Bernardo", "Carlos", "Carolina","Christian", "Daniela", "Daisy", "Eduardo", "Elisabeth",
			"Enrique", "Fracisca", "Fernando", "Gabriela", "Gladys", "Gabriel", "Gaspar", "Horacio", "Hugo", "Isabel",
			"Juana", "Jorge", "Karla", "Leonidas", "Lara", "Luis",  "Marcelo", "María", "Nancy", "Patricio",
			"Pedro", "Melisa", "Miriam", "William", "Henry"};

String[] apellidos = {"Enriquez", "Aguirre", "Maldonado", "Carrera", "Silva","Loachamin", "Yánez", "Yaselga", "Kure", "Plaza",
  			  "Carrasco", "Ordoñez", "Ortega", "Paredes", "Acurio", "López", "Valverde", "Montenegro", "Morocho", "Mantilla",
  			  "Cárdenas", "Mancero", "Aldás", "Oña", "Cano", "Yépez", "Cajas", "Yaselga", "Kure", "Plaza",
  			  "Carrasco", "Ordoñez", "Ortega", "Paredes", "Acurio"};

String[] nombresMateria= {"Matemática", "Física", "Química"};

	
	private Alumno [] alumnos = new Alumno[30];
	private Materia [] materias= new Materia[3];
	private Profesor[] profesores= new Profesor[5];
	
	public static void main (String[]args){
		
		Scanner entrada= new Scanner(System.in);
		String entr;
		System.out.println("Reportes iInstitucionales\n 1.Profesores\n2.Alumnos\n3.Materias\nElija una opcion...");
		entr=entrada.nextLine();
		
		
		if(entr.e)
		
		
		
	}
	
public void ingresarDatos(){
		
		int[] idMat1= {1,2};
		int[] idMat2= {0,1};
		int[] idMat3= {0,2};
		
		
		for(int i=0; i<nombres.length-5;i++){
			
			alumnos[i].setNombre(nombres[i]);
			alumnos[i].setApellido(apellidos[i]);
			alumnos[i].setCedula("170234122"+i);
			alumnos[i].setIdPersona(i);
		}
		
		for(int j=nombres.length-5; j<nombres.length;j++){
			
			profesores[j].setNombre(nombres[j]);
			profesores[j].setApellido(apellidos[j]);
			profesores[j].setCedula("176534654"+j);
			profesores[j].setIdPersona(j);
		}
		
		for(int k=0; k<nombresMateria.length; k++){
			
			materias[k].setNombreMat(nombresMateria[k]);
			materias[k].setIdMateria(k);
			materias[k].setCodigoMat("FIS"+32+k);
			
		}
		
		for(int i=0; i<10;i++){
			
			alumnos[i].setIdMateria(idMat1);
		}
		for(int i=10; i<20;i++){
			
			alumnos[i].setIdMateria(idMat2);
		}
		for(int i=20; i<alumnos.length;i++){
	
			alumnos[i].setIdMateria(idMat3);
		}
		
		profesores[0].setIdMateria(idMat1);
		profesores[1].setIdMateria(idMat2);
		profesores[2].setIdMateria(idMat3);
		profesores[3].setIdMateria(idMat1);
		profesores[4].setIdMateria(idMat2);
		
		}
	
	
	public void ImprimirMateriasPro(String CIprofesor, String NomMateria){
		
		
	
		for(int i=0;i<profesores.length;i++){
			if(profesores[i].getCedula().equalsIgnoreCase(CIprofesor)){
				System.out.println(profesores[i].getApellido()+" |"+profesores[i].getNombre());
				
				for(int j=0;j<materias.length;j++){
					if(materias[j].getNombreMat().equalsIgnoreCase(NomMateria) && profesores[i].getIdMateria()[j]==materias[j].getIdMateria())
					{
						for(int k=0;k<alumnos.length;k++)
						{
							if(materias[j].getIdMateria()==alumnos[k].getIdMateria()[k])
								System.out.println( alumnos[i].getCedula() +alumnos[k].getApellido()+"  | "+alumnos[i].getNombre());	
						}
					}
				}
			}
		}
				
			}
				
				
				
public void ImprimirMateriasPorProfe(String NomMateria){
					
					
					
					for(int i=0;i<profesores.length;i++){
						if(materias[i].getNombreMat().equalsIgnoreCase(NomMateria) ){
							System.out.println(materias[i].getCodigoMat()+" |"+materias[i].getNombreMat());
							
							for(int j=0;j<materias.length;j++){
								if(profesores[j].getIdMateria()[j]==materias[i].getIdMateria())
								{
											System.out.println( profesores[j].getCedula() +profesores[j].getApellido()+"  | "+profesores[j].getNombre());	
									
							}
							
							
						}
			
		}
		
	}}

public void ImprimirMateriasAlum(String CIAlumno){
	
	
	
	for(int i=0;i<profesores.length;i++){
		if(alumnos[i].getCedula().equalsIgnoreCase(CIAlumno)){
			System.out.println(alumnos[i].getApellido()+" |"+alumnos[i].getNombre());
			
			for(int j=0;j<materias.length;j++){
				if (alumnos[i].getIdMateria()[j]==materias[j].getIdMateria())
				{
					System.out.println(materias[i].getCodigoMat()+" |"+materias[i].getNombreMat());
					
				}
			}
		}
	}
			
		}


}
