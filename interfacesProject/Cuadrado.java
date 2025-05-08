package interfacesProject;

public class Cuadrado implements FiguraGeometrica {

	String nombre;
	double lado;
	
	public Cuadrado(String nombre, double lado){
		super();
		this.nombre = nombre;
		this.lado = lado;
	}//constructor
	
	
	public double calcularArea() {
		return(getLado() * getLado());
	}//calculararea
	
	public double calcularPerimetro() {
		return (getLado() * 4);
	}
	

	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public double getLado() {
		return lado;
	}//getLado

	public void setLado(double lado) {
		this.lado = lado;
	}//setLado


	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}
	
	
	
}//class Cuadrado
