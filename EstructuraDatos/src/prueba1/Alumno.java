package prueba1;

import java.util.Arrays;

public class Alumno extends Persona{
	
	private int idPersona;
	private int codEstudiante;
	private String Materias;
	private int[] idMateria;
	
	
	@Override
	public String toString() {
		return "Alumno [idPersona=" + idPersona + ", codEstudiante="
				+ codEstudiante + ", Materias=" + Materias + ", idMateria="
				+ Arrays.toString(idMateria) + "]";
	}


	public int getIdPersona() {
		return idPersona;
	}


	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}


	public int getCodEstudiante() {
		return codEstudiante;
	}


	public void setCodEstudiante(int codEstudiante) {
		this.codEstudiante = codEstudiante;
	}


	public String getMaterias() {
		return Materias;
	}


	public void setMaterias(String materias) {
		Materias = materias;
	}


	public int[] getIdMateria() {
		return idMateria;
	}


	public void setIdMateria(int[] idMateria) {
		this.idMateria = idMateria;
	}
	
	

	}	
	
	



