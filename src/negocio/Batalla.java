package negocio;

import datos.Pokemon;

public class Batalla {
	
	public static void atqPokemon(Pokemon pokemon1, Pokemon pokemon2) {
		
		int damage = pokemon2.getIntVida() - pokemon1.getIntDamage();
		
		pokemon2.setIntVida(damage);
		
		System.out.println(pokemon1.getStrNombre() + " ataca a " + pokemon2.getStrNombre() + " con " + pokemon1.getStrAtaque() + " y le hace " + pokemon1.getIntDamage() + " puntos de daño.");
		System.out.println(pokemon2.getStrNombre() + " ahora tiene " + pokemon2.getIntVida() + " puntos de vida.");
		
	}
	
}
