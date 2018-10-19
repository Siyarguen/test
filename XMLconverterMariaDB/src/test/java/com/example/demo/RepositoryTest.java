package com.example.demo;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import Config.metisimportConfig;
import metisimport.View2;
import metisimport.View2Controller;

@SpringBootTest
@ContextConfiguration(classes=metisimportConfig.class)
@DataJpaTest
public class RepositoryTest {

	@Autowired
	private View2Controller view2Repository;

	@Test
	public void testFindByName() {
		int id = 29615;
		Optional<View2> found = view2Repository.findView2ByIdDokumentImport(id);

		assertNotNull("Objekt mit der id " + id + "gefunden", found);

	}
}
