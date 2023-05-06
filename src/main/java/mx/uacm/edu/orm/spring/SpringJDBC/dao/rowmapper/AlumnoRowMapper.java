package mx.uacm.edu.orm.spring.SpringJDBC.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.uacm.edu.orm.spring.SpringJDBC.dto.AlumnoDTO;

public class AlumnoRowMapper implements RowMapper<AlumnoDTO>{
	
	@Override
	public AlumnoDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		AlumnoDTO alumnoDTO = new AlumnoDTO();
		
		alumnoDTO.setNombre( rs.getString("nombre")	);
		alumnoDTO.setAp1( rs.getString("ap1") );
		alumnoDTO.setAp2( rs.getString("ap2") );
		alumnoDTO.setMatricula( rs.getInt("matricula") );
		
		return alumnoDTO;
	}
}
