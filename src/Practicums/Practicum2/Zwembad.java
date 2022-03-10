package Practicums.Practicum2;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad ( double br, double l, double d){
        breedte= br;
        lengte= l;
        diepte= d;


    }

    public Zwembad (){
}
    public  void setBreedte(double br) {breedte= br;}
    public  void setLengte(double l) {lengte= l;}
    public  void setDiepte(double d) {diepte= d;}
    public double getBreedte() { return breedte;}
    public double getLengte() {return lengte;}
    public double getDiepte() {return diepte;}
    public String toString() {
    String s="  Het zwembad een een breedte van "+ breedte+"m. Met een lengte van "+lengte +"m en een diepte van "+ diepte+"m";
    return s;
    }

    public  double inhoud(){
         double inhoud= breedte * lengte * diepte;

        return inhoud;
    }

}


