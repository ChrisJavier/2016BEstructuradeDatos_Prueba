package correccionPrueba1;

public class Alumno extends Persona{
	

		
		public Alumno(int edad) {
		super(edad);
		// TODO Auto-generated constructor stub
	}



		public String getNombre1(){
			
			return super.getNombre1().substring(0,1);
			
		}

	

		@Override
		public String toString() {
			return this.getNombre1()+","+this.getNombre2()+","+this.getApellido1()+","+this.getApellido2()+
					this.getEdad();
		}
		
		

}
