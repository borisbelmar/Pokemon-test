package presentacion;

import java.util.Scanner;

public class MainApp {
	
	static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		datos.Pokemon charmander = new datos.Pokemon(4, "Charmander", 100, "Fuego", "Arañazo", 10);
		datos.Pokemon holamen = new datos.Pokemon(3, "Holamen", 80, "Pulento", "Hilo", 20);
		
		System.out.println(holamen.getStrNombre() + " tiene " + holamen.getIntVida());
		
		negocio.Batalla.atqPokemon(charmander, holamen);
		negocio.Batalla.atqPokemon(charmander, holamen);
		
	}

}
