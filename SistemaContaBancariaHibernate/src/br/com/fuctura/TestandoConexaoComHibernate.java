package br.com.fuctura;

import br.com.fuctura.Dao.FilmeDao;
import br.com.fuctura.model.Filme;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TestandoConexaoComHibernate {

	public static void main(String[] args) {
	 
		Filme novoFilme = new Filme();
		
		/*novoFilme.setNome("vingadores");
		novoFilme.setDuracao(120);
		novoFilme.setLinkYT("li/yout");
		novoFilme.setClassificacao(12);*/
		
		Filme f = new Filme();
		
		f.setNome("superman");
		f.setDuracao(120);
		f.setLinkYT("sup/youtb");
		f.setClassificacao(13);
		
		
		FilmeDao dao = new FilmeDao();
		//dao.salvar(novoFilme);
		dao.salvar(f);
		
		Filme f2 = new Filme();
		f2.setClassificacao(15);
		//List<Filme>
	
		
	}

}
