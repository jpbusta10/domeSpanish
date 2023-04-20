package model;

public class Elemento {
    private String titulo;
    private boolean loTengo;

    private int duracion; //minutos
    private String comentario;
    private String genero;

    public Elemento() {

    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isLoTengo() {
        return loTengo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setLoTengo(boolean loTengo) {
        this.loTengo = loTengo;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        boolean rta = false;
        if(o != null){
            if(o instanceof Elemento){
                Elemento aux =(Elemento) o;
                if(this.titulo.equalsIgnoreCase(aux.titulo)&&this.duracion == aux.getDuracion()&&
                        this.genero.equalsIgnoreCase(aux.getGenero())){
                    rta = true;
                }
            }
        }
        return rta;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "titulo='" + titulo + '\'' +
                ", loTengo=" + loTengo +
                ", duracion=" + duracion +
                ", comentario='" + comentario + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}



