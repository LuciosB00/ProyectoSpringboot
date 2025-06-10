package Empleado.Service;

import Empleado.Repository.EmpleadoRepository;
import org.springframework.stereotype.Service;
import Empleado.Model.Empleado;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    public EmpleadoServiceImpl(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @Override
    public List<Empleado> getAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public Optional<Empleado> getById(Long id) {
        return empleadoRepository.findById(id);
    }

    @Override
    public Empleado save(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public void delete(Long id) {
        empleadoRepository.deleteById(id);
    }

    public void bajaLogica(Long id) {
        empleadoRepository.findById(id).ifPresent(empleado -> {
            empleado.setActivo(false);
            empleado.setFechaEgreso(LocalDate.now());
            empleadoRepository.save(empleado);
        });
    }
}


