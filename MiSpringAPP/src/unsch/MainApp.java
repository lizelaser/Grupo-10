package unsch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import unsch.Libro;




public class MainApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Libro libro = (Libro) applicationContext.getBean("libro");
		libro.imprimirAutor();
		
		((ClassPathXmlApplicationContext)applicationContext).close();
		System.out.println(libro);
		
		
	}

}
