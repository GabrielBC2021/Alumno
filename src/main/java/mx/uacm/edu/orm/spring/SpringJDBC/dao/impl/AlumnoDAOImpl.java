package mx.uacm.edu.orm.spring.SpringJDBC.dao.impl;

import mx.uacm.edu.orm.spring.SpringJDBC.dao.AlumnoDAO;
import mx.uacm.edu.orm.spring.SpringJDBC.dao.rowmapper.AlumnoRowMapper;
import mx.uacm.edu.orm.spring.SpringJDBC.dto.AlumnoDTO;

import org.springframework.jdbc.core.JdbcTemplate;

public class AlumnoDAOImpl implements AlumnoDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public AlumnoDTO read(int matricula) {
		String sql = "select * from alumno where matricula = ?";

		AlumnoRowMapper alumnoRowMapper = new AlumnoRowMapper();
		
		AlumnoDTO alumnoDTO = jdbcTemplate.queryForObject( sql, alumnoRowMapper, matricula );
		
		return alumnoDTO;
	}
	
	@Override
	public int create(AlumnoDTO alumnoDTO) {
		String sql = "insert into alumno values ( ?, ?, ?, ? )";
		
		int resultado = jdbcTemplate.update( sql, alumnoDTO.getMatricula(), alumnoDTO.getNombre(),
				alumnoDTO.getAp1(), alumnoDTO.getAp2());
		
		return resultado;
	}
	
	@Override
	public int update(AlumnoDTO alumnoDTO) {
		String sql = "update alumno set nombre = ?, ap1 = ?, ap2 = ? where matricula = ?";
		
		int resultado = jdbcTemplate.update( sql, alumnoDTO.getNombre(), alumnoDTO.getAp1(), 
											alumnoDTO.getAp2(), alumnoDTO.getMatricula());
		
		return resultado;
	}
	
	@Override
	public int delete(AlumnoDTO alumnoDTO) {
		String sql = "delete from alumno where matricula = ?";
		
		int resultado = jdbcTemplate.update( sql, alumnoDTO.getMatricula()); 
		
		return resultado;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate (JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
