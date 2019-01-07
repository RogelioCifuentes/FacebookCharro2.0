package cl.forge.programatufuruto.facebookcharro.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="comentario")
public class Comentario implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="idComentario")
    private Integer idComentario;

    @Column(name = "comentario")
    private String comentario;

    @Column(name="fecha")
    private Date fecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idUsuario")
    private Usuario idUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idFoto")
    private Foto idFoto;

    public Comentario(){

    }

    public Comentario(Integer idComentario, String comentario, Date fecha, Usuario idUsuario, Foto idFoto) {
        this.idComentario = idComentario;
        this.comentario = comentario;
        this.fecha = fecha;
        this.idUsuario = idUsuario;
        this.idFoto = idFoto;
    }

    public Integer getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Foto getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(Foto idFoto) {
        this.idFoto = idFoto;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "idComentario=" + idComentario +
                ", comentario='" + comentario + '\'' +
                ", fecha=" + fecha +
                ", idUsuario=" + idUsuario +
                ", idFoto=" + idFoto +
                '}';
    }
}




