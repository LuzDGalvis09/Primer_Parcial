package com.procesos.automovil.services;

import com.procesos.automovil.models.Automovil;

import java.util.List;

public interface AutomovilService {
    Automovil getAutomovil(Long id);
    Boolean createAutomovil(Automovil automovil);
    List<Automovil> allAutomovil();
    Boolean updateAutomovil(Long id, Automovil automovil);
}
