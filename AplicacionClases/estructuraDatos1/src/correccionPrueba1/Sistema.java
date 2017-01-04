package correccionPrueba1;

import java.util.Random;
import java.util.Scanner;

public class Sistema {

	static String[] nombresAlumnos = {"Alberto", "Ana", "Bernardo", "Carlos", "Carolina","Christian", "Daniela", "Daisy", "Eduardo", "Elisabeth",
			"Enrique", "Fracisca", "Fernando", "Gabriela", "Gladys", "Gabriel", "Gaspar", "Horacio", "Hugo", "Isabel",
			"Juana", "Jorge", "Karla", "Leonidas", "Lara", "Luis",  "Marcelo", "María", "Nancy", "Patricio",
	};

	static String[] apellidosAlumnos = {"Enriquez", "Aguirre", "Maldonado", "Carrera", "Silva","Loachamin", "Yánez", "Yaselga", "Kure", "Plaza",
			"Carrasco", "Ordoñez", "Ortega", "Paredes", "Acurio", "López", "Valverde", "Montenegro", "Morocho", "Mantilla",
			"Cárdenas", "Mancero", "Aldás", "Oña", "Cano", "Yépez", "Cajas", "Yaselga", "Kure", "Plaza",
	};

	static String[] nombresProf = {"Galo", "Marcos", "Juan", "Alicia", "Mercedes"};

	static String[] apellidosProf = {"Peña", "Perez", "Velasquez", "Velastegui", "Lara"};

	static String[] nombresMateria= {"Matemática", "Física", "Química"};

	private static Materia[] materias;

	private static Alumno[] alumnosGeneral; 

	private static Profesor[] profesoresGeneral; 

	public Materia[] getMaterias() {
		return materias;
	}

	public void setMaterias(Materia[] materias) {
		this.materias = materias;
	}
	
	
	public static void main (String[]args){

		Scanner entrada= new Scanner(System.in);
		String entr;
		
		ingresarDatos();
		
		System.out.println("Reportes Institucionales\n 1.Materias por Profesor \n2.Alumnos por Materia \n3.Alumnos por Profesor \nElija una opcion...");
		entr=entrada.nextLine();


		if(entr.equals(" ")){

			System.out.println("No ha seleccionado una opción, ingrese el número de su elección:");

		}
		if(entr.equals("1")){

			materiasPorProfesor(profesoresGeneral[0].getId());

		}else if(entr.equals("2")){


		//alumnosPorMateria(codigoMateria);
		
		}else if(entr.equals("3")){

		//alumnosPorProfesor(idProfesor);
			
		}
			
	}
	

	/*public static String generarCedulas(){

		Random rnd = new Random();
		String cedula = "";

			cedula+=String.valueOf((int) Math.random()*(1999999999-1000000000)+1000000000);

		return cedula;
	}*/



	public static Alumno[] generarAlumnos(Alumno[] alumnos){

		Random rnd = new Random();

		Alumno[] alumnosTemp = new Alumno[20];

		for(int i=0; i<20; i++)
			alumnosTemp[i]=alumnos[rnd.nextInt()*(alumnos.length-1)+0];

		return alumnosTemp;
	}

	public static Profesor[] generarProfesores(Profesor[] profesor){

		Random rnd = new Random();

		Profesor[] profesoresTemp = new Profesor[2];

		for(int i=0; i<20; i++)
			profesoresTemp[i]=profesor[rnd.nextInt()*(profesor.length-1)+0];

		return profesoresTemp;
	}

	public static void ingresarDatos(){

		for(int i=0; i<nombresAlumnos.length;i++){

			Alumno TempAlum= new Alumno((int) (Math.random()*(31-17)+17));

			TempAlum.setNombre1(nombresAlumnos[i]);
			TempAlum.setNombre2(nombresAlumnos[(nombresAlumnos.length-1)-i]);
			TempAlum.setApellido1(apellidosAlumnos[i]);
			TempAlum.setApellido2(apellidosAlumnos[(apellidosAlumnos.length-1)-i]);
			TempAlum.setId(String.valueOf((int) (Math.random()*(1999999999-1000000000)+1000000000)));

			alumnosGeneral[i]=TempAlum;
		}

		for(int i=0; i<nombresProf.length;i++){

			Profesor TempProf= new Profesor((int) (Math.random()*(65-25)+25));

			TempProf.setNombre1(nombresProf[i]);
			TempProf.setNombre2(nombresProf[(nombresProf.length-1)-i]);
			TempProf.setApellido1(apellidosProf[i]);
			TempProf.setApellido2(apellidosProf[(apellidosProf.length-1)-i]);
			TempProf.setId(String.valueOf((int) (Math.random()*(1999999999-1000000000)+1000000000)));

			profesoresGeneral[i]=TempProf;
		}

		Random ran= new Random();
		for(int i=0; i<nombresMateria.length;i++){

			materias[i].setNombre_(nombresMateria[i]);
			materias[i].setCodigo_((int) Math.random()*(1000-100)+100);
			materias[i].setHoras_((int) Math.random()*(3-1)+1);

			materias[i].setAlumnos(generarAlumnos(alumnosGeneral));

			materias[i].setProfesores(generarProfesores(profesoresGeneral));

		}

	}

	public static void materiasPorProfesor(String idProfesor){

		for(int j=0; j<profesoresGeneral.length;j++)
			if(profesoresGeneral[j].getId().equals(idProfesor))
				System.out.println("Profesor: "+profesoresGeneral[j].getNombre1()+ "  "+profesoresGeneral[j].getApellido1());

		for(int i=0; i<materias.length;i++)
			if(materias[i].getProfesores()[i].getId().equals(idProfesor))
				System.out.println(materias[i].getCodigo_()+"   |"+materias[i].getNombre_()+"   |"+materias[i].getHoras_()+"   |");

	}
	

	public static void alumnosPorMateria(int codigoMateria){

		for(int j=0; j<materias.length;j++){
			if(materias[j].getCodigo_()==codigoMateria)
				System.out.println("Materia: "+materias[j].getCodigo_()+"   |"+materias[j].getNombre_()+ "\nAlumnos:\n");

			for(int i=0; i<materias[j].getAlumnos().length;i++){

				System.out.println(materias[j].getAlumnos()[i].getNombre1()+"   |"+materias[j].getAlumnos()[i].getApellido1());

			}

		}
		
	}
	
	public static void alumnosPorProfesor(String idProfesor){

		for(int j=0; j<profesoresGeneral.length;j++)
			if(profesoresGeneral[j].getId().equals(idProfesor))
				System.out.println("Profesor: "+profesoresGeneral[j].getNombre1()+ "  "+profesoresGeneral[j].getApellido1());

		for(int i=0; i<materias.length;i++){
			if(materias[i].getProfesores()[i].getId().equals(idProfesor))
				System.out.println(materias[i].getCodigo_()+"   |"+materias[i].getNombre_()+"   |"+materias[i].getHoras_()+"   |");

			for(int k=0; i<materias[i].getAlumnos().length;k++){

				System.out.println(materias[i].getAlumnos()[k].getNombre1()+"   |"+materias[i].getAlumnos()[k].getApellido1());

			}
			
		}
	}

}
