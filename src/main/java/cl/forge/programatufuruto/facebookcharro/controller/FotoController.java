package cl.forge.programatufuruto.facebookcharro.controller;


import cl.forge.programatufuruto.facebookcharro.services.FotoService;
import cl.forge.programatufuruto.facebookcharro.model.Foto;
import cl.forge.programatufuruto.facebookcharro.repositories.FotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fotos")
public class FotoController {


    private FotoService service;
    private FotoRepository repository;

    @Autowired
    public FotoController(FotoService service){
        this.service = service;
    }

//    @RequestMapping("/porIdUsuario/{idUsuario}")
//    public Iterable<Foto> porIdUsuario(@PathVariable(value="idUsuario") Integer id){
//        return service.porIdUsuario(id);
//    }

    @RequestMapping(method = RequestMethod.POST)
    public void setFoto(@RequestBody Foto foto){

        service.save(foto);
    }

    @RequestMapping("/porId/{idFoto}")
    public Foto obtenerFotoPorId(@PathVariable(value="idFoto") Integer id){
        return service.porId(id);
    }

    @RequestMapping("/")
    public Iterable<Foto> list() {
        return service.obtenerFotos();
    }

}
