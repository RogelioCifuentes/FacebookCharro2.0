package cl.forge.programatufuruto.facebookcharro.controller;


import cl.forge.programatufuruto.facebookcharro.model.Foto;
import cl.forge.programatufuruto.facebookcharro.model.Likes;
import cl.forge.programatufuruto.facebookcharro.repositories.LikesRepository;
import cl.forge.programatufuruto.facebookcharro.services.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/likes")
public class LikesController {


    private LikesService service;
    private LikesRepository repository;

    @Autowired
    public LikesController(LikesService likesService){
        this.service = likesService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void setLikes(Likes likes){
        repository.save(likes);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Likes> obtenerLikes(){
        List<Likes> likes = new ArrayList<>();
        repository.findAll().forEach(Likes -> likes.add(Likes));
        return likes;
    }

    @RequestMapping("/porIdFoto/{idFoto}")
    public long cantidadLikes(@PathVariable(value="idFoto") Foto idFoto){
        return service.obtenerCantidadLikes(idFoto);
    }
}
