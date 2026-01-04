# micro-manufacturing3D  
### Printing Workshop Management System

Sistema de gestión para talleres de impresión 3D orientado a digitalizar y optimizar el control de materiales, modelos imprimibles y órdenes de producción, con validación automática de inventario y seguimiento del proceso de impresión.

---

## Descripción

**micro-manufacturing3D – Printing Workshop Management System** es una aplicación backend desarrollada con **Spring Boot 4.0.1** y **Java 21**, diseñada para atender las necesidades operativas de pequeños talleres de impresión 3D que trabajan principalmente con tecnologías **FDM** y **resina**.

El sistema centraliza la administración de **filamentos y resinas**, permite **catalogar modelos imprimibles** junto con sus requerimientos de material y facilita la **creación y gestión de órdenes de impresión** con validaciones automáticas de inventario. Además, ofrece seguimiento del estado de cada orden y control de niveles críticos de material para evitar interrupciones en la producción.

El objetivo principal del proyecto es mejorar la eficiencia operativa, reducir errores derivados de la gestión manual y proporcionar una base para el análisis de **costos de producción** y planeación del taller.

---

## Tecnologías utilizadas

- Java 21
- Spring Boot 4.0.1
- Spring Web (REST API)
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven
- Swagger / OpenAPI

---

## Funcionalidades principales

- Registro y gestión de materiales (filamentos y resinas)
- Catálogo de modelos imprimibles con consumo de material
- Creación y administración de órdenes de impresión
- Validación automática de inventario al crear órdenes
- Seguimiento del estado de impresión:
  - En cola
  - Imprimiendo
  - Finalizada
- Monitoreo de niveles mínimos de inventario
- Base para cálculo de costos de producción
