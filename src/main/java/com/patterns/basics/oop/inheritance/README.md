# Inheritance

Inheritance lets one class reuse and extend behavior from another class.

In this example:
- `Animal` provides common state and behavior (`name`, `eat()`, `move()`).
- `Dog` and `Bird` inherit from `Animal`.
- Child classes override `move()` to provide specialized behavior.

## Class Diagram

```mermaid
classDiagram
    class Animal {
      -String name
      +Animal(String name)
      +String getName()
      +void eat()
      +void move()
    }

    class Dog {
      +Dog(String name)
      +void move()
      +void bark()
    }

    class Bird {
      +Bird(String name)
      +void move()
    }

    Animal <|-- Dog
    Animal <|-- Bird
```

## Behavior Visualization

```mermaid
flowchart TD
    A[Animal base class] --> B[Dog subclass]
    A --> C[Bird subclass]
    B --> D[Dog.move: runs]
    C --> E[Bird.move: flies]
```

## ASCII Diagram

```text
                     +-------------------------+
                     |         Animal          |
                     |-------------------------|
                     | - name : String         |
                     | + eat()                 |
                     | + move()                |
                     +------------+------------+
                                  ^
                 extends          / \
                                /     \
                               /       \
              +----------------+--+   +--+----------------+
              |       Dog         |   |       Bird        |
              |-------------------|   |-------------------|
              | + bark()          |   | + move()          |
              | + move() override |   |   (override)      |
              +-------------------+   +-------------------+
```

Think of this like a family hierarchy: children share family traits but can have their own specific abilities.
