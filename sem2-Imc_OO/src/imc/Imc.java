package imc;

public class Imc {
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso <= 0) return;
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	private double peso;
	private double altura;
	protected double imc; //protected permite usar na classe herdada
	
	public Imc(double peso, double altura) {
		this.peso = peso; //1o é o peso da classe, 2o é o peso do parametro
		this.altura = altura;
	}
	
	public void calculaImc() {
		this.imc = (this.peso) / (this.altura * this.altura);
	}
	
	public String classificacao() {
		this.calculaImc();
		if (this.imc < 18.5) return "magreza";
		if (this.imc < 24.9) return "normal";
		if (this.imc < 29.9) return "sobrepeso";
		if (this.imc < 39.9) return "obesidade";
		return "obesidade grave";
	}
}
