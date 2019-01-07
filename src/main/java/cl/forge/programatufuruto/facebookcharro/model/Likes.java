package cl.forge.programatufuruto.facebookcharro.model;


import javax.persistence.*;

@Entity
@Table(name="likes")
public class Likes {

    @Id
    @Column(name="idLike")
    private Integer idLike;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idUsuario")
    private Usuario idUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idFoto")
    private Foto idFoto;

    public Likes(){

    }

    public Likes(Integer idLike, Usuario idUsuario, Foto idFoto) {
        this.idLike = idLike;
        this.idUsuario = idUsuario;
        this.idFoto = idFoto;
    }

    public Integer getIdLike() {
        return idLike;
    }

    public void setIdLike(int idLike) {
        this.idLike = idLike;
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
        return "Like{" +
                "idLike=" + idLike +
                ", idUsuario=" + idUsuario +
                ", idFoto=" + idFoto +
                '}';
    }
}