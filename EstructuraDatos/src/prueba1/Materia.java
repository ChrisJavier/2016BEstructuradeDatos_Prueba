package prueba1;

public class Materia {

	private String nombreMat;
	private String codigoMat;
	private int idMateria;
	
	
	public String getNombreMat() {
		return nombreMat;
	}
	public void setNombreMat(String nombreMat) {
		this.nombreMat = nombreMat;
	}

	public String getCodigoMat() {
		return codigoMat;
	}
	public void setCodigoMat(String codigoMat) {
		this.codigoMat = codigoMat;
	}
	public int getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}
	@Override
	public String toString() {
		return "Materia [nombreMat=" + nombreMat + ", codigoMat=" + codigoMat
				+ ", idMateria=" + idMateria + "]";
	}


	
	
}
