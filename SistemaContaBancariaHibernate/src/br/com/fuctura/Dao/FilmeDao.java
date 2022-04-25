 package br.com.fuctura.Dao;

import br.com.fuctura.model.Filme;
import br.com.fuctura.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class FilmeDao {
	
	//estou "injetando" um EntityManagerFactory 
	private EntityManagerFactory fabrica = JPAUtil.getEntityManagerfactory();

	public void salvar(Filme filme) {
		EntityManager em = fabrica.createEntityManager();
		EntityTransaction transacao = em.getTransaction(); 
		
		transacao.begin();
		em.persist(filme);
		transacao.commit();
		em.close();
	}
	
	/*public void excluir(Filme filme) {
		EntityManager em = fabrica.createEntityManager();
		EntityTransaction transacao = em.getTransaction(); 
		
		transacao.begin();
		em.persist(filme);
		transacao.commit();
		
		em.close();
		
	}*/
	
	/*public Filme pesquisar (Filme filme) {
		EntityManager em = fabrica.createEntityManager();
		Filme fi =em.find(Filme.class, filme.getLinkYT());
		em.clear();
		 return fi;
	}*/
	   
	
	
	
	
}
