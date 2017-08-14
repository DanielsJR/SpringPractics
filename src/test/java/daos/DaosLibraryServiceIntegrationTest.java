package daos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Author;
import entities.Book;
import entities.Contact;
import entities.Style;
import entities.Theme;

@Service
public class DaosLibraryServiceIntegrationTest {

	@Autowired
	private AuthorDao authorDao;

	@Autowired
	private StyleDao styleDao;

	@Autowired
	private BookDao bookDao;

	@Autowired
	private ThemeDao themeDao;

	public void populate() {
		Theme[] themeArray = { new Theme("Acción"), new Theme("Suspense"), new Theme("Drama") };
		themeDao.save(Arrays.asList(themeArray));

		Style[] styleArray = { new Style("Infantil", "Lectura sencilla"),
				new Style("Especializado", "Expertos de la temática") };
		styleDao.save(Arrays.asList(styleArray));

		Author[] authorArray = { 
				new Author("Jesús", "Ber", new Contact("j@gmail.com", 666666661), styleArray[0]),
				new Author("Cris", "Ber", new Contact("c@gmail.com", 666666662), styleArray[0]),
				new Author("Ana", "Ber", new Contact("a@gmail.com", 666666663), styleArray[1]),
				new Author("Ana", "Reb", new Contact("a2@gmail.com", 666666663), styleArray[1]),
				new Author("Pedra", "Reb", new Contact("p@gmail.com", 666666664), styleArray[1]),
				new Author("Juana", "Reb", new Contact("j@gmail.com", 666666665), styleArray[1]),
				new Author("Teresa", "Reb", new Contact("t@gmail.com", 666666666), styleArray[1]) };
		authorDao.save(Arrays.asList(authorArray));

		Book[] bookArray = {
				new Book("isbn1", "La flauta", Arrays.asList(authorArray[0]),
						Arrays.asList(themeArray[0], themeArray[2])),
				new Book("isbn2", "La mazorca", Arrays.asList(authorArray[1], authorArray[2]),
						Arrays.asList(themeArray[1])),
				new Book("isbn3", "El pepino", Arrays.asList(authorArray[2]), Arrays.asList(themeArray[0])),
				new Book("isbn4", "El pepino II", Arrays.asList(authorArray[2]), Arrays.asList(themeArray[0])) };
		bookDao.save(Arrays.asList(bookArray));
	}

	public void deleteAll() {
		bookDao.deleteAll();
		themeDao.deleteAll();
		authorDao.deleteAll();
		styleDao.deleteAll();
	}
}
