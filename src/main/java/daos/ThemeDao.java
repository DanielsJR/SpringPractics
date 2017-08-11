package daos;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Theme;

public interface ThemeDao extends JpaRepository<Theme,Integer>{

}
