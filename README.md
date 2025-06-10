# Sistema de Gestión de Empleados

## Descripción
Proyecto backend desarrollado en Java con Spring Boot para la gestión de empleados. Permite crear, leer, actualizar y eliminar empleados, además de documentar la API con Swagger para facilitar su uso y prueba.

Está pensado para ser usado en áreas de Recursos Humanos o Administración, facilitando la gestión precisa y funcional del personal.

## Tecnologías utilizadas
- Java 17  
- Spring Boot 3.2.5  
- H2 (base de datos en memoria para desarrollo y pruebas)  
- Swagger (documentación automática de la API)  
- Maven (gestor de dependencias)  
- Lombok (reducción de código repetitivo)  

## Requisitos previos
- JDK 17 o superior instalado  
- Maven instalado (o usar wrapper `./mvnw`)  
- IDE compatible con Java (IntelliJ IDEA, Eclipse, VS Code, etc.)

## Instalación y ejecución

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/LuciosB00/ProyectoSpringboot.git
   cd ProyectoSpringboot
   ```
   
2. Construir y ejecutar la aplicación con Maven:

   ```bash
   ./mvnw clean install
   ./mvnw spring-boot:run
   ```

   Alternativamente, abrir el proyecto en tu IDE y ejecutar la clase principal `DemoApplication` o equivalente.

3. La aplicación correrá en `http://localhost:8080`

## Uso

* Acceder a la documentación y prueba de la API con Swagger UI:
  `http://localhost:8080/swagger-ui.html`

* Endpoints principales:

  * `GET /api/empleados` - Listar todos los empleados
  * `GET /api/empleados/{id}` - Obtener empleado por ID
  * `POST /api/empleados` - Crear un nuevo empleado
  * `PUT /api/empleados/{id}` - Actualizar empleado
  * `DELETE /api/empleados/{id}` - Dar de baja (actualiza fechaEgreso)

## Base de datos

* La aplicación usa H2, una base de datos en memoria.

* Acceso a consola web para consultas y pruebas:
  `http://localhost:8080/h2-console`

  * JDBC URL: `jdbc:h2:mem:testdb`
  * Usuario: `sa`
  * Contraseña: (dejar vacío)

* Consultas útiles:

  ```sql
  SELECT * FROM empleado;
  SELECT * FROM empleado WHERE activo = true;
  ```

## Documentación adicional

* Presentación con detalles funcionales y técnicos:
[Agregar presentacion]

* Tablero de tareas (Trello):
  [https://trello.com/invite/b/6808145cf643b4cf6ed93b68/ATTId0e091397202deea29eaefc59ad59e1046ED3637/metodologia-lucio](https://trello.com/invite/b/6808145cf643b4cf6ed93b68/ATTId0e091397202deea29eaefc59ad59e1046ED3637/metodologia-lucio)

* Repositorio GitHub:
  [https://github.com/LuciosB00/ProyectoSpringboot.git](https://github.com/LuciosB00/ProyectoSpringboot.git)


# ¡Gracias por usar el Sistema de Gestión de Empleados!

