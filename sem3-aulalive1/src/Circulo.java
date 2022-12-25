
public class Circulo implements Forma {

	private double diametro = 6;
	
	@Override
	public double retornaArea() {
		return Math.PI * Math.pow(this.diametro/2, 2);
	}
	
	
}
