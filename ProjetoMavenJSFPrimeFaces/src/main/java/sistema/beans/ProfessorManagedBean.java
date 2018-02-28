package sistema.beans;

import java.util.List;

import sistema.modelos.Professor;
import sistema.service.ProfessorService;

public class ProfessorManagedBean {

	private Professor prof = new Professor();
	private ProfessorService serv = new ProfessorService();
	
	public void setProf(Professor prof)
	{
		this.prof = prof;
	}
	
	public void salvar()
	{
		serv.salvar(prof);
		prof = new Professor();
	}
	
	public Professor getProfessor()
	{
		return prof;
	}
	
	public List<Professor> getProfessores()
	{
		return serv.getProfessores();
	}
	
	
}
