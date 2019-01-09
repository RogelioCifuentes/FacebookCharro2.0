package cl.forge.programatufuruto.facebookcharro.services;


import cl.forge.programatufuruto.facebookcharro.model.Comentario;
import cl.forge.programatufuruto.facebookcharro.repositories.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComentarioService {

    private ComentarioRepository comentarioRepository;


    @Autowired
    public ComentarioService(ComentarioRepository comentarioRepository){
        this.comentarioRepository = comentarioRepository;
    }

    public Iterable<Comentario> obtenerComentarios(){
        return comentarioRepository.findAll();
    }
}
