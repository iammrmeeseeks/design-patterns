# Encapsulation

Encapsulation means keeping data private inside a class and exposing controlled ways to read or change it.

In this example:
- `BankAccount` hides `balance` as a private field.
- Updates happen only through `deposit()` and `withdraw()`.
- Validation logic is also hidden inside the class (`validateAmount()`).

## Class Diagram

```mermaid
classDiagram
    class BankAccount {
      -String accountHolder
      -double balance
      +BankAccount(String accountHolder, double openingBalance)
      +String getAccountHolder()
      +double getBalance()
      +void deposit(double amount)
      +boolean withdraw(double amount)
      -void validateAmount(double amount)
    }
```

## Behavior Visualization

```mermaid
flowchart TD
    A[Client calls deposit/withdraw] --> B[validateAmount]
    B --> C{Valid amount?}
    C -- No --> D[Throw IllegalArgumentException]
    C -- Yes --> E{Enough balance for withdraw?}
    E -- No --> F[Return false]
    E -- Yes --> G[Update private balance]
    G --> H[Return success]
```

## ASCII Diagram

```text
+--------+      calls deposit()/withdraw()      +---------------------------+
| Client | -----------------------------------> |        BankAccount        |
+--------+                                      |---------------------------|
                                                | - accountHolder : String  |
                                                | - balance : double        |
                                                |   (private)               |
                                                |---------------------------|
                                                | + deposit(amount)         |
                                                | + withdraw(amount):bool   |
                                                | + getBalance():double     |
                                                +-------------+-------------+
                                                              |
                                                              | internal guard
                                                              v
                                                +---------------------------+
                                                | validateAmount(amount)    |
                                                +---------------------------+
                                                              |
                                      +-----------------------+----------------------+
                                      |                                              |
                                      v                                              v
                           invalid amount -> exception                valid -> update balance
```

Think of this like a bank counter: you cannot edit the ledger directly; all changes go through approved operations.
