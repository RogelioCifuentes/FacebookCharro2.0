package cl.forge.programatufuruto.facebookcharro.services;

import cl.forge.programatufuruto.facebookcharro.model.Foto;
import cl.forge.programatufuruto.facebookcharro.repositories.FotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FotoService {

    private FotoRepository repository;

    @Autowired
    public FotoService(FotoRepository repository){
        this.repository = repository;
    }

    public Iterable<Foto> obtenerFotos(){
        return repository.findAll();
    }

    public Foto porId(Integer id){
        return repository.findById(id).get();
    }
    public void save(Foto foto){
        repository.save(foto);
    }
}
