package mx.uacm.edu.orm.spring.SpringJDBC.dto;

public class AlumnoDTO {
	
	private int matricula;
	private String nombre;
	private String ap1;
	private String ap2;
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAp1() {
		return ap1;
	}

	public void setAp1(String ap1) {
		this.ap1 = ap1;
	}
	
	public String getAp2() {
		return ap2;
	}

	public void setAp2(String ap2) {
		this.ap2 = ap2;
	}

	@Override
	public String toString() {
		return "AlumnoDTO [matricula=" + matricula + ", nombre=" + nombre + ", ap1=" + ap1 + ", ap2=" + ap2 + "]";
	}
	
	
}
