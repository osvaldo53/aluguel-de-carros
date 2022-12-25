
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Objetos obj1 = new Objetos (10);
		obj1.setValor1(20);
		Objetos.setValor2(200);
		
		System.out.println("valores são: " + obj1.getValor1() + " e " + Objetos.getValor2());
		
		Objetos obj2 = new Objetos (11);
		obj2.setValor1(21);
		Objetos.setValor2(201);
		
		System.out.println("valores são: " + obj2.getValor1() + " e " + Objetos.getValor2());
		
		System.out.println("valores são: " + obj1.getValor1() + " e " + Objetos.getValor2());
		
		// quando crio um metodo ou propriedade estatico essas informaçoes nao ficam na instancia do objeto
		// obj1, obj2 etc, mas ficam como globais à classe, nesse caso nem preciso ter uma instancia para acessar 
		// essas propriedades e metodos, por exemplo:
		
		Objetos.setValor2(300);
	}
}
