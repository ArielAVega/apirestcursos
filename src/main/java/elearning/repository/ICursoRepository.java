package elearning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import elearning.entity.Curso;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long>{
	List<Curso> findByNombre(String nombre);
}
