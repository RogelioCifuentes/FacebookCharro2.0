package cl.forge.programatufuruto.facebookcharro.controller;

import cl.forge.programatufuruto.facebookcharro.model.Usuario;
import cl.forge.programatufuruto.facebookcharro.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;


    @RequestMapping("/")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        repository.findAll().forEach( Usuario -> usuarios.add( Usuario ));
        return usuarios;
    }


    @RequestMapping(method = RequestMethod.POST)
    public void setUsuario( @RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
