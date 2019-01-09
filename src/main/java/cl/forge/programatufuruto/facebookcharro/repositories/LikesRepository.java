package cl.forge.programatufuruto.facebookcharro.repositories;

import cl.forge.programatufuruto.facebookcharro.model.Foto;
import cl.forge.programatufuruto.facebookcharro.model.Likes;
import org.springframework.data.repository.CrudRepository;

public interface LikesRepository extends CrudRepository<Likes,Integer> {

    long countByIdFoto(Foto foto);
}
