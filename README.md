# SOLID-Principles
It is a mnemonic acronym for five design principles intended to make 
object-oriented designs more understandable, flexible, and maintainable.
1. **S**ingle Responsibility Principle
2. **O**pen/Closed Principle
3. **L**iskov Substitution Principle
4. **I**nterface Segregation Principle
5. **D**ependency Inversion Principle


## 1) Single Responsibility
The class should solve only one problem it should
have a single reason to change. It helps us with **Code Reusability**.
It should be executed on both classes and methods.

    
## 2) Open/Closed
The class should be open for extension, closed for
modification.
In other words, any new functionality should be done by adding new classes instead of
changing existing one.

**How to implement this?**
- By adding new functionality to derived classes.
- Allow client access the original class with an abstract interface.


## 3) Liskov Substitution
If you substitute any type with one of its subtypes,
the behavior should not change.
> "If you have class B inherits from class A then class A should be replaceable by class B without any changes".


## 4) Interface Segregation
Avoid making a general interface contain all
methods.
> "Clients should not be forced to depend on methods they do not use".

**How to achieve this?**
- Avoid fat interface.
- Client must not implement unnecessary methods.


## 5) Dependency Inversion
Higher level classes should not know the implementation
of low level classes but depends on abstraction.
> "High level modules should not depend upon low level modules. Both should depend upon abstraction"

Dependency Inversion is a principle. Dependency Injection is the
implementation of this principle.
we should not depend on concrete classes. we should depend on abstract
classes.

[Coupling VS. Cohesion:](https://www.geeksforgeeks.org/software-engineering-differences-between-coupling-and-cohesion/)
Coupling describes the relationships between modules, and Cohesion describes
the relationships within them.
Usually low coupling and high cohesion is good for software.

<br>
<br>
<br>

Credits <3 :
[Mohammed Reda](https://youtube.com/playlist?list=PLnqAlQ9hFYdflFSS4NigVB7aSoYPNwHTL)
