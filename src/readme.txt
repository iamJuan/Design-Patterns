1----------------------------------------------------------------------------------------------------------1
FACTORY PATTERN
Factory pattern is one of the most used design patterns in Java. This type of design pattern comes under 

creational pattern as this pattern provides one of the best ways to create an object.

In Factory pattern, we create object without exposing the creation logic to the client and refer to newly 

created object using a common interface.

2----------------------------------------------------------------------------------------------------------2
SINGLETON PATTERN
Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes under 

creational pattern as this pattern provides one of the best ways to create an object.

This pattern involves a single class which is responsible to create an object while making sure that only 

single object gets created. This class provides a way to access its only object which can be accessed 

directly without need to instantiate the object of the class.

3----------------------------------------------------------------------------------------------------------3

Builder pattern builds a complex object using simple objects and using a step by step approach. This type of 

design pattern comes under creational pattern as this pattern provides one of the best ways to create an 

object.

A Builder class builds the final object step by step. This builder is independent of other objects.

4----------------------------------------------------------------------------------------------------------4

Prototype pattern refers to creating duplicate object while keeping performance in mind. This type of design 

pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

This pattern involves implementing a prototype interface which tells to create a clone of the current object. 

This pattern is used when creation of object directly is costly. For example, an object is to be created 

after a costly database operation. We can cache the object, returns its clone on next request and update the 

database as and when needed thus reducing database calls.

5----------------------------------------------------------------------------------------------------------5

Adapter pattern works as a bridge between two incompatible interfaces. This type of design pattern comes 

under structural pattern as this pattern combines the capability of two independent interfaces.

This pattern involves a single class which is responsible to join functionalities of independent or 

incompatible interfaces. A real life example could be a case of card reader which acts as an adapter between 

memory card and a laptop. You plugin the memory card into card reader and card reader into the laptop so that 

memory card can be read via laptop.

We are demonstrating use of Adapter pattern via following example in which an audio player device can play 

mp3 files only and wants to use an advanced audio player capable of playing vlc and mp4 files. 

6----------------------------------------------------------------------------------------------------------6

Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary 

independently. This type of design pattern comes under structural pattern as this pattern decouples 

implementation class and abstract class by providing a bridge structure between them.

This pattern involves an interface which acts as a bridge which makes the functionality of concrete classes 

independent from interface implementer classes. Both types of classes can be altered structurally without 

affecting each other.

We are demonstrating use of Bridge pattern via following example in which a circle can be drawn in different 

colors using same abstract class method but different bridge implementer classes. 

7----------------------------------------------------------------------------------------------------------7

Composite pattern is used where we need to treat a group of objects in similar way as a single object. Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy. This type of design pattern comes under structural pattern as this pattern creates a tree structure of group of objects.

This pattern creates a class that contains group of its own objects. This class provides ways to modify its group of same objects.

8----------------------------------------------------------------------------------------------------------8
Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.

This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.

We are demonstrating the use of decorator pattern via following example in which we will decorate a shape with some color without alter shape class.

9----------------------------------------------------------------------------------------------------------9
Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system. This type of design pattern comes under structural pattern as this pattern adds an interface to existing system to hide its complexities.

This pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.

10----------------------------------------------------------------------------------------------------------10
Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance. This type of design pattern comes under structural pattern as this pattern provides ways to decrease object count thus improving the object structure of application.

Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found. We will demonstrate this pattern by drawing 20 circles of different locations but we will create only 5 objects. Only 5 colors are available so color property is used to check already existing Circle objects.


REF: Tutorials Point, https://www.tutorialspoint.com/design_pattern/