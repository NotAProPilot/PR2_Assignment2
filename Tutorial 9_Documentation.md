## Notes
- Tutorial 9 continues on the work of Tutorial 8 and Exercise in the Coursebook.

## Review on last week
1. A OOP head space in java, *usually*, have the following contents:
```java
/**
* @overview
* @attributes
* (name) (class wrapper) (data type of class wrapper in the PL)
* @object
* @abstract_properties
*/
```

2. State space specification:
```java
public class ClassName {
  @DomainConstraint()
  priavte (datatype) name ();
....
}
```
3. The implementation (ah, it's what we talk about today).

## Implementation
- Last week, we've write the headspace and state space specification. It's method time this week. 
- An (unifinish) code of the program: 
```java
/**
(state space)
/*



### Constructor class
- Consider if we want to construct a Banh Chung object (WHYYYYY...?)
(image)


- So, in order to **construct** something, in our case, Banh Chung, it need to **take in ingredients** (state space specs), and return an instance. 
- A notable thing: This instance will have the same name as in our class. 
- An example (using the Person class in last week problem):
```java
public Person 
// it returns nothing; but instead of void, it'll return that Object.
```



![image](https://user-images.githubusercontent.com/113848893/229953569-ed4e2a7a-8c7b-4558-9748-78ef7760551f.png)


```
## Some notes on Assignment 2:
- ```Set``` and ```PCProg``` are given. 
