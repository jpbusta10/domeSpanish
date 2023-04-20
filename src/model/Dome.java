package model;

import java.util.ArrayList;
//Dome class to have my Arraylist of CDs and DVDs
public class Dome {
    private String nombreDome;
    ArrayList<Elemento> elementos = new ArrayList<Elemento>();
    public Dome() {
    }
    public String getNombreDome() {
        return nombreDome;
    }

    public void setNombreDome(String nombreDome) {
        this.nombreDome = nombreDome;
    }

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<Elemento> elementos) {
        this.elementos = elementos;
    }
    public void agregarColeccion(Elemento nuevo){
            elementos.add(nuevo);
    }
    public void imprimirColeccion(){ // prints the entire array
        for(int i=0; i<elementos.size();i++){
            System.out.println(elementos.get(i).toString());
        }
    }
    public void imprimirCds(){ //prints only CDs
        for(int i=0; i<elementos.size();i++){
            if(elementos.get(i) instanceof CD){
                System.out.println(elementos.get(i).toString());
            }
        }
    }
}
