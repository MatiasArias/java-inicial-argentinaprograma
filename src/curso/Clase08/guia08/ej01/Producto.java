package guia08.ej01;

public class Producto {
	
	private String nombre;
	private float precioUnitario;
	
	public Producto(String nombre, float precioUnitario) {
		this.nombre=nombre;
		this.precioUnitario=precioUnitario;
	}

	public String getNombre() {
		return nombre;
	}

	public float getPrecioUnitario() {
		return precioUnitario;
	}

}
