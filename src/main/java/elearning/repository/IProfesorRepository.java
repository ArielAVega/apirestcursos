package elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import elearning.entity.Profesor;

@Repository
public interface IProfesorRepository extends JpaRepository<Profesor, Long>{

}
