package correccionPrueba1;

public class Profesor extends Persona{

	public Profesor(int edad) {
		super(edad);
		// TODO Auto-generated constructor stub
	}


	public String getNombre1(){
		
		return super.getNombre1();
		
	}


	@Override
	public String toString() {
		return "[Profesor]: "+ this.getNombre1()+","+this.getNombre2()+","+this.getApellido1()+","+this.getApellido2()+
				this.getEdad();
	}
	
	

	
	
}
