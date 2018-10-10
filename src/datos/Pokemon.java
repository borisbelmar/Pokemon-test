package datos;

public class Pokemon extends Criatura {
	
	private String strTipo;
	private String strAtaque;
	private int intDamage;
	
	public String getStrTipo() {
		return strTipo;
	}
	public void setStrTipo(String strTipo) {
		this.strTipo = strTipo;
	}
	public String getStrAtaque() {
		return strAtaque;
	}
	public void setStrAtaque(String strAtaque) {
		this.strAtaque = strAtaque;
	}
	public int getIntDamage() {
		return intDamage;
	}
	public void setIntDamage(int intDamage) {
		this.intDamage = intDamage;
	}
	
	public Pokemon() {
		this.setIntId(0);
		this.setStrNombre(null);
		this.setIntVida(100);
		this.setStrTipo(null);
		this.setStrAtaque(null);
		this.setIntDamage(10);
	}
	
	public Pokemon(int id, String nombre, int vida, String tipo, String ataque, int damage) {
		this.setIntId(id);
		this.setStrNombre(nombre);
		this.setIntVida(vida);
		this.setStrTipo(tipo);
		this.setStrAtaque(ataque);
		this.setIntDamage(damage);
	}
	
}
