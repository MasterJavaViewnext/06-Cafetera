package es.rodal.cafetera;

public class Cafeteria {

	public static void main(String[] args) {

		Cafetera cafetera1 = new Cafetera();
		Cafetera cafetera2 = new Cafetera(100);
		Cafetera cafetera3 = new Cafetera(100,200);
		cafetera1.llenarCafetera();
		cafetera1.servirTaza(122);
		cafetera1.vaciarCafetera();
		cafetera1.agregarCafe(1011);

		System.out.println(cafetera1);
		System.out.println(cafetera2);
		System.out.println(cafetera3);
	}
	
}
