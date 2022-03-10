package Practicums.Practicums6;

import Practicums.Practicums5.Leerling;

import java.util.ArrayList;

public class Persoon {
    private  String naam;
    private double budget;
    private ArrayList<Game> mijnGames= new ArrayList<>();

    public Persoon(String nm, double bud){
        this.naam= nm;
        this.budget= bud;
    }
    public double getBudget(){
        return  budget;
    }

    public boolean koop(Game g) {
       String naam =g.getNaam();
        for (Game spel: mijnGames){
           String naamLijst=spel.getNaam();
           if (naam.equals(naamLijst)){
                return false;}}
        if (budget < g.huidigeWaarde()) {
            return false;}
        else{
            mijnGames.add(g);
            budget-=g.huidigeWaarde();
            return true;}}

    public boolean verkoop(Game g, Persoon koper){
        String naaminput =g.getNaam();
        for (Game spel: mijnGames) {
            String naamLijst = spel.getNaam();
            if (naaminput.equals(naamLijst)) {
                if (koper.budget>=spel.huidigeWaarde()){
                    if(koper.mijnGames.contains(spel)){
                        return false;}
                    else
                        budget += spel.huidigeWaarde();
                        mijnGames.remove(spel);
                        koper.mijnGames.add(spel);
                        koper.budget -= spel.huidigeWaarde();
                        return true;}}}
        return false;
    }

    public  String toString(){
        String s = naam +" heeft een budget van €"+ String.format("%.2f", budget) +" en bezit de volgende games:";
        if(mijnGames!= null){
            for (Game spel : mijnGames) s += "\n" + spel;
            return s;
        }
        return s;
    }
}
