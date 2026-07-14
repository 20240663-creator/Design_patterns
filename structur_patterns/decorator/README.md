# Decorator Design Pattern - Code Editor Example

## Overview

This project demonstrates the **Decorator Design Pattern**, one of the **Structural Design Patterns** from the Gang of Four (GoF).

The Decorator Pattern allows behavior and responsibilities to be added to objects dynamically without modifying their original implementation. It provides a flexible alternative to subclassing by wrapping objects with decorators that implement the same interface.

In this example, a simple code editor displays project artifacts. Decorators are used to add visual indicators such as **Main** and **Error** to files while keeping the original `Artefact` class unchanged.

---

## Project Structure

```
structur_patterns.decorator/
│
├── Component.java          (Component Interface)
├── Artefact.java           (Concrete Component)
├── IsMain.java             (Concrete Decorator)
├── HasError.java           (Concrete Decorator)
├── Editor.java             (Client)
└── DecorateMain.java       (Application Entry Point)
```

---

## Components Explanation

### 1. **Component Interface: `Component`**

```java
package structur_patterns.decorator;

public interface Component {
    String render();
}
```

- Defines the common interface shared by both components and decorators.
- Allows the client to treat decorated and non-decorated objects uniformly.

---

### 2. **Concrete Component: `Artefact`**

```java
package structur_patterns.decorator;

public class Artefact implements Component {

    private String name;

    public Artefact(String name) {
        this.name = name;
    }

    @Override
    public String render() {
        return name;
    }
}
```

- Represents a project artifact (file).
- Implements the basic rendering behavior.
- Has no knowledge of decorators.

---

### 3. **Concrete Decorator: `IsMain`**

```java
package structur_patterns.decorator;

public class IsMain implements Component {

    private Component component;

    public IsMain(Component component) {
        this.component = component;
    }

    @Override
    public String render() {
        return "Main " + component.render();
    }
}
```

- Wraps another `Component`.
- Adds a **Main** label before rendering the wrapped object.

---

### 4. **Concrete Decorator: `HasError`**

```java
package structur_patterns.decorator;

public class HasError implements Component {

    private Component component;

    public HasError(Component component) {
        this.component = component;
    }

    @Override
    public String render() {
        return "Error " + component.render();
    }
}
```

- Wraps another `Component`.
- Adds an **Error** label before rendering the wrapped object.

---

### 5. **Client: `Editor`**

```java
package structur_patterns.decorator;

public class Editor {

    public void openProject(String path) {

        Component[] artefacts = {
            new IsMain(new Artefact("Main")),
            new Artefact("Demo"),
            new Artefact("EmailClient"),
            new HasError(new Artefact("EmailProvider"))
        };

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
```

- Works only with the `Component` interface.
- Doesn't know whether an artifact is decorated.
- Treats all components uniformly.

---

## Usage Example

```java
package structur_patterns.decorator;

public class DecorateMain {

    public static void main(String[] args) {

        var editor = new Editor();
        editor.openProject("...");
    }
}
```

**Output**

```
Main Main
Demo
EmailClient
Error EmailProvider
```

---

## Class Diagram

                 <<interface>>
                    Component
                        ▲
                        │
        ┌───────────────┼───────────────┐
        │               │               │
        │               │               │
    Artefact        IsMain         HasError
                        ◆──────────────▶ Component
                        |
                        |
                   wraps Component

                    ◆──────────────▶ Component
                    |
                HasError```

---

## Why Use the Decorator Pattern Here?

| Without Decorator | With Decorator |
|-------------------|----------------|
| `Artefact` must contain logic for Main, Error, ReadOnly, Favorite, etc. | Each responsibility is implemented by a separate decorator. |
| Every new feature requires modifying `Artefact`. | New decorators can be added without changing existing classes. |
| Many conditional statements. | Responsibilities are composed dynamically. |
| Tightly coupled code. | Loosely coupled code. |

---

## When to Use This Pattern

✅ Add responsibilities to individual objects dynamically.

✅ Extend object behavior without modifying existing code.

✅ Avoid creating many subclasses for every feature combination.

✅ Combine multiple behaviors at runtime.

---

## Advantages

- ✅ **Open/Closed Principle** – Add new decorators without modifying existing classes.
- ✅ **Loose Coupling** – The client depends only on the `Component` interface.
- ✅ **Flexible Composition** – Behaviors can be combined at runtime.
- ✅ **Code Reusability** – Decorators can be reused with different components.

---

## Real-World Applications

- Code editors (error markers, bookmarks, Git status)
- Text formatting (Bold, Italic, Underline)
- Java I/O Streams (`BufferedInputStream`, `DataInputStream`)
- Logging frameworks
- GUI widgets
- Notification systems

---

## Technologies Used

- **Java**
- **Object-Oriented Programming**
- **Decorator Design Pattern** (Structural Pattern)

---

## Design Pattern Category

**Structural Design Pattern** – Focuses on adding responsibilities to objects dynamically through composition instead of inheritance.

---

## References

- *Design Patterns: Elements of Reusable Object-Oriented Software* — Gang of Four (GoF)
- *Head First Design Patterns*
- Refactoring Guru – Decorator Pattern

---

## Author

**Yassen Abdelaziz**