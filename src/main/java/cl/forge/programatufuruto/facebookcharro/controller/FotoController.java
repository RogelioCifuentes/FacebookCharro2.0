package cl.forge.programatufuruto.facebookcharro.controller;


import cl.forge.programatufuruto.facebookcharro.model.Foto;
import cl.forge.programatufuruto.facebookcharro.model.Usuario;
import cl.forge.programatufuruto.facebookcharro.repositories.FotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/fotos")
public class FotoController {

    @Autowired
    private FotoRepository repository;

    @RequestMapping(method = RequestMethod.POST)
    public void setFoto( @RequestBody Foto foto){

        repository.save(foto);
    }

    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public Foto obtenerFotoPorId(@PathVariable("id") int id){

        return repository.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Foto> obtenerFotos() {
        List<Foto> fotos = new ArrayList<>();
        repository.findAll().forEach(Foto -> fotos.add(Foto));
        return fotos;
    }


    @RequestMapping(method = RequestMethod.POST,  path = "/usuario")
    public List<Foto> obtenerFotosPorUsuario( @RequestBody Usuario usuario) {
        List<Foto> fotos = new ArrayList<>();
        repository.findByUsuario(usuario).forEach(Foto -> fotos.add(Foto));
        return fotos;
    }


}
