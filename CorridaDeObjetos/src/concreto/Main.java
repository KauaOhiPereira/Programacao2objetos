package concreto;

public class Main extends Restaurante{
	public static void main(String[] args) {
		Restaurante restaurante = new Restaurante();
		restaurante.satisfacao("doce");
		restaurante.comerComGarfo(true);
		restaurante.comerComMao(false);
		System.out.println(restaurante.preco(0.8f));;
		System.out.println(restaurante.preco(1.4f, "doce"));
	}
}
