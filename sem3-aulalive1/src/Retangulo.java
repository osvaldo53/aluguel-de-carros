
public class Retangulo implements Forma {

	private int altura = 10;
	private int largura= 20;
	
	@Override
	public double retornaArea() {
		return this.altura * this.largura;
	}

}
