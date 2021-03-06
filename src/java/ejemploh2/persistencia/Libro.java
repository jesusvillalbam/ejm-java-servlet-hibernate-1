package ejemploh2.persistencia;
// Generated 02-11-2015 06:20:58 PM by Hibernate Tools 4.3.1



/**
 * Libro generated by hbm2java
 */
public class Libro  implements java.io.Serializable {

     private Integer idLibro;
     private String titulo;
     private String subtitulo;
     private int edicion;
     private int paginas;
     private long isbn;
     private int ejemplares;

    public Libro() {
        idLibro = 0;
        titulo = "";
        subtitulo = "";
    }

    public Libro(String titulo, String subtitulo, int edicion, int paginas, long isbn, int ejemplares) {
       this.titulo = titulo;
       this.subtitulo = subtitulo;
       this.edicion = edicion;
       this.paginas = paginas;
       this.isbn = isbn;
       this.ejemplares = ejemplares;
    }
   
    public Integer getIdLibro() {
        return this.idLibro;
    }
    
    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getSubtitulo() {
        return this.subtitulo;
    }
    
    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }
    public int getEdicion() {
        return this.edicion;
    }
    
    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }
    public int getPaginas() {
        return this.paginas;
    }
    
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public long getIsbn() {
        return this.isbn;
    }
    
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    public int getEjemplares() {
        return this.ejemplares;
    }
    
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }




}


