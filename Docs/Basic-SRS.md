## Tabla de contenidos
1. [Introducción](#1-introducción)
    1. [Propósito](#11-propósito)
    2. [Alcance](#12-alcance)
2. [Problemas Identificados](#2-problemas-identificados)
3. [Descripción General del Sistema](#3-descripción-general-del-sistema)
    1. [Perspectiva del Producto](#31-perspectiva-del-producto)
    2. [Funciones del Producto](#32-funciones-del-producto)
    3. [Características de Usuarios](#33-características-de-usuarios)
4. [Requisitos Detallados](#4-requisitos-detallados)
    1. [Requisitos Funcionales](#41-requisitos-funcionales)
    2. [Requisitos No-Funcionales](#42-requisitos-no-funcionales)
    3. [Requisitos Futuros](#43-requisitos-futuros)
5. [Apéndices](#5-apéndices)
    3. [Glosario de Términos](#51-glosario-de-términos)


## 1. Introducción
La agencia de viajes Icesi-Viajes enfrenta numerosos retos operativos debido a la gestión manual de reservas y la dependencia de herramientas no especializadas como Excel y comunicaciones telefónicas. Este documento presenta una solución a través de la especificación de requisitos para el desarrollo de un sistema software diseñado para automatizar, organizar y optimizar las operaciones y la gestión de clientes de Icesi-Viajes.

### 1.1 Propósito
El propósito de este documento es definir claramente los problemas enfrentados por Icesi-Viajes y establecer los requisitos funcionales y no funcionales del sistema software necesario. Este documento está destinado a ser utilizado por el equipo de desarrollo de software, el equipo de gestión de proyectos de Icesi-Viajes y los stakeholders involucrados en el proyecto.
### 1.2 Alcance
El sistema, denominado Sistema de Gestión de Icesi-Viajes (SGIV), abarcará la gestión de catálogos de destinos, administración de clientes, gestión de reservas, ventas, reportes y análisis, con un enfoque en la mejora de la eficiencia operativa y la satisfacción del cliente. SGIV facilitará la gestión diferenciada de roles, incluyendo accesos específicos para viewers, agentes y administradores.


## 2. Problemas Identificados
La gestión actual basada en hojas de cálculo y comunicación telefónica ha conducido a:
-	Pérdida y corrupción de datos críticos.
-	Dificultades para actualizar y compartir la información de forma eficiente.
-	Inconsistencias en la gestión de reservas y en la información del cliente.
-	Desafíos en el seguimiento y análisis de ventas y desempeño operativo.
-	Limitaciones en la capacidad de respuesta y personalización del servicio al cliente.


## 3. Descripción General del Sistema
### 3.1 Perspectiva del Producto
SGIV será una solución integral diseñada para reemplazar los métodos manuales y automatizar las operaciones clave de Icesi-Viajes. Funcionará tanto como un sistema independiente como una plataforma integrable con futuras soluciones y servicios de terceros.
### 3.2 Funciones del Producto
-	Catálogo de Destinos: Gestión completa de destinos ofrecidos, incluyendo creación, edición y eliminación.
-	Administración de Clientes: Perfiles detallados de clientes con historial de reservas y preferencias.
-	Gestión de Reservas y Ventas: Herramientas para agentes para manejar reservas, ventas, y paquetes de viaje personalizados.
-	Roles y Permisos Diferenciados: Accesos y funcionalidades específicas según el rol del usuario dentro de la agencia.
-	Reportes y Análisis: Generación de reportes avanzados sobre ventas, destinos populares, y rendimiento operativo.

### 3.3 Características de Usuarios
-	Viewer (Solo Lectura): Personal de apoyo que necesita consultar información pero no modificarla.
-	Agente: Personal de ventas responsable de la gestión directa con el cliente, incluyendo reservas y personalización de paquetes.
-	Administrador: Gestores y propietarios con acceso completo para configuración y administración del sistema.


## 4. Requisitos Detallados

### 4.1 Requisitos Funcionales
1.	Gestión de Usuarios y Roles: Creación, modificación, y eliminación de usuarios y roles, incluyendo la asignación de permisos específicos.
2.	Catalogación Dinámica de Destinos y Servicios: Herramientas para añadir y categorizar destinos y servicios asociados, como alojamientos y transporte.
3.	Interfaz Intuitiva para Reservas y Ventas: Interfaces diseñadas específicamente para facilitar el proceso de reservas y ventas por parte de los agentes.
4.	Módulos de Reporte: Capacidad para generar diversos tipos de reportes y análisis de datos para apoyar la toma de decisiones estratégicas.

### 4.2 Requisitos No Funcionales
1.	Seguridad y Protección de Datos: Implementación de estándares de seguridad para la protección de datos personales y transacciones financieras.
2.	Usabilidad: Diseño de interfaces que aseguren una experiencia de usuario óptima para todos los roles de usuario.
3.	Disponibilidad y Escalabilidad: Alta disponibilidad del sistema y capacidad para escalar en función del crecimiento de la agencia.
4.	Integrabilidad: Diseño que permita la fácil integración con otros sistemas y servicios externos en el futuro.

### 4.3 Requisitos Futuros
-	Expansión de Funcionalidades: Inclusión de nuevas características como la integración con plataformas de pago en línea y servicios de terceros.
-	Personalización del Cliente: Herramientas avanzadas para la personalización de servicios y ofertas basadas en el historial y preferencias del cliente.



## 5. Apéndices
### 5.1 Glosario de Términos
-	SGIV: Sistema de Gestión de Icesi-Viajes.
-	Viewer: Rol de usuario con permisos de solo lectura.
-	Agente: Rol de usuario con permisos para gestionar reservas y ventas.
-	Administrador: Rol de usuario con acceso total al sistema.

