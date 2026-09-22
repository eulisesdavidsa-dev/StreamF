package Entity.Contenido;

import Entity.Genero;
import Entity.Status;

import java.time.LocalDateTime;

public class Contenido {
    private ContenidoId id;
    private String titulo;
    private String descripcion;
    private Genero genero;
    private int duracion;
    private LocalDateTime fecha;
    private double rating;
    private Status status;

    private Contenido(ContenidoId id, String titulo, String descripcion,Genero genero,int duracion,  LocalDateTime fecha) {
        this.fecha = fecha;
        this.duracion = duracion;
        this.genero = genero;
        this.descripcion = descripcion;
        this.titulo = Objects.requireNonNull(titulo,"Titulo es obligatorio es obligatorio");
        this.id = Objects.requireNonNull(id,"Id es obligatorio");
        this.rating = 0.0;
        this.status = status.EN_REVISION;
    }

    public static Contenido create(String titulo, String descripcion, Genero genero, int duracion, LocalDateTime fecha){
        return new Contenido(ContenidoId.generate(),titulo,descripcion,genero,duracion,fecha);
    }

    //reconstruir un objeto a partir de la persistencia
    public static Contenido of(ContenidoId id, String titulo, String descripcion, Genero genero, int duracion, LocalDateTime fecha, double rating, Status status){
        Contanido contenido = new Contenido(id,titulo,descripcion,genero,duracion,fecha);
        contenido.rating = rating;
        contenido.status = status;
        return contenido;
    }

    public void archivar(){

    }

    public ContenidoId getId() { return id; }
    public String getTitulo() {return titulo;}
    public String getDescripcion() {return descripcion;}
    public Genero getGenero() {return genero;}
    public int getDuracion() {return duracion;}
    public LocalDateTime getFecha() {return fecha;}
    public double getRating() {return rating;}
    public Status getStatus() {return status;}
}
