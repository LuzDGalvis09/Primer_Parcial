package com.procesos.automovil.services;

import com.procesos.automovil.models.Automovil;
import com.procesos.automovil.repository.AutomovilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutomovilServiceImp implements AutomovilService {
    @Autowired
    private AutomovilRepository AutomovilRepository;

    public Automovil getAutomovil(Long id){
        return AutomovilRepository.findById(id).get();
    }

    @Override
    public Boolean createAutomovil(Automovil automovil) {
        try {
            AutomovilRepository.save(automovil);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    @Override
    public List<Automovil> allAutomovil() {
        return AutomovilRepository.findAll();
    }





    @Override
    public Boolean updateAutomovil(Long id, Automovil automovil) {
        try {
            Automovil automovilBD = AutomovilRepository.findById(id).get();

            automovilBD.setCars(automovil.getCars());
            automovilBD.setCar_model(automovil.getCar_model());
            automovilBD.setCar_color(automovil.getCar_color());
            automovilBD.setCar_model_year(automovil.getCar_model_year());
            automovilBD.setCar_vin(automovil.getCar_vin());
            automovilBD.setPrice(automovilBD.getPrice());
            automovilBD.setAvailability(automovil.getAvailability());
            Automovil automovil1Up = AutomovilRepository.save(automovilBD);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
