package model;

public class CD extends Elemento{
    private String album;
    private String interprete;
    private int numeroDeTemas;

    public CD() {
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public int getNumeroDeTemas() {
        return numeroDeTemas;
    }

    public void setNumeroDeTemas(int numeroDeTemas) {
        this.numeroDeTemas = numeroDeTemas;
    }

    @Override
    public String toString() {
        return "CD{" +
                "album='" + album + '\'' +
                ", interprete='" + interprete + '\'' +
                ", numeroDeTemas=" + numeroDeTemas +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
       boolean rta = false;
       if(rta) {
               if (o instanceof CD) {
                   CD aux = (CD) o;
                   if (this.album.equalsIgnoreCase(aux.album) && this.interprete.equalsIgnoreCase(aux.interprete) &&
                           this.numeroDeTemas == aux.getNumeroDeTemas()) {
                       rta = true;
                   }
               }

       }
       return rta;
    }
}
