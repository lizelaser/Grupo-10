package pe.edu.unsch;


public class Libro {

	private int idLibro;
	private String nombre;

	private Autor autor;

	
	public Libro() {
		super();
	}
	

	public Libro(int idLibro, String nombre) {
		super();
		this.idLibro = idLibro;
		this.nombre = nombre;
	}
	

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
