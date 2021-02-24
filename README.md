# GOF-design-patterns
Java implementations of popular design pattern

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
-- Follows a Publisher-Subscriber model  