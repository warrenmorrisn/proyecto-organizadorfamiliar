package ar.gob.siliconmisiones.organizadorfamiliar.service;

import ar.gob.siliconmisiones.organizadorfamiliar.dao.TareaRepository;
import ar.gob.siliconmisiones.organizadorfamiliar.entity.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaServiceImpl implements TareaService {

    private TareaRepository tareaRepository;

    @Autowired
    public TareaServiceImpl(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    @Override
    public List<Tarea> findAll() {
        return tareaRepository.findAll();
    }

    @Override
    public Tarea findById(int id) {
        Optional<Tarea> result = tareaRepository.findById(id);

        Tarea tarea = null;

        if (result.isPresent()) {
           tarea = result.get();
        } else {
            throw new RuntimeException("No se encontro el usuario con el id: " + id);
        }

        return tarea;
    }

    @Override
    public void save(Tarea tarea) {
        tareaRepository.save(tarea);
    }

    @Override
    public void deleteById(int id) {
        tareaRepository.deleteById(id);
    }



}
