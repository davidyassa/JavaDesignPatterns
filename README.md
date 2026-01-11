# ☕ Java Design Patterns (GoF) — AU_CCE Term 5 (Programming II)

A clean, runnable collection of **Gang of Four (GoF) design patterns** implemented in **Java**, organized by category (**Creational / Structural / Behavioural**) with simple demo runners.

---

## ✅ Patterns Covered

### Behavioural
- **Observer**
- **Iterator**
- **Strategy**
- **Chain of Responsibility**
- **State**

### Creational
- **Factory**
- **Abstract Factory**
- **Builder**
- **Prototype**
- **Singleton**

### Structural
- **Composite**
- **Adapter**
- **Proxy**
- **Flyweight**
- **Facade**
- **Bridge**
- **Decorator**

---

## 🚀 Running the Demos

You have **two ways** to run this project:

### Option 1: Run the prebuilt version (recommended)

Use the **`release/`** folder — it contains a ready-to-run JAR so you don’t need NetBeans or compiling.

1. Open `release/`
2. Open the `jar/` folder (this contains `Design_Patterns.jar`)
3. Run it:

* **Windows:** double-click `run.bat`
* **macOS:** double-click `run.command` (may show a one-time security prompt)
* **Linux:** double-click `Design Patterns.desktop` (some desktops may ask “Allow Launching” once)

If you prefer command line, go inside `release/jar/` and run:

```bash
java -jar "Design_Patterns.jar"
```

**Requirements:** Java **21**.

---

### Option 2: Run from NetBeans (source code)

Use this if you want to inspect/edit the code.

**Run the Menu App (recommended inside NetBeans)**

1. Open `Demo/DemoApp.java`
2. **Right-click → Run File**
3. Use the menu to pick the category + pattern demo

**Run a single pattern demo**

1. Expand a category package (e.g., `Behavioral/Strategy`)
2. Open the `*Demo` class
3. **Right-click → Run File**

> All demos extend `Demo` and implement `Runnable` (`run()`), so every pattern runs in a consistent way.

---

## ✍️ Conventions used
- `Demo.java` provides a common structure for consistent execution
- Patterns are separated by category and kept in their own packages
- Naming is kept straightforward (e.g., `Context`, `State`, `Strategy`, `Factory`, etc.)

