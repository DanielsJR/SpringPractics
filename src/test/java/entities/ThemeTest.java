package entities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.PersistenceConfig;
import daos.ThemeDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceConfig.class })
public class ThemeTest {

	@Autowired
	private ThemeDao themeDao;

	@Before
	public void populate() {
		for (int i = 0; i < 4; i++) {
			themeDao.save(new Theme("Temazo" + i));
		}
	}

	@Test
	public void testCount() {
		assertEquals(4, themeDao.count());
	}

}
