package model;

public class DVD extends Elemento{
    private String director;
    private int puntacion;

    public DVD() {
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getPuntacion() {
        return puntacion;
    }

    public void setPuntacion(int puntacion) {
        this.puntacion = puntacion;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "director='" + director + '\'' +
                ", puntacion=" + puntacion +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        boolean rta = super.equals(o);
        if (rta){
            if(o instanceof DVD){
                DVD aux = (DVD) o;
                if(this.director.equalsIgnoreCase(aux.getDirector())&&this.puntacion== aux.getPuntacion()){
                    rta = true;
                }
            }
        }
        return rta;
    }
}
