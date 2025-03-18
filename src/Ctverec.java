public class Ctverec implements ITvar, Barva{


        private int a;
        private double obsah, obvod;
        private String barva;

        public Ctverec(int a) {
            this.a = a;
        }

        public void spoctiObsah() {
            obsah = (a*a);
            System.out.println("Obsah čtverce je: " + obsah);
        }

        public void spoctiObvod() {
            obvod =  (a*4);
            System.out.println("Obvod čtverce je: " + obvod);
        }
    public void setBarva(String barva){
        this.barva = barva;
    }

    public void vypisBarva(){
        System.out.println(barva);
    }





}
