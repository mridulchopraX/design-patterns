# Factory Design Pattern

## Overview

The **Factory Design Pattern** is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. Instead of directly instantiating objects using the `new` keyword, the Factory pattern delegates the responsibility of object creation to a factory class. This makes the code more flexible, maintainable, and scalable, especially when dealing with complex object creation logic.

In simple terms, the Factory pattern helps you create objects without exposing the instantiation logic to the client and refers to the newly created object via a common interface.

## Why Use Factory?

- **Encapsulation of Object Creation**: The pattern helps in encapsulating the object creation logic in one place, which simplifies future code modifications.
- **Flexibility**: It allows for greater flexibility in deciding which objects need to be created, particularly when dealing with multiple types of related objects.
- **Looser Coupling**: The client code is decoupled from the concrete classes that it needs to instantiate, leading to more maintainable and extensible code.
- **Promotes Code Reusability**: Helps in reusing code for object creation across the system.

## Key Characteristics

- **Factory Method**: A method used to instantiate objects in a class, allowing subclasses to decide which class to instantiate.
- **Abstract Product**: The interface or abstract class for objects created by the factory method.
- **Concrete Product**: The actual object that gets created by the factory method.
- **Factory Class**: The class responsible for creating objects.

## Structure

```plaintext
+----------------------+
|      Product          |  <-- Interface or abstract class
+----------------------+
        ▲
        |
+----------------------+
|   ConcreteProductA    |  <-- Concrete implementation of the Product
+----------------------+
+----------------------+
|   ConcreteProductB    |  <-- Concrete implementation of the Product
+----------------------+

+----------------------+
|      Factory          |  <-- Factory class that contains the factory method
+----------------------+
| + createProduct()     |  <-- Factory method that returns Product
+----------------------+
