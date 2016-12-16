package prueba1;

import java.util.Arrays;

public class Profesor extends Persona{
	
	private int idPersona;
	private int idProfesor;
	private int[] idMateria;
	private String Materias;
	private int idAlumno;
	
	
	
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public int getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}
	public int[] getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(int[] idMateria) {
		this.idMateria = idMateria;
	}
	public String getMaterias() {
		return Materias;
	}
	public void setMaterias(String materias) {
		Materias = materias;
	}
	public int getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	@Override
	public String toString() {
		return "Profesor [idPersona=" + idPersona + ", idProfesor="
				+ idProfesor + ", idMateria=" + Arrays.toString(idMateria)
				+ ", Materias=" + Materias + ", idAlumno=" + idAlumno + "]";
	}
	
	


	
	
	
	
}
