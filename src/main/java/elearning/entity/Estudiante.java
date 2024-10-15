package elearning.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {
	private Long id;
	private String nombre;
	private String eMail;
	private List<Curso> cursos;
}
