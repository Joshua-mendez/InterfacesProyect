package interfacesProject;

public class Main{

	public static void main(String[] args) {
		
	    Triangulo t1 = new Triangulo("Bermudas", 20, 10, 15);
	    Triangulo t = new Triangulo("Triangulo T", 200, 100, 150);
	    
	    Cuadrado c1 = new Cuadrado("Cuadrado", 20);
	    Cuadrado c2 = new Cuadrado("Cuadrado", 30);
	    
	    Rectangulo r1 = new Rectangulo("Rectangulo", 100, 20);
	    Rectangulo r2 = new Rectangulo("Rectangulo", 30, 100);
	    
	    Rombo ro1 = new Rombo("Rombo", 10, 30, 30);
	    Rombo ro2 = new Rombo("Rombo", 20, 40, 40);
	    
	    Romboide rb1 = new Romboide("Romboide", 20, 30);
	    Romboide rb2 = new Romboide("Romboide", 30, 20);
	    
	    Trapecio tr1 = new Trapecio("Trapecio", 20, 30, 30 , 30, 30, 50, 10);
	    Trapecio tr2 = new Trapecio("Trapecio", 20, 50, 25 , 70, 40, 30, 20);
	    
	    
        Main.imprimirCalculos(t1);
        Main.imprimirCalculos(t);
        
        Main.imprimirCalculos(c1);
        Main.imprimirCalculos(c2);
        
        Main.imprimirCalculos(r1);
        Main.imprimirCalculos(r2);
        
        Main.imprimirCalculos(ro1);
        Main.imprimirCalculos(ro2);
        
        Main.imprimirCalculos(rb1);
        Main.imprimirCalculos(rb2);
        
        
	}//Metodo main

	//crear las clases de todas ls figuras
	//interfaz figura geometrica
	//implementar la interfaz en las clases
	public static void imprimirCalculos(FiguraGeometrica t) {
		System.out.println("+-------------------------------------------+");
		System.out.println("| El area de [" + t.getNombre()
				+ "]");
		System.out.println("| es " + t.calcularArea());
		System.out.println("| El perimetro de [" + t.getNombre()
				+ "]");
		System.out.println("| es " + t.calcularPerimetro());
		System.out.println("+-------------------------------------------+");
	}
	
}//class Main
