# GOF-design-patterns
Java implementations of popular design pattern, as explained in the Head First book     
[GoF Design Patterns in Java's core libraries!!](https://stackoverflow.com/questions/1673841/examples-of-gof-design-patterns-in-javas-core-libraries/2707195#2707195)

-- A Pattern is a solution to a problem in a context.   
-- The context is the situation in which the pattern applies. This should be a recurring situation.
-- The problem refers to the goal you are trying to achieve in this context, but it also refers to any constraints that occur in the context.   
-- The solution is what you’re after: a general design that anyone can apply which resolves the goal and set of constraints.    



### Creational Design Patterns:
1. Singleton Pattern
1. Factory Pattern
1. Abstract Factory Pattern
1. Builder Pattern
1. Prototype Pattern

### Structural Design Patterns:
1. Adapter Pattern
1. Composite Pattern
1. Proxy Pattern
1. Flyweight Pattern
1. Facade Pattern
1. Bridge Pattern
1. Decorator Pattern

### Behavioral Design Patterns:
1. Template Method Pattern
1. Mediator Pattern
1. Chain of Responsibility Pattern
1. Observer Pattern
1. Strategy Pattern
1. Command Pattern
1. State Pattern
1. Visitor Pattern
1. Interpreter Pattern
1. Iterator Pattern
1. Memento Pattern

### Strategy Pattern:
-- Defines a family of algorithms, encapsulates each one and makes them interchangeable.  
-- Strategy lets the algorithm vary independently from clients that use it.  
> In the example code, each GroceryStore **HAS-A** Billing and Payment strategy.

### Observer Pattern:
-- Defines one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.  
-- Strive for loosely coupled designs between objects that interact.  
-- Follows a IPublisher-Subscriber model  

### Decorator Pattern:
-- Attaches additional responsibilities to an object dynamically.  
-- Decorator provides a flexible alternative to subclassing for extending functionality.  

### Factory Pattern:  
-- Defines interface for creating an object, but lets subclasses define which class to instantiate.  
-- It lets a class defer instantiation to subclasses.  

### Singleton Pattern:  
-- It ensures a class has only one instance, and provides a global point of access to it.

### Command Pattern:  
-- It encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.

### Adapter Pattern:  
-- Converts the interface of a class into another interface the clients expect.     
-- Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.   
-- There are actually two kinds of adapters: **object adapters** and **class adapters**. The only difference is that with class adapter we subclass the Target and the Adaptee, while with object adapter we use composition to pass requests to an Adaptee.

### Facade Pattern:     
-- It provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use. It alters an interface, but for a different reason: to simplify the interface.       
-- A facade not only simplifies an interface, it decouples a client from a subsystem of components.     
-- **Facades and adapters may wrap multiple classes, but a facade’s intent is to simplify, while an adapter’s is to convert the interface to something different.**  

### Template Method Pattern:           
-- It defines the skeleton of an algorithm in a method, deferring some steps to subclasses and lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.   
-- A hook is a method that is declared in the abstract class, but only given an empty or default implementation. This gives subclasses the ability to “hook into” the algorithm at various points, if they wish; a subclass is also free to ignore the hook.
   
### Iterator Pattern:
-- It provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.     
-- It allows traversal of the elements of an aggregate without exposing the underlying implementation.
-- It also places the task of traversal on the iterator object, not on the aggregate, which simplifies the aggregate interface and implementation, and places the responsibility where it should be.      
   
### Composite Pattern:  
-- The Composite Pattern allows you to compose objects into tree structures to represent part-whole hierarchies.    
-- Composite lets clients treat individual objects and compositions of objects uniformly.   
-- The Composite Pattern allows us to build structures of objects in the form of trees that contain both compositions of objects and individual objects as nodes. Using a composite structure, we can apply the same operations over both composites and individual objects. In other words, in most cases we can ignore the differences between compositions of objects and individual objects.
   
### State Pattern:   
-- The State Pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class.    
-- The states are used by the Context to represent its internal state and behavior, so all requests to the states come from the Context. Clients don’t directly change the state of the Context. It is the Context’s job to oversee its state, and you don’t usually want a client changing the state of a Context without that Context’s knowledge.    


### Proxy Pattern:    
-- Use the Proxy Pattern to create a representative object that controls access to another object, which may be remote, expensive to create, or in need of securing.    
-- It provides a surrogate or placeholder for another object to control access to it.  A few forms are Remote Proxy, Virtual Proxy.  
-- A remote proxy acts as a local representative to a remote object. A Remote Object is an object that lives in the heap of a different Java Virtual Machine (or more generally, a remote object that is running in a different address space). A Local representative is an object that you can call local methods on and have them forwarded on to the remote object.   
-- Virtual Proxy acts as a representative for an object that may be expensive to create. It often defers the creation of the object until it is needed, it also acts as a surrogate for the object before and while it is being created. After that, the proxy delegates requests directly to the RealSubject.  

### Bridge Pattern:    
-- Use the Bridge Pattern to vary not only your implementations, but also your abstractions.

### Builder Pattern: 
-- Use the Builder Pattern to encapsulate the construction of a product and allow it to be constructed in steps.    

### Chain of Responsibility Pattern:    
-- Use the Chain of Responsibility Pattern when you want to give more than one object a chance to handle a request. 

### Flyweight Pattern:  
-- Use the Flyweight Pattern when one instance of a class can be used to provide many “virtual instances.”  

### Interpreter Pattern:    
-- Use the Interpreter Pattern to build an interpreter for a language.  

### Mediator Pattern:   
-- Use the Mediator Pattern to centralize complex communications and control between related objects.   

### Memento Pattern:    
-- Use the Memento Pattern when you need to be able to return an object to one of its previous states; for instance, if your user requests an “undo.”   

### Prototype Pattern:  
-- Use the Prototype Pattern when creating an instance of a given class is either expensive or complicated. 

### Visitor Pattern:        
-- Use the Visitor Pattern when you want to add capabilities to a composite of objects and encapsulation is not important.  


### Compound Patterns:  
-- A compound pattern combines two or more patterns into a solution that solves a recurring or general problem. 



## [SOLID Principles](https://www.baeldung.com/solid-principles):

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
   
## [Principle of Least Knowledge(Law Of Demeter)](https://dzone.com/articles/the-genius-of-the-law-of-demeter) 
For all classes C, and for all methods M attached to C, all objects to which M sends a message must be:     

1. self (this in Java)
1. M’s argument objects
1. Instance variable objects of C
1. Objects created by M, or by functions or methods which M calls
1. Objects in global variables (static fields in Java)      
**PS**: The term “objects to which M sends a message” roughly translates to “objects used by M,” or in a more practical definition “objects on which M calls a method on.”

## [The Hollywood Principle](https://deviq.com/principles/hollywood-principle):      
-- With the Hollywood Principle, we allow low-level components to hook themselves into a system, but the high-level components determine when they are needed, and how. In other words, the high-level components give the low-level components a “don’t call us, we’ll call you” treatment.


##  Object Oriented Principles:  
1. Encapsulate what varies.
2. Favour composition over inheritance.
3. Program to an interface, not an implementation.
4. Strive for loosely coupled designs between objects that interact.
5. A cohesive class does one thing very well and doesn't try to do or be something else.         
6. The software must do what its customers wants it to do. Apply basic OO principles to add flexibility. Strive for a maintainable reusable design.     
7. Don't Repeat Yourself (DRY): Avoid duplicate code by abstracting out things that are common andplacing those things in a single location.    
    
## Thinking in Patterns:    
- Keep it simple (KISS)
- Design Patterns aren’t a magic bullet; in fact, they’re not even a bullet!    
- You know you need a pattern when...   
- Refactoring time is Patterns time!    
- Take out what you don’t really need. Don’t be afraid to remove a Design Pattern from your design.     
- If you don’t need it now, don’t do it now.    

## Your Mind in Patterns:   
- **The Beginner** uses patterns everywhere.    
- As learning progresses, **the Intermediate** mind starts to see where patterns are needed and where they aren’t.  
- **The Zen** mind is able to see patterns where they fit naturally.    

## Anti-Pattern:  
- An anti-pattern tells you why a bad solution is attractive.
- An anti-pattern tells you why that solution in the long term is bad.
- An anti-pattern suggests other patterns that are applicable which may provide good solutions. 

##  Used at Work?
Template Method Pattern --- AbstractDataSourceN6Feed in yc-feedhandler implementation  

## Important Notes:
- **Hollywood Principle vs Dependency Inversion Principle:**
    - The Dependency Inversion Principle teaches us to avoid the use of concrete classes and instead work as much as possible with abstractions. The Hollywood Principle is a technique for building frameworks or components so that lower-level components can be hooked into the computation, but without creating dependencies between the lower-level components and the higher-level layers. So, they both have the goal of decoupling, but the Dependency Inversion Principle makes a much stronger and general statement about how to avoid dependencies in design.
    - The Hollywood Principle gives us a technique for creating designs that allow low-level structures to interoperate while preventing other classes from becoming too dependent on them.  

## Important OOAD:  
- **IS-A vs HAS-A:** 
    - IS-A refers to inheritance whereas HAS-A refers to composition or aggregation.
    - IS-A breaks in certain situations(Square IS-A Rectangle), so use inheritance when one object behaves like another, rather just when the IS-A relationship applies.    
     