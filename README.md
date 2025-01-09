# Proyecto: Sistema de Gestión de Notas Académicas

## Descripción
El Sistema de Gestión de Notas Académicas es una aplicación web desarrollada con **Angular** para el frontend y **Spring Boot** para el backend. Su objetivo principal es facilitar el registro, consulta y administración de calificaciones académicas para instituciones educativas, profesores y estudiantes.

La versión inicial del proyecto está enfocada en ofrecer una solución sencilla y funcional que permita gestionar alumnos, asignaturas y sus respectivas calificaciones. Posteriormente, podrá ser ampliada con funcionalidades adicionales como reportes avanzados, estadísticas y autenticación de usuarios.

---

## Características principales (MVP):
1. **Gestión de Alumnos**:
   - Registro, edición y eliminación de alumnos.
   - Visualización de una lista con información básica (nombre, matrícula, curso).

2. **Gestión de Asignaturas**:
   - Registro, edición y eliminación de asignaturas.
   - Visualización de asignaturas disponibles en la institución.

3. **Registro de Notas**:
   - Relación de alumnos y asignaturas con sus calificaciones.
   - Consultas de notas por alumno o por asignatura.

4. **Interfaz amigable**:
   - Diseño moderno utilizando **Angular Material**.
   - Navegación simple y organizada entre las diferentes secciones de la aplicación.

---

## Tecnologías utilizadas
### Frontend:
- **Angular**: Framework para el desarrollo de la interfaz de usuario.
- **Angular Material**: Biblioteca de componentes UI para un diseño responsivo y moderno.

### Backend:
- **Spring Boot**: Framework para la construcción de la API REST.
- **Spring Data JPA**: Manejo de la persistencia de datos con facilidad.
- **H2 Database**: Base de datos embebida para pruebas y desarrollo.

### Herramientas adicionales:
- **Postman**: Pruebas de los endpoints REST.
- **GitHub**: Control de versiones y colaboración.

---

## Arquitectura del sistema
1. **Frontend**:
   - El cliente Angular consume los servicios REST proporcionados por el backend.
   - Componentes organizados por módulos (alumnos, asignaturas, notas).

2. **Backend**:
   - API RESTful desarrollada en Spring Boot.
   - Uso de entidades y relaciones para modelar los datos: `Alumno`, `Asignatura`, `Nota`.

3. **Base de Datos**:
   - Esquema relacional con tablas para alumnos, asignaturas y notas.
   - Relación principal: `Nota` une `Alumno` y `Asignatura`.

---

## Objetivos del proyecto
- Practicar el desarrollo de aplicaciones full stack utilizando Angular y Spring Boot.
- Mejorar habilidades en la implementación de CRUD y consumo de APIs REST.
- Aprender a gestionar proyectos con buenas prácticas como la documentación y el control de versiones.

---

## Instalación y ejecución
### Requisitos previos:
1. **Node.js** y **Angular CLI** instalados en el sistema.
2. **Java 17** o superior.
3. **Maven** para la gestión de dependencias en el backend.



## Estado del proyecto
Actualmente, el proyecto está en la fase MVP con las funcionalidades básicas completadas. Se planean futuras mejoras como:
- Autenticación de usuarios.
- Generación de reportes en PDF/Excel.
- Estadísticas más avanzadas.

---

## Contribución
Si deseas colaborar en este proyecto, no dudes en abrir un **issue** o enviar un **pull request**. Cualquier sugerencia o mejora es bienvenida.

---

## Licencia
Este proyecto está bajo la licencia MIT.

