package concreto;

import abstrato.Comida;
import interfaces.Servidor;

public class Restaurante extends Comida implements Servidor{

	Sabor sabor = new Sabor();
	@Override
	public boolean satisfacao(String sabor2) {
		switch(sabor2) {
			case "salgado": {
				sabor.salgado();
				break;
			}
			case "doce": {
				sabor.doce();
				break;
			}
			case "azedo": {
				sabor.azedo();
				break;
			}
			case "amargo": {
				sabor.amargo();
				break;
			}
			default: {
				sabor.desconhecido();
				break;
			}
		}
		return false;
	}

	@Override
	public boolean comerComGarfo(boolean talher) {
		if (talher == true) {
			System.out.println("Cuidado para não se cortar.");
			return true;
		}
		else {
			System.out.println("Pegue com a mão.");
			return false;
		}
	}

	@Override
	public boolean comerComMao(boolean segurar) {
		if (segurar == true) {
			System.out.println("Não deixe cair.");
			return true;
		}
		else {
			System.out.println("Coma com talher.");
			return false;
		}
	}

	@Override
	public float preco(float peso) {
		return (peso * 11.3f);
		
	}

	@Override
	public float preco(float peso, String sabor2) {
		if ((sabor2 == "doce") || (sabor2 == "amargo")) {
			return (peso * 13f);
		} else if ((sabor2 == "amrgo") || (sabor2 == "azedo")){
			return (peso * 9f);
		}
		else {
			return peso * 11.3f;
		}
	}
}
