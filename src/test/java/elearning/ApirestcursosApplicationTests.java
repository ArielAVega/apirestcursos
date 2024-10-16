package elearning;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import elearning.entity.Curso;
import elearning.repository.ICursoRepository;

@SpringBootTest
class ApirestcursosApplicationTests {
	@Autowired
	private ICursoRepository cursoRepository;
	@Test
	void contextLoads() {
		List<Curso> cursos = cursoRepository.findByNombre("Java");
		//assertTrue(!cursos.isEmpty());
	}

}
