public class Hlavni {

	public static void main(String[] args) {
		
		//vztvoreni instance trojuhelnika, jehoz strany jsou 2,3 a 4
		Trojuhelnik trojuhelnik = new Trojuhelnik(2, 3, 4);
		Ctverec ctverec = new Ctverec(6);
		Krychle krychle = new Krychle(8);
		Kvadr kvadr = new Kvadr(10, 6, 4);
		Koule koule = new Koule(6);
		
		//zavolani metod objektu Trojuhelnik
		trojuhelnik.spoctiObsah(); 
		trojuhelnik.spoctiObvod();
		trojuhelnik.setBarva("červená");
		trojuhelnik.vypisBarva();

		ctverec.spoctiObsah();
		ctverec.spoctiObvod();
		ctverec.setBarva("zelená");
		ctverec.vypisBarva();

		krychle.spoctiObjem();
		krychle.spoctiPovrch();
		krychle.setBarva("žůžová");
		krychle.vypisBarva();

		kvadr.spoctiObjem();
		kvadr.spoctiPovrch();
		kvadr.setBarva("modrá");
		kvadr.vypisBarva();

		koule.spoctiObjem();
		koule.spoctiPovrch();
		koule.setBarva("hnědá");
		koule.vypisBarva();

		

	}

}
