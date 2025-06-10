package Empleado.dto;

import Empleado.Model.Empleado;

import java.time.LocalDate;

public class EmpleadoDto {
    private Long id;
    private Long dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String provincia;
    private String localidad;
    private String genero;
    private int legajo;
    private String cargo;
    private double salario;
    private boolean activo;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;

    // Constructor vacío (necesario para JSON)
    public EmpleadoDto() {}

    // Constructor con parámetros (opcional)
    public EmpleadoDto(Long id, Long dni, String nombre, String apellido, String telefono, String provincia,
                       String localidad, String genero, int legajo, String cargo, double salario, boolean activo,
                       LocalDate fechaIngreso, LocalDate fechaEgreso) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.provincia = provincia;
        this.localidad = localidad;
        this.genero = genero;
        this.legajo = legajo;
        this.cargo = cargo;
        this.salario = salario;
        this.activo = activo;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
    }

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

    public static Empleado convertirDtoAEntidad(EmpleadoDto dto) {
        Empleado emp = new Empleado();
        emp.setDni(dto.getDni());
        emp.setNombre(dto.getNombre());
        emp.setApellido(dto.getApellido());
        emp.setTelefono(dto.getTelefono());
        emp.setProvincia(dto.getProvincia());
        emp.setLocalidad(dto.getLocalidad());
        emp.setGenero(dto.getGenero());
        emp.setLegajo(dto.getLegajo());
        emp.setCargo(dto.getCargo());
        emp.setSalario(dto.getSalario());
        emp.setActivo(dto.isActivo());
        emp.setFechaIngreso(dto.getFechaIngreso());
        emp.setFechaEgreso(dto.getFechaEgreso());
        return emp;
    }


}
