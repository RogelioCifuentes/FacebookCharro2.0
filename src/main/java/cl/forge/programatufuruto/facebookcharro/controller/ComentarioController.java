package cl.forge.programatufuruto.facebookcharro.controller;


import cl.forge.programatufuruto.facebookcharro.model.Comentario;
import cl.forge.programatufuruto.facebookcharro.repositories.ComentarioRepository;
import cl.forge.programatufuruto.facebookcharro.services.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {


    private ComentarioService service;
    private ComentarioRepository repository;

    @Autowired
    public ComentarioController(ComentarioService service){
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void setComentario(@RequestBody Comentario comentario){
        repository.save(comentario);
    }

    @RequestMapping("/")
    public List<Comentario> lista(){
        List<Comentario> comentarios = new ArrayList<>();
        repository.findAll().forEach(Comentario -> comentarios.add(Comentario));
        return comentarios;
    }
}
