package Test.test1;

public class klant {
    private  String  naam;
    private  String   adres;
    private  String  plaats;

    public klant ( String n, String a, String p){
         this.naam= n;
        this.adres= a;
        this.plaats= p;
    }

    public  String toString(){
        String k=" naam "+ naam +" Woont op " + adres  + " in " + plaats;
        return k;
    }
}
