public class Kvadr implements Telseso, Barva {

    private int a,b,c;
    private double objem, povrch;
    private String barva;

    public Kvadr(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void spoctiObjem() {
        objem= (a*b*c);
        System.out.println("Objem kvádru je: " + objem);
    }

    public void spoctiPovrch() {
        povrch=  (2*(a*b+a*c+b*c));
        System.out.println("Povrch kvádru je: " + povrch);

    }

    public void setBarva(String barva){
        barva = "zelená";
    }

    public void vypisBarva(){
        System.out.println(barva);
    }
}
