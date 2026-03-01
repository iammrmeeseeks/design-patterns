# design-patterns

A minimal Java Maven project intended as a starting point for experimenting with design patterns and core OOP concepts.

At the moment, the repository contains:

- The project builds successfully with Maven.
- The repository includes `com.patterns.Main` plus dedicated OOP demo classes.
- Running the application prints `Hello, World!`.
- A Maven-managed `src/main/java/com/patterns/basics/oop` area with examples for:
  - Encapsulation
  - Inheritance
  - Polymorphism
  - Composition
- No concrete design pattern implementations have been added yet beyond the OOP basics examples.

## Tech Stack

- Java 25
- Maven

The Java version is defined in `pom.xml` with both `maven.compiler.source` and `maven.compiler.target` set to `25`.

## Project Structure

```text
.
|-- pom.xml
`-- src
    `-- main
        `-- java
            `-- com
                `-- patterns
                    |-- Main.java
                    `-- basics
                        `-- oop
                            |-- encapsulation
                            |-- inheritance
                            |-- polymorphism
                            `-- composition
```

## Build

From the repository root:

```bash
mvn clean package
```

This produces:

```text
target/design-patterns-1.0-SNAPSHOT.jar
```

## Run

After building, run the current entry point with:

```bash
java -cp target/design-patterns-1.0-SNAPSHOT.jar com.patterns.Main
```

Current output:

```text
Hello, World!
```

## OOP Basics Examples

The examples now live inside the Maven source tree under `src/main/java/com/patterns/basics/oop`.

After building, you can run the demos directly from the compiled classes in `target/classes`:

```bash
java -cp target/classes com.patterns.basics.oop.encapsulation.EncapsulationDemo
java -cp target/classes com.patterns.basics.oop.inheritance.InheritanceDemo
java -cp target/classes com.patterns.basics.oop.polymorphism.PolymorphismDemo
java -cp target/classes com.patterns.basics.oop.composition.CompositionDemo
```

## Current Status

This repository is ready to be used as a base for adding examples of design patterns such as:

- Creational patterns
- Structural patterns
- Behavioral patterns

As new pattern examples are added, this README should be expanded to document each implementation and how to run it.
