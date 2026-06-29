# 🧠 Semana 5 – Desarrollo Orientado a Objetos I

## 👤 Autora del proyecto
- **Nombre completo:** Oriana Navarrete
- **Sección:** Online
- **Carrera:** Analista Programador
- **Sede:** Online
---

## 📘 Descripción general del sistema
Sistema orientado a objetos en Java que gestiona el catálogo de tours y guías de la agencia **Llanquihue Tour**. Lee datos desde un archivo `.txt`, valida la información con manejo de excepciones, instancia objetos `Tour` (compuestos por un objeto `Guia`) y los almacena en un `ArrayList`. Incluye recorrido, filtrado y búsqueda por nombre.

---

## 🧱 Estructura del proyecto
src/

├── model/      → Clases Tour y Guia (composición)

├── util/       → Clase DatoInvalidoException (excepción personalizada)

├── service/    → Clase GestorTours (lectura, validación y búsqueda)

└── app/        → Clase Main (ejecución del programa)

resources/

└── tours.txt   → Archivo con los datos de los tours y guías

### Clases implementadas
- **Guia** → representa al guía turístico asignado a un tour
- **Tour** → contiene un objeto Guia (composición) y validaciones en sus setters
- **DatoInvalidoException** → excepción personalizada para datos incorrectos
- **GestorTours** → lee el archivo, valida los datos con try-catch y permite búsqueda
- **Main** → recorre, filtra y busca tours, mostrando los resultados por consola

### Relaciones entre clases
- `Tour` contiene a `Guia` → **composición**
- `GestorTours` lanza `DatoInvalidoException` cuando un dato no es válido

---

## ⚙️ Instrucciones para ejecutar
1. Clona el repositorio:
git clone https://github.com/zanaoriana/Llanquihue-tour.git
2. Abre el proyecto en IntelliJ IDEA
3. Verifica que la carpeta `resources/` esté en la raíz del proyecto
4. Ejecuta el archivo `Main.java` desde el paquete `app`

---

**Repositorio GitHub:** https://github.com/zanaoriana/Llanquihue-tour  
**Fecha de entrega:** 17/06/2026

---
© Duoc UC | Escuela de Informática y Telecomunicaciones
