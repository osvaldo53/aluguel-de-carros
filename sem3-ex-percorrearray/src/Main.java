
public class Main {

	public static void main(String[] args) {
		Objetos obj1 = new Objetos(50,53);
		System.out.println(obj1);
		
		System.out.println("---------");
		
		Objetos[] arrayObjetos = new Objetos[4]; //criei array com 4 objetos
		arrayObjetos[0] = new Objetos(10, 20);
		arrayObjetos[1] = new Objetos(40, 80);
		arrayObjetos[2] = new Objetos(100, 20);
		arrayObjetos[3] = new Objetos(140, 200);
		
		for(Objetos elemento: arrayObjetos) {
			System.out.println(elemento);
		}
		
		
	}
}
