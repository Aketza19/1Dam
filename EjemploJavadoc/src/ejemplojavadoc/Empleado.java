package ejemplojavadoc;

/**
 * 
 * @author Aketza
 * @version 1_2020
 * @since 12/05/2020
 * 
 *
 */
public class Empleado {
	private String nombre;
	private String apellido;
	private double salario; 
/**
 * 
 * @param nombre 
 * @param apellido
 * @param salario
 */

public Empleado(String nombre, String apellido, double salario) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.salario = salario;
}
/**
 * @see 
 * @param subida - cantidad que se sube
 */

public void subirsalario (double subida) {
	salario=salario+subida;
}

/**
 * 
 * @return true si nombre no esta vacio
 */

private boolean comprobar() {
	if (nombre.equals("")) {
		return false;
	}
	return true;
}

}
