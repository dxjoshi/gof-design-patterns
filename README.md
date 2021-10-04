# GOF-design-patterns
Java implementations of popular design pattern, as explained in the Head First book     
[GoF Design Patterns in Java's core libraries!!](https://stackoverflow.com/questions/1673841/examples-of-gof-design-patterns-in-javas-core-libraries/2707195#2707195)

### Strategy Pattern:
-- Defines a family of algorithms, encapsulates each one and makes them interchangeable.  
-- Strategy lets the algorithm vary independently from clients that use it.  
> In the example code, each GroceryStore **HAS-A** Billing and Payment strategy.

### Adapter Pattern:
-- Converts the interface of a class into another interface that clients expect.  
-- It allows classes to work together that couldn't otherwise because of incompatible interfaces.

### Observer Pattern:
-- Defines one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.  
-- Strive for loosely coupled designs between objects that interact.  
-- Follows a IPublisher-Subscriber model  

### Decorator Pattern:
-- Attaches additional responsibilities to an object dynamically.  
-- Decorator provides a flexible alternative to subclassing for extending functionality.  

### Iterator Pattern:  
--  Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

### Factory Pattern:  
--  Defines interface for creating an object, but lets subclasses define which class to instantiate.  
--  It lets a class defer instantiation to subclasses.  

### Singleton Pattern:  
-- The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.
--   
## SOLID Principles:

1. **Single Responsibility Principle:**
   > A class should have only one reason to change.
2. **Open-Closed Principle:**  
   > Classes should be open for extension but closed for modification.  
3. **Liskov Substitution Principle:**  
   > Subclasses should be substitutable for their base classes.  
   For ex. If class A is a subtype of class B, then we should be able to replace B with A without breaking the application
4. **Interface Segregation Principle:**  
   > Clients should not be forced to implement interfaces that they do not use.
5. **Dependency Inversion Principle:**     
   > Depend on abstractions, not on concretions.  
   > 1. High-level modules should not depend on low-level modules. Both should depend on abstractions. 
   > 2. Abstractions should not depend on details. Details should depend on abstractions. 

##  Object Oriented Principles:  
1. Encapsulate what varies.
2. Favour composition over inheritance.
3. Program to an interface, not an implementation.
4. Strive for loosely coupled designs between objects that interact.
    
    