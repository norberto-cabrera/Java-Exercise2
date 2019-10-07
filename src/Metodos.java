import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Metodos {

	//1.- Constructor that will initialize a class variable.	
	//Declare a variable at class level any type 1points	
	private int a;
	private int b;

	//Metodo Constructor
	public Metodos(int a) {
		this.a = a;
	}

	//Getters and Setters
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}


	//2.- Apply constructor overloading.
	//Create second constructor applying overloading 2points
	public Metodos(int a, int b) {
		this.a = a;
		this.b = b;
	}


	//3.- Apply method overloading.
	//Create one method that prints a sequence of numbers 1points
	public void secuencia() {
		System.out.println("\nSecuencia de Numeros: ");
		for(int i=0;i<=5;i++)
			System.out.println(i);
	}
	public void secuencia(int j) {
		System.out.println("\nSecuencia de Numeros: ");
		for(int i=0;i<=j;i++)
			System.out.println(i);
	}

	//4.- Create a property that returns a string.
	//Create a private string variable 1points
	private String s;

	//Create a get that returns a string for the created variable 2points
	public String getS() {
		return s;
	}

	//Create a set in the same property. 3points
	public void setS(String s) {
		this.s = s;
	}


	//5.- Create a method to separate a list of 20 numbers between odds and even
	public void even_odds() {
		//Create a list inside of the method, list of ints 1points	
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		List<Integer> odds = new  ArrayList<>();
		List<Integer> even = new  ArrayList<>();

		//Use a for to go through the list 2points
		for (int i=0;i<numbers.size();i++){
			//Use of % 2 to check odds and evens 3points
			if (numbers.get(i) %2 == 0) {
				even.add(numbers.get(i));
			}
			else {
				odds.add(numbers.get(i));
			}
		}

		//Store odds and evens in different lists and print them 4points
		for (int i=0;i<even.size();i++) {
			System.out.println("Numero par: " + even.get(i));
		}

		for (int i=0;i<odds.size();i++) {
			System.out.println("Numero Impar: " + odds.get(i));
		}

	}

	//6.- Create a method to print numbers in the following pattern - from 0 to 20
    public void stringBuilderMethod () {
    	//Use of stringbuilder and a for loop 1points
    	StringBuilder str = new StringBuilder();
    	for (int i=0;i<=20;i++) {
    		str.append(i);
    		//Print the numbers in the expected pattern 2points
    	    System.out.println("Valor de Variable StringBuilder: " + str.toString());
    	    str.delete(0, 2);
    	}
    }
}

