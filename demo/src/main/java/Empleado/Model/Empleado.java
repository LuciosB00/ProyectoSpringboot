package Empleado.Model;

import java.time.LocalDate;

import Empleado.dto.EmpleadoDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // datos personales
    @Column(unique = true)
    private Long dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String provincia;
    private String localidad;
    private String genero;

    // datos laborales
    @Column(unique = true)
    private int legajo;
    private String cargo;
    private double salario;
    private boolean activo;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;

    // Getters y setters para todos los campos
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getDni() { return dni; }
    public void setDni(Long dni) { this.dni = dni; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getProvincia() { return provincia; }
    public void setProvincia(String provincia) { this.provincia = provincia; }

    public String getLocalidad() { return localidad; }
    public void setLocalidad(String localidad) { this.localidad = localidad; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public int getLegajo() { return legajo; }
    public void setLegajo(int legajo) { this.legajo = legajo; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }

    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    public LocalDate getFechaEgreso() { return fechaEgreso; }
    public void setFechaEgreso(LocalDate fechaEgreso) { this.fechaEgreso = fechaEgreso; }

    private Empleado convertirDtoAEntidad(EmpleadoDto dto) {
        Empleado empleado = new Empleado();

        empleado.setId(dto.getId()); // generalmente null para POST, pero útil para PUT
        empleado.setDni(dto.getDni());
        empleado.setNombre(dto.getNombre());
        empleado.setApellido(dto.getApellido());
        empleado.setTelefono(dto.getTelefono());
        empleado.setProvincia(dto.getProvincia());
        empleado.setLocalidad(dto.getLocalidad());
        empleado.setGenero(dto.getGenero());
        empleado.setLegajo(dto.getLegajo());
        empleado.setCargo(dto.getCargo());
        empleado.setSalario(dto.getSalario());
        empleado.setActivo(dto.isActivo());
        empleado.setFechaIngreso(dto.getFechaIngreso());
        empleado.setFechaEgreso(dto.getFechaEgreso());

        return empleado;
    }
}
