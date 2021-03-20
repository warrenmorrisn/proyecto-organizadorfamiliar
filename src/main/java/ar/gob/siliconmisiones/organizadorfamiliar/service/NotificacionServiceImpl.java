package ar.gob.siliconmisiones.organizadorfamiliar.service;

import ar.gob.siliconmisiones.organizadorfamiliar.dao.NotificacionRepository;
import ar.gob.siliconmisiones.organizadorfamiliar.entity.Notificacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificacionServiceImpl implements NotificacionService {

    private NotificacionRepository notificacionRepository;

    @Autowired
    public NotificacionServiceImpl(NotificacionRepository notificacionRepository) {
        this.notificacionRepository = notificacionRepository;
    }

    @Override
    public List<Notificacion> findAll() {
        return notificacionRepository.findAll();
    }

    @Override
    public Notificacion findById(int id) {
        Optional<Notificacion> result = notificacionRepository.findById(id);

        Notificacion notificacion = null;

        if (result.isPresent()) {
            notificacion = result.get();
        } else {
            throw new RuntimeException("No se encontro el usuario con el id: " + id);
        }

        return notificacion;
    }

    @Override
    public void save(Notificacion notificacion) {
        notificacionRepository.save(notificacion);
    }

    @Override
    public void deleteById(int id) {
        notificacionRepository.deleteById(id);
    }
}
