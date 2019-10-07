
public class Principal {

	public static void main(String[] args) {
		
		
		//1.- Constructor that will initialize a class variable.
		//Initialize the variable with the constructor 2points
		Metodos obj = new Metodos(5);
		
		//Print the value of the variable 3points
		System.out.println("El valor de la variable inicializada por el constructor es: " + obj.getA());

		
		//3.- Apply method overloading.
		//Create one method that prints a sequence of numbers 1points
		Metodos obj2 = new Metodos(1);
		obj2.secuencia();
		obj2.secuencia(10);
		
		
		//4.- //Create a property that returns a string.
		Metodos obj3 = new Metodos(1);
		obj3.setS("\nCadena\n");
		System.out.println(obj3.getS());
		
		//5.- Create a method to separate a list of 20 numbers between odds and even
		Metodos obj4 = new Metodos(1);
		obj4.even_odds();
		
		//6.- Create a method to print numbers in the following pattern - from 0 to 20
		Metodos obj5 = new Metodos(1);
		obj5.stringBuilderMethod();
	}

}
