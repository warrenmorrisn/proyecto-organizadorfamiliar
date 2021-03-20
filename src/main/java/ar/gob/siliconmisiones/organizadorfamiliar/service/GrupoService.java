package ar.gob.siliconmisiones.organizadorfamiliar.service;

import ar.gob.siliconmisiones.organizadorfamiliar.entity.Grupo;

import java.util.List;

public interface GrupoService {

    public List<Grupo> findAll();

    public Grupo findById(int id);

    public void save(Grupo grupo);

    public void deleteById(int id);
}
