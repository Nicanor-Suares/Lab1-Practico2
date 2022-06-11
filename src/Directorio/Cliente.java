package Directorio;

public class Cliente {

    private long dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;

    public Cliente() {
    }

    public Cliente(long dni, String nombre, String apellido, String ciudad, String direccion) {
	this.dni = dni;
	this.nombre = nombre;
	this.apellido = apellido;
	this.ciudad = ciudad;
	this.direccion = direccion;
    }

    public long getDni() {
	return dni;
    }

    public String getNombre() {
	return nombre;
    }

    public String getApellido() {
	return apellido;
    }

    public String getCiudad() {
	return ciudad;
    }

    public String getDireccion() {
	return direccion;
    }

    public void setDni(long dni) {
	this.dni = dni;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public void setApellido(String apellido) {
	this.apellido = apellido;
    }

    public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
    }

    public void setDireccion(String direccion) {
	this.direccion = direccion;
    }

}
