package pe.edu.upeu.entity;

public class platos {
	private int idplatos;
	private String nombre;
	private String precio;
	private String cantidad;
	public platos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public platos(int idplatos, String nombre, String precio, String cantidad) {
		super();
		this.idplatos = idplatos;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public int getIdplatos() {
		return idplatos;
	}
	public void setIdplatos(int idplatos) {
		this.idplatos = idplatos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	

}
