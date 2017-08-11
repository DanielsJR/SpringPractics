package daos.impl;

import org.springframework.beans.factory.annotation.Autowired;

import daos.AuthorDao;
import daos.interfaces.AuthorExtended;
import entities.Author;

public class AuthorDaoImpl implements AuthorExtended{
	
	@Autowired
	private AuthorDao autorDao;

	@Override
	public void customMethod(Author autor) {
		this.autorDao.save(autor);
		
	}

}
