package mx.uacm.edu.orm.spring.SpringJDBC.dao;

import mx.uacm.edu.orm.spring.SpringJDBC.dto.AlumnoDTO;

public interface AlumnoDAO {
	
	public int create(AlumnoDTO alumnoDTO);
	
	public int update(AlumnoDTO alumnoDTO);
	
	public int delete(AlumnoDTO alumnoDTO);
	
	public AlumnoDTO read (int matricula);
}

