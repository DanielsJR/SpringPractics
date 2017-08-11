package daos;


import org.springframework.data.jpa.repository.JpaRepository;

import entities.Style;

public interface StyleDao extends JpaRepository<Style,Integer>{

	Style findByNameIgnoreCase(String name);
	 
	
}
