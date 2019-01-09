package cl.forge.programatufuruto.facebookcharro.services;


import cl.forge.programatufuruto.facebookcharro.model.Foto;
import cl.forge.programatufuruto.facebookcharro.repositories.LikesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LikesService {

    private LikesRepository repository;

    @Autowired
    public LikesService(LikesRepository likesRepository){
        this.repository = likesRepository;
    }

    public long obtenerCantidadLikes(Foto idFoto){

        return repository.countByIdFoto(idFoto);
    }


}
