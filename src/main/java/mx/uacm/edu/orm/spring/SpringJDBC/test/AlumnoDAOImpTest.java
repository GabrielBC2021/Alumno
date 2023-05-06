package mx.uacm.edu.orm.spring.SpringJDBC.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mx.uacm.edu.orm.spring.SpringJDBC.dao.impl.AlumnoDAOImpl;
import mx.uacm.edu.orm.spring.SpringJDBC.dto.AlumnoDTO;

public class AlumnoDAOImpTest {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		
		AlumnoDAOImpl alumnoDAOImpl = (AlumnoDAOImpl)ctx.getBean("alumnoDAOImpl");
		
		AlumnoDTO alumnoDTO = alumnoDAOImpl.read(180110113);
		
		System.out.println("Alumno Record: " + alumnoDTO);
		
//		AlumnoDTO alumnoDTO = new AlumnoDTO();
//		
//		alumnoDTO.setMatricula(10000);
//		alumnoDTO.setNombre("Juan");
//		alumnoDTO.setAp1("Hernandez");
//		alumnoDTO.setAp2("Hernandez");
		
		
//		int result = alumnoDAOImpl.create( alumnoDTO );
//		int result = alumnoDAOImpl.update( alumnoDTO );
//		int result = alumnoDAOImpl.delete( alumnoDTO );
		
//		System.out.println("\n Numero de registros insertados: " + result);
//		
//		System.out.println("Done ...");
	}
}
