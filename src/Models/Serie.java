package Models;

public class Serie {

    private String titulo;
    private int noTemporada;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie() {
        this.titulo= "Nombre de la serie";
        this.noTemporada = 3 ;
        this.entregado= false;
        this.genero= "Comedia";
        this.creador = "nn";
    }

    public Serie(String titulo, String creador) {
        this.titulo= titulo;
        this.noTemporada = 3 ;
        this.entregado= false;
        this.genero= "Comedia";
        this.creador = creador;
    }

    public Serie(String titulo,int noTemporada,String genero, String creador) {
        this.titulo= titulo;
        this.noTemporada = noTemporada ;
        this.genero= genero;
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNoTemporada() {
        return noTemporada;
    }

    public void setNoTemporada(int noTemporada) {
        this.noTemporada = noTemporada;
    }
}
