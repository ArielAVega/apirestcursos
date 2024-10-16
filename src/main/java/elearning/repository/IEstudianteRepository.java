package elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import elearning.entity.Estudiante;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante, Long>{

}
