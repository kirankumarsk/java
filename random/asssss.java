package javaapplication11;
import java.util.*;
public class asssss {
	public static void main(String [] args) {
		ArrayList <String> animals = new ArrayList<String>();
		Scanner var = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		
		
		animals.add("Cats");
		animals.add("Dog");
		animals.add("Leopard");
				System.out.println(animals);

				int stop=1;
				while (stop!=0) {
					System.out.println("Enter Animal Name");
					String s = input.nextLine();
					animals.add(s);
					System.out.println("Continue? 1/0");
					stop=var.nextInt();
				}
				System.out.println(animals);
		
		
	}

}
