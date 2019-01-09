package cl.forge.programatufuruto.facebookcharro.repositories;

import cl.forge.programatufuruto.facebookcharro.model.Foto;
import cl.forge.programatufuruto.facebookcharro.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FotoRepository extends CrudRepository<Foto,Integer> {

    Iterable<Foto> findByIdUsuario(Usuario usuario);

}
