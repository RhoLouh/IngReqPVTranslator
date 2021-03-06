package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Modulo {
    private String name;
    private float alpha, beta, gamma, kappa;

    private List<Medida> medidas;

    public Modulo(String name, float alpha, float beta, float gamma, float kappa){
        this.name = name;
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
        this.kappa = kappa;
        medidas = new ArrayList<>();
    }

    public Modulo(String name){
       this(name,0,0,0,0);
    }


    public String toString(){
        return("Name: " +name+ "\nAlpha: "+alpha+"\nBeta: "+beta+"\nGamma: "+gamma+"\nKappa: "+kappa+"\n");
    }

    public String getName(){
        return name;
    }

}
