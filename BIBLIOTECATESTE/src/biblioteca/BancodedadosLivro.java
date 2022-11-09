package biblioteca;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class BancodedadosLivro {

	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("DESENVOLVIMENTO");
	public static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		
		
		System.out.println(emf.isOpen()?"deu certo":"deu errado");
        List <Livro> livros =new ArrayList<>();
		
        Calendar calendar = Calendar.getInstance();
		Livro livro = new Livro();

		livro.setAutor("Joao Cabral de Melo Neto");
		livro.setTitulolivro("Morte e vida severina");
		livro.setDatalocacao(calendar);
		calendar.set(1955, 11, 05);
		livros.add(livro);
		
		Calendar calendarum = Calendar.getInstance();
		Livro livroum = new Livro();
        livroum.setAutor("Ariano Suassuna");
		livroum.setTitulolivro("A pena e a lei");
		livroum.setDatalocacao(calendarum);
		calendarum.set(1971, 5, 05);
		livros.add(livroum);
		
		
		Calendar calendardois = Calendar.getInstance();
		Livro livrodois = new Livro();
        livrodois.setAutor("Ariano Suassuna");
		livrodois.setTitulolivro("A farsa da boa preguiça");
		livrodois.setDatalocacao(calendardois);
		calendardois.set(1961, 6, 28);
		livros.add(livrodois);
		
		
		Calendar calendartres = Calendar.getInstance();
		Livro livrotres = new Livro();
        livrotres.setAutor("Robert Cecil Martim");
		livrotres.setTitulolivro("Codigo Limpo");
		livrotres.setDatalocacao(calendartres);
		calendardois.set(2008, 8, 01);
		livros.add(livrotres);

for (Livro livroForEach:livros) {
	System.out.println(livroForEach.toString());
}

		try {
			em.getTransaction().begin();
			for (Livro livroForEach:livros) {
				em.persist(livroForEach);
			}
			
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.out.println(e);
			em.getTransaction().rollback();
		}finally {
				em.close();
			}
			}
		}
	
	

