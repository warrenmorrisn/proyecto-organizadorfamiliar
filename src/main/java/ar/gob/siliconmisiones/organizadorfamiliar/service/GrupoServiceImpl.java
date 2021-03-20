package ar.gob.siliconmisiones.organizadorfamiliar.service;

import ar.gob.siliconmisiones.organizadorfamiliar.dao.GrupoRepository;
import ar.gob.siliconmisiones.organizadorfamiliar.entity.Grupo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GrupoServiceImpl implements GrupoService {


    private GrupoRepository grupoRepository;

    @Autowired
    public GrupoServiceImpl(GrupoRepository grupoRepository) {
        this.grupoRepository = grupoRepository;
    }

    @Override
    public List<Grupo> findAll() {
        return grupoRepository.findAll();
    }

    @Override
    public Grupo findById(int id) {
        Optional<Grupo> result = grupoRepository.findById(id);

        Grupo grupo = null;

        if (result.isPresent()) {
            grupo = result.get();
        } else {
            throw new RuntimeException("No se encontro el grupo con el id: " + id);
        }

        return grupo;
    }

    @Override
    public void save(Grupo grupo) {
        grupoRepository.save(grupo);
    }

    @Override
    public void deleteById(int id) {
        grupoRepository.deleteById(id);
    }
}
