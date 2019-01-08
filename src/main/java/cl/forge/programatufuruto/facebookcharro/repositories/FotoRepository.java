package cl.forge.programatufuruto.facebookcharro.repositories;

import cl.forge.programatufuruto.facebookcharro.model.Foto;
import cl.forge.programatufuruto.facebookcharro.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface FotoRepository extends CrudRepository<Foto,Integer> {


    List<Foto> findByIdUsuario(Integer idUsuario);

    //@Query("SELECT * FROM foto WHERE foto.id_usuario = :id_usuario")
    //public List<Foto> obtenerFotosPorIdUsuario(@Param("id_usuario")Usuario usuario);
}
