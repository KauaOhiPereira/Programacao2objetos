package interfaces;

import abstrato.Comida;

public interface Servidor {
	public boolean satisfacao(String sabor);
	public boolean comerComGarfo(boolean talher);
	public boolean comerComMao(boolean segurar);
	public float preco(float peso);
	public float preco(float peso, String sabor);
	
}
