package ar.gob.siliconmisiones.organizadorfamiliar.service;

import ar.gob.siliconmisiones.organizadorfamiliar.entity.Tarea;

import java.util.List;

public interface TareaService {

    public List<Tarea> findAll();

    public Tarea findById(int id);

    public void save(Tarea tarea);

    public void deleteById(int id);

}
