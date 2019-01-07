package cl.forge.programatufuruto.facebookcharro.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="foto")
public class Foto {


    @Id
    @Column(name="idFoto")
    private Integer idFoto;

    @Column(name="ubicacion")
    private String ubicacion;

    @Column(name="pie_de_foto")
    private String pieDeFoto;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario idUsuario;


    public Foto(){

    }

    public Foto(Integer idFoto, String ubicacion, String pieDeFoto, Usuario idUsuario) {
        this.idFoto = idFoto;
        this.ubicacion = ubicacion;
        this.pieDeFoto = pieDeFoto;
        this.idUsuario = idUsuario;
    }

    public Integer getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(Integer idFoto) {
        this.idFoto = idFoto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPieDeFoto() {
        return pieDeFoto;
    }

    public void setPieDeFoto(String pieDeFoto) {
        this.pieDeFoto = pieDeFoto;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }


    @Override
    public String toString() {
        return "Foto{" +
                "idFoto=" + idFoto +
                ", ubicacion='" + ubicacion + '\'' +
                ", pieDeFoto='" + pieDeFoto + '\'' +
                ", idUsuario=" + idUsuario +
                '}';
    }
}


