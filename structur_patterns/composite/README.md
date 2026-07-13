# Composite Design Pattern

## Overview

This project demonstrates the **Composite Design Pattern**, one of the **Structural Design Patterns** from the Gang of Four (GoF).

The Composite Pattern allows you to compose objects into tree structures and treat both individual objects and groups of objects uniformly through a common interface.

---

## Motivation

Many real-world systems are naturally organized as hierarchical tree structures.

Examples include:

* File systems
* Organization hierarchies
* HTML DOM trees
* Menu systems
* GUI components

Without the Composite Pattern, client code would need to distinguish between individual objects and collections, making the code more complex and harder to maintain.

---

## Solution

The Composite Pattern introduces a common abstraction (`Component`) shared by both simple and complex objects.

The pattern consists of:

* **Component** – Declares the common interface.
* **Leaf** – Represents an individual object.
* **Composite** – Represents a collection of components and delegates operations to its children.

Because both implement the same interface, the client can interact with them in exactly the same way.

---

## UML Structure

```text
                   Component
                       ▲
             ┌─────────┴─────────┐
             │                   │
          Leaf              Composite
                                 │
                      List<Component>
```

---

## Project Structure

```text
Composite/
│
├── Component.java
├── Leaf.java
├── Composite.java
├── Client.java
└── README.md
```

---

## Example

Consider a file system:

```text
Root
├── File1.txt
├── File2.txt
└── Images
    ├── Cat.png
    └── Dog.png
```

A **Folder** may contain:

* Files
* Other folders

The client can simply execute:

```java
root.show();
```

without knowing whether `root` is a single file or a folder containing hundreds of nested components.

---

## When to Use

Use the Composite Pattern when:

* Your objects naturally form a tree hierarchy.
* Clients should treat individual objects and groups of objects uniformly.
* You want recursive operations over nested structures.
* You want to simplify client code by removing explicit type checks.

---

## Real-World Applications

The Composite Pattern is commonly used in:

* Windows File Explorer
* Google Drive
* HTML DOM
* Organization charts
* Menu systems
* GUI frameworks (Java Swing, JavaFX)
* Scene graphs in game engines

---

## Advantages

* Simplifies client code.
* Supports recursive tree structures naturally.
* Makes the system easier to extend.
* Promotes code reuse.
* Follows the **Open/Closed Principle (OCP)**.

---

## Disadvantages

* Can make the design more general than necessary.
* Debugging recursive structures may become more difficult.
* May introduce additional complexity for simple object hierarchies.

---

## Technologies

* Java
* Object-Oriented Programming (OOP)

---

## Design Pattern Category

**Structural Design Pattern**

---

## References

* *Design Patterns: Elements of Reusable Object-Oriented Software* — Gang of Four (GoF)
* *Head First Design Patterns*

---

## Author

**Yassen Abdelaziz**
