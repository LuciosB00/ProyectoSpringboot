package Empleado.Controller;

import Empleado.Model.Empleado;
import Empleado.Service.EmpleadoService;
import Empleado.dto.EmpleadoDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.ResponseEntity;

import static Empleado.dto.EmpleadoDto.convertirDtoAEntidad;

@RestController
@RequestMapping("/api/empleado")
@CrossOrigin(origins = "*")
@Tag(name = "Empleados", description = "Operaciones relacionadas con empleados")
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping
    @Operation(summary = "Listar todos los empleados")
    public List<Empleado> getAll() {
        return empleadoService.getAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Ver un empleado")
    public ResponseEntity<Empleado> getById(@PathVariable Long id) {
        return empleadoService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Ingresar un empelado")
    public ResponseEntity<Empleado> create(@RequestBody EmpleadoDto empleadoDto) {
        Empleado empleado = convertirDtoAEntidad(empleadoDto);
        Empleado empleadoGuardado = empleadoService.save(empleado);
        return ResponseEntity.status(HttpStatus.CREATED).body(empleadoGuardado);
    }


    @PutMapping("/{id}")
    @Operation(summary = "Actualizar un empelado")
    public ResponseEntity<Empleado> update(@PathVariable Long id, @RequestBody Empleado empleado) {
        return empleadoService.getById(id)
                .map(existing -> {
                    return ResponseEntity.ok(empleadoService.save(empleado));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un empelado")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (empleadoService.getById(id).isPresent()) {
            empleadoService.delete(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
