# 📚 Proyecto Biblioteca - MVC en Java

## 📖 Descripción
Este proyecto es un sistema básico de gestión de biblioteca desarrollado en Java, aplicando arquitectura MVC (Modelo-Vista-Controlador) y patrones de diseño.

El sistema permite agregar y listar libros, y sirve como base para demostrar buenas prácticas de ingeniería de software.

---

## 🏗️ Arquitectura (MVC)

- **Modelo (Model):** Maneja los datos y la lógica del sistema (Libro, Biblioteca).
- **Vista (View):** Interacción por consola con el usuario.
- **Controlador (Controller):** Coordina la comunicación entre Modelo y Vista.

---

## 🧩 Patrones de Diseño

### Singleton
Se utiliza para asegurar una única instancia de la biblioteca en el sistema.

### Strategy
Permite cambiar dinámicamente la forma de búsqueda de libros (por título, autor, etc.).

---

## ▶️ Cómo ejecutar el proyecto

mvn clean compile

mvn exec:java "-Dexec.mainClass=com.biblioteca.Main"

# ⭐ 1. Estructura del proyecto

```markdown id="structure"
## 📁 Estructura del proyecto

src/
├── model/
├── view/
├── controller/
├── singleton/
├── strategy/
└── Main.java

## 🧪 Testing
Se implementaron tests unitarios para validar la lógica del modelo (creación de libros y operaciones básicas de la biblioteca).

## 🌿 Trabajo con Git
El proyecto fue desarrollado utilizando Git y GitHub con ramas independientes para cada integrante, respetando el flujo de trabajo colaborativo.
