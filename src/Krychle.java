public class Krychle implements Telseso, Barva {

    private int a;
    private double objem, povrch;
    private String barva;

    public Krychle(int a) {
        this.a = a;
    }

    public void spoctiObjem() {
        objem= (a*a*a);
        System.out.println("Objem krychle je: " + objem);
    }

    public void spoctiPovrch() {
        povrch=  (6*(a*a));
        System.out.println("Povrch krychle je: " + povrch);
    }
    public void setBarva(String barva){
        barva = "modrá";
    }

    public void vypisBarva(){
        System.out.println(barva);
    }
}
