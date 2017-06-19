package Modelos;

public class Pokemon {

	private String Nombre;
	private String Tipo;
	private int numero;
	private int nivelEvolucion;
	private String region;
	private String comentarios;
	
	
	public Pokemon(String nombre, String tipo, int numero, int nivelEvolucion, String region, String comentarios) {
		super();
		this.Nombre = nombre;
		this.Tipo = tipo;
		this.numero = numero;
		this.nivelEvolucion = nivelEvolucion;
		this.region = region;
		this.comentarios = comentarios;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getTipo() {
		return Tipo;
	}


	public void setTipo(String tipo) {
		Tipo = tipo;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getNivelEvolucion() {
		return nivelEvolucion;
	}


	public void setNivelEvolucion(int nivelEvolucion) {
		this.nivelEvolucion = nivelEvolucion;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public String getComentarios() {
		return comentarios;
	}


	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}


	public String getNombre1() {
		// TODO Auto-generated method stub
		return Nombre;
	}


	


	
	
	
	
	
}
