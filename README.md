# 🧠 Semana 6 – Desarrollo Orientado a Objetos I

## 👤 Autora del proyecto
- **Nombre completo:** Oriana Navarrete
- **Sección:** Online
- **Carrera:** Analista Programador
- **Sede:** Online
---

## 📘 Descripción general del sistema
Sistema orientado a objetos en Java que representa la jerarquía de servicios turísticos de la agencia **Llanquihue Tour**. Aplica herencia mediante una superclase común (`ServicioTuristico`) y tres subclases especializadas, usando `super()` en los constructores y `@Override` en los métodos `toString()`.

---

## 🧱 Estructura del proyecto
src/

├── model/   → ServicioTuristico, RutaGastronomica, PaseoLacustre, ExcursionCultural

├── data/    → GestorServicios

└── ui/      → Main

### Clases implementadas
- **ServicioTuristico** → superclase con nombre y duracionHoras
- **RutaGastronomica** → agrega numeroDeParadas
- **PaseoLacustre** → agrega tipoEmbarcacion
- **ExcursionCultural** → agrega lugarHistorico
- **GestorServicios** → crea 2 instancias de cada subclase
- **Main** → muestra todos los servicios por consola

### Relaciones
- Las 3 subclases **heredan** de `ServicioTuristico`

---

## ⚙️ Instrucciones para ejecutar
1. Abrir el proyecto en IntelliJ IDEA
2. Ejecutar `Main.java` desde el paquete `ui`

---

**Repositorio:** https://github.com/zanaoriana/Llanquihue-tour  
**Fecha de entrega:** 29/06/2026

---
© Duoc UC | Escuela de Informática y Telecomunicaciones
