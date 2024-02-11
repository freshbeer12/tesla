public class Trojuhelnik implements ITvar {
	private int a, b, c;
	private double obsah, obvod;
	
	public Trojuhelnik(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void spoctiObsah() {
		double s = (double) (a + b + c)/2;
	    obsah = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	    System.out.println("Obsah trojuhelnika je: " + obsah);
	}

	public void spoctiObvod() {
		obvod =  (a + b + c);
		System.out.println("Obvod trojuhelnika je: " + obvod);
		
	}
}
