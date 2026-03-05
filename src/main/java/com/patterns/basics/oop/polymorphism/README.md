# Polymorphism

Polymorphism allows the same interface to represent different concrete behaviors.

In this example:
- `Shape` defines a common contract: `name()` and `area()`.
- `Circle` and `Rectangle` implement `Shape` differently.
- `PolymorphismDemo` treats both as `Shape` and calls the same methods.

## Class Diagram

```mermaid
classDiagram
    class Shape {
      <<interface>>
      +String name()
      +double area()
    }

    class Circle {
      -double radius
      +Circle(double radius)
      +String name()
      +double area()
    }

    class Rectangle {
      -double width
      -double height
      +Rectangle(double width, double height)
      +String name()
      +double area()
    }

    Shape <|.. Circle
    Shape <|.. Rectangle
```

## Runtime Visualization

```mermaid
sequenceDiagram
    participant Demo as PolymorphismDemo
    participant S1 as Shape(Circle)
    participant S2 as Shape(Rectangle)

    Demo->>S1: area()
    S1-->>Demo: Circle.area() result
    Demo->>S2: area()
    S2-->>Demo: Rectangle.area() result
```

## ASCII Diagram

```text
+------------------------+
| Shape (interface)      |
|------------------------|
| + name()               |
| + area()               |
+-----------+------------+
            ^
            | implements
   +--------+--------+----------------+
   |                 |                |
+--+-----------------+-+   +----------+-------------+
| Circle               |   | Rectangle              |
|----------------------|   |------------------------|
| - radius : double    |   | - width  : double      |
| + area() = PI * r * r|   | - height : double      |
+----------------------+   | + area() = w * h       |
                           +------------------------+

+----------------------------+
| PolymorphismDemo           |
|----------------------------|
| Shape[] shapes = {C, R}    |
| for each s -> s.area()     |
| runtime picks right area() |
+----------------------------+
```

Think of this like calling a common `play()` button on different music apps: same action, different internal implementation.
