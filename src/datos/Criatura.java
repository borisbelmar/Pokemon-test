package datos;

public abstract class Criatura {
	
	private int intId;
	private String strNombre;
	private int intVida;
	
	public int getIntId() {
		return intId;
	}
	public void setIntId(int intId) {
		this.intId = intId;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public int getIntVida() {
		return intVida;
	}
	public void setIntVida(int intVida) {
		this.intVida = intVida;
	}
	
}
