public class Hlavni {

	public static void main(String[] args) {
		
		//vztvoreni instance trojuhelnika, jehoz strany jsou 2,3 a 4
		Trojuhelnik trojuhelnik = new Trojuhelnik(2, 3, 4);
		
		//zavolani metod objektu Trojuhelnik
		trojuhelnik.spoctiObsah(); 
		trojuhelnik.spoctiObvod();
		

	}

}
