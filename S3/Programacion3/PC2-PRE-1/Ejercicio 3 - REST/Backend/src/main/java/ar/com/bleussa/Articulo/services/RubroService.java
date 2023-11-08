package ar.com.bleussa.Articulo.services;

import ar.com.bleussa.Articulo.models.ProductoModel;
import ar.com.bleussa.Articulo.models.RubroModel;
import ar.com.bleussa.Articulo.repositories.IProductoRepo;
import ar.com.bleussa.Articulo.repositories.IRubroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class RubroService {

    @Autowired
    IRubroRepo rubroRepo;

    public ArrayList<RubroModel> getRubros(){
        return (ArrayList<RubroModel>) rubroRepo.findAll();
    }

    public Optional<RubroModel> getRubroById(long id){
        return rubroRepo.findById(id);
    }

}
