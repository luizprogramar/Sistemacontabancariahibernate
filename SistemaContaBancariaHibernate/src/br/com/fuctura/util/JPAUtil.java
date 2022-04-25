package br.com.fuctura.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
	
	//padrão de projeto singleton - vai garantir que eu tenha uma fabrica uma vez
	private static  EntityManagerFactory fabrica = null;
	
	static {
		fabrica = Persistence.createEntityManagerFactory("Fuctura-PU");
		
	}
	
	public static EntityManagerFactory getEntityManagerfactory() {
	
	   if(fabrica == null) {
		   fabrica = Persistence.createEntityManagerFactory("Fuctura-PU");
	   }
	   return fabrica;
}
}
