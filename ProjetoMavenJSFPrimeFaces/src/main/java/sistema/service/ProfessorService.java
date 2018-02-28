package sistema.service;
import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Professor;

public class ProfessorService {

	private ArrayList <Professor> professores = new ArrayList <Professor>();

	public ProfessorService() {
		super();
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void salvar(Professor professor) {
		professores.add(professor);
	}
	
	
	
}
