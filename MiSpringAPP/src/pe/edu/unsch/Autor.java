package pe.edu.unsch;

import org.springframework.stereotype.Component;

@Component
public class Autor {
	private String nombre;
	private String apellido;
	
	public Autor() {
		super();
	}
	
	
	public Autor(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}


	@Override
	public String toString() {
		return "Autor[nombre ="+nombre+"apellido ="+apellido+"]";
	}

}
