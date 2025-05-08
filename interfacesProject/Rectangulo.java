package interfacesProject;

public class Rectangulo implements FiguraGeometrica{

	String nombre;
	double base;
	double altura;
	
	
	public Rectangulo(String nombre, double base, double altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}//constructor

	
	public double calcularArea() {
		return (getBase()*getAltura());
	}//calcularAreas
	
	public double calcularPerimetro() {
		return ( (getBase() * 2) + (getAltura() * 2));
	}//calcularPerimetro

	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public double getBase() {
		return base;
	}//getBase

	public void setBase(double base) {
		this.base = base;
	}//setBase

	public double getAltura() {
		return altura;
	}//getAltura

	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura
	
		
}
