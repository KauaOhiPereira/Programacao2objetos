package abstrato;

public abstract class Comida {
	private String sabor;
	private boolean talher;
	private boolean segurar;
	private float peso;
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public boolean isTalher() {
		return talher;
	}
	public void setTalher(boolean talher) {
		this.talher = talher;
	}
	public boolean isSegurar() {
		return segurar;
	}
	public void setSegurar(boolean segurar) {
		this.segurar = segurar;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
}
