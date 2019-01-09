package cl.forge.programatufuruto.facebookcharro.repositories;

import cl.forge.programatufuruto.facebookcharro.model.Comentario;
import cl.forge.programatufuruto.facebookcharro.model.Foto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComentarioRepository extends CrudRepository<Comentario,Integer> {


    List<Comentario> findByIdFoto(Foto idFoto);
}
