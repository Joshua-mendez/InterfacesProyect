package interfacesProject;

public class Trapecio implements FiguraGeometrica{

	String nombre;
	double lado1;
	double lado2;
	double lado3;
	double lado4;
	double baseMenor;
	double baseMayor;
	double altura;
	
	public Trapecio(String nombre, double lado1, double lado2, double lado3, double lado4, double baseMenor,
			double baseMayor, double altura) {
		super();
		this.nombre = nombre;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.baseMenor = baseMenor;
		this.baseMayor = baseMayor;
		this.altura = altura;
	}//constructor

	
	public double calcularArea() {
		return ( ( getAltura() * (getBaseMenor() + getBaseMayor()) ) / 2 );
	}//calcularArea
	
	public double calcularPerimetro() {
		return (getLado1() + getLado2() + getLado3() + getLado4());
	}//calcularPerimetro
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double getLado4() {
		return lado4;
	}

	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getBaseMayor() {
		return baseMayor;
	}

	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	
}//classTrapecio
