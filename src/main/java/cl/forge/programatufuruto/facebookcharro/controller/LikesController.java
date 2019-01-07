package cl.forge.programatufuruto.facebookcharro.controller;


import cl.forge.programatufuruto.facebookcharro.model.Likes;
import cl.forge.programatufuruto.facebookcharro.repositories.LikesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/likes")
public class LikesController {

    @Autowired
    private LikesRepository repository;

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
}
