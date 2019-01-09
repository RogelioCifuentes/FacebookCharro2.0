package cl.forge.programatufuruto.facebookcharro.repositories;

import cl.forge.programatufuruto.facebookcharro.model.Comentario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComentarioRepository extends CrudRepository<Comentario,Integer> {


}
