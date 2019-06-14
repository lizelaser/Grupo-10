package unsch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import unsch.Autor;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Autor autor = (Autor) applicationContext.getBean("autor");
		autor.Imprimir();
		
		
		((ClassPathXmlApplicationContext)applicationContext).close();
		System.out.println(autor);
		
		
	}

}
