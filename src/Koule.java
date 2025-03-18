public class Koule implements Telseso, Barva {

    private int a;
    private double objem, povrch;
    private String barva;

    public Koule(int a) {
        this.a = a;
    }

    public void spoctiObjem() {
        objem= (4/3*Math.PI*(a*a*a));
        System.out.println("Objem koule je: " + objem);
    }

    public void spoctiPovrch() {
        povrch=  (4*Math.PI*(a*a));
        System.out.println("Povrch koule je: " + povrch);

    }
    public void setBarva(String barva){
        this.barva = barva;
    }

    public void vypisBarva(){
        System.out.println(barva);
    }
}
