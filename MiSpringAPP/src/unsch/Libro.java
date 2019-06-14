package unsch;

import org.springframework.stereotype.Component;


@Component
public class Libro {
	
	private int idLibro;
	private String nombre;
	private Autor autor;
	
	
	
	public int getIdLibro() {
		return idLibro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro[idLibro=" + idLibro + ", nombre=" + nombre + ", autor=" + autor + "]";
	
		
	}
	

	public void imprimirAutor() {
		
		System.out.println("Aprendiendo Spring");
	
	}

}
