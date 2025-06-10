package Empleado.Service;

import Empleado.Model.Empleado;
import java.util.List;
import java.util.Optional;

public interface EmpleadoService {
    List<Empleado> getAll();
    Optional<Empleado> getById(Long id);
    Empleado save(Empleado empleado);
    void delete(Long id);
}


