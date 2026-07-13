# 🧠 Semana 8 – Desarrollo Orientado a Objetos I

## 👤 Autora del proyecto
- **Nombre completo:** Oriana Navarrete
- **Sección:** Online
- **Carrera:** Analista de Datos
- **Sede:** Online

---

## 📘 Descripción general del sistema
Sistema orientado a objetos en Java que integra interfaces, polimorfismo, colecciones genéricas e interfaz gráfica para la agencia **Llanquihue Tour**. Permite registrar y visualizar distintas entidades del sistema (guías turísticos, vehículos y colaboradores externos) desde una GUI basada en JOptionPane.

---

## 🧱 Estructura del proyecto
src/
├── model/   → Registrable (interfaz), GuiaTuristico, Vehiculo, ColaboradorExterno,
│              ServicioTuristico, RutaGastronomica, PaseoLacustre, ExcursionCultural
├── data/    → GestorEntidades (colección ArrayList<Registrable> con instanceof)
│              GestorServicios (colección polimórfica de servicios)
└── ui/      → Main (demostración por consola), VentanaPrincipal (GUI con JOptionPane)

### Clases e interfaces implementadas
- **Registrable** → interfaz con método `mostrarResumen()`
- **GuiaTuristico** → implementa Registrable, representa guías de la agencia
- **Vehiculo** → implementa Registrable, representa vehículos de la agencia
- **ColaboradorExterno** → implementa Registrable, representa colaboradores externos
- **GestorEntidades** → colección `ArrayList<Registrable>` con recorrido e `instanceof`
- **VentanaPrincipal** → GUI con JOptionPane para ingresar y visualizar entidades

### Conceptos aplicados
- Interfaz `Registrable` como contrato de comportamiento
- Herencia con `extends` y polimorfismo con `@Override`
- Colección genérica `ArrayList<Registrable>`
- Operador `instanceof` para diferenciación de tipos
- Interfaz gráfica con `JOptionPane`

---

## ⚙️ Instrucciones para ejecutar
1. Clonar el repositorio:
git clone https://github.com/zanaoriana/Llanquihue-tour.git
2. Abrir el proyecto en IntelliJ IDEA
3. Ejecutar `Main.java` desde el paquete `ui`
4. Primero se muestra la demostración por consola
5. Luego se abre la ventana gráfica con el menú de opciones

---

**Repositorio:** https://github.com/zanaoriana/Llanquihue-tour  
**Fecha de entrega:** 13/07/2026

---
© Duoc UC | Escuela de Informática y Telecomunicaciones
