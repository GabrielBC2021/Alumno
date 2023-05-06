	package mx.uacm.edu.orm.spring.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTemplateTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		JdbcTemplate jdbcTempBean = (JdbcTemplate)context.getBean("jdbcTemplate");
		
		String sql = "insert into alumno values ( ?, ?, ?, ? )";
		
		int matricula = 180110113;
		String nombre = "Gabriel";
		String ap1 = "Badillo";
		String ap2 = "Castillo";
		
		int resultado = jdbcTempBean.update( sql, matricula, nombre, ap1, ap2 );
		
		System.out.println("\n Numero de registros afectado: " + resultado);
	}

}
