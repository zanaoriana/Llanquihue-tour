# 🧠 Semana 7 – Desarrollo Orientado a Objetos I

## 👤 Autora del proyecto
- **Nombre completo:** Oriana Navarrete
- **Sección:** Online
- **Carrera:** Analista Programador
- **Sede:** Online
---

## 📘 Descripción general del sistema
Sistema orientado a objetos en Java que gestiona servicios turísticos de la agencia **Llanquihue Tour**. Aplica polimorfismo mediante el método `mostrarInformacion()` sobrescrito en cada subclase, y una colección genérica `List<ServicioTuristico>` que almacena objetos de distintos tipos.

---

## 🧱 Estructura del proyecto
src/
├── model/   → ServicioTuristico, RutaGastronomica, PaseoLacustre, ExcursionCultural
├── data/    → GestorServicios (colección polimórfica)
└── ui/      → Main (ejecución y validación de getters)

### Clases implementadas
- **ServicioTuristico** → superclase con `mostrarInformacion()` base
- **RutaGastronomica** → sobrescribe `mostrarInformacion()` con número de paradas
- **PaseoLacustre** → sobrescribe `mostrarInformacion()` con tipo de embarcación
- **ExcursionCultural** → sobrescribe `mostrarInformacion()` con lugar histórico
- **GestorServicios** → colección `List<ServicioTuristico>` con 6 objetos y método `mostrarTodos()`
- **Main** → invoca `mostrarTodos()` y valida getters por consola

### Conceptos aplicados
- Herencia con `extends`
- Polimorfismo con `@Override` en `mostrarInformacion()`
- Colección genérica `List<ServicioTuristico>`
- Recorrido con `for-each`

---

## ⚙️ Instrucciones para ejecutar
1. Abrir el proyecto en IntelliJ IDEA
2. Ejecutar `Main.java` desde el paquete `ui`

---

**Repositorio:** https://github.com/zanaoriana/Llanquihue-tour  
**Fecha de entrega:** 03/07/2026

---
© Duoc UC | Escuela de Informática y Telecomunicaciones
