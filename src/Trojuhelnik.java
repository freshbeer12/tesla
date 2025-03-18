public class Trojuhelnik implements ITvar, Barva {
	private int a, b, c;
	private double obsah, obvod;
	private String barva;
	
	public Trojuhelnik(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void spoctiObsah() {
		obsah = (a + b + c)/2;
	    System.out.println("Obsah trojuhelnika je: " + obsah);
	}

	public void spoctiObvod() {
		obvod =  (a + b + c);
		System.out.println("Obvod trojuhelnika je: " + obvod);
	}
	public void setBarva(String barva){
		this.barva = barva;
	}

	public void vypisBarva(){
		System.out.println(barva);
	}
}
