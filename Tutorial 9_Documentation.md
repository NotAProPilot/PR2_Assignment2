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
```


### Constructor class
- Consider if we want to construct a Banh Chung object (WHYYYYY...?)
(image)


- So, in order to **construct** something, in our case, Banh Chung, it need to **take in ingredients** (state space specs), and return an instance. 
- A notable thing: This instance will have the same name as in our class. 
- An example (using the Person class in last week problem):
```java
/**
* if a method is NOT optional -> put something inside the param.
* and also we need to add the description before. 
* ----------------------(remove this line and anything above it)
* @effects <pre>
* if id, name is valid
*   initialize this as <id, name>
* else 
*   throws NotPossibleExeception
* </pre>
*/
public Person (@int id, String name) (@AttrRef("id") int id, @AttrRef )
{
if 
  this.id = id; // to make sure that this is a value that the user input in
  this.name = name;
  
}

// it returns nothing; but instead of void, it'll return that Object.
```
### Observer/Getter
- Usually start with get.
- The principle behind it is this: for each 
```java
/**
* since id is int, the get method data type is THE SAME as the type of data.
* ------ (ignore this line) --------- 
* @effects <pre>
*   return this.id
* </pre>
@DOpt (type= OptType.observer)
@AttrRef("id")
public int getId() {
  return this.id;

}
```

### Mutator:
- For each attribute which is mutable, creater a Setter (Mutator)
- We use the class Person here (see Textbook for the original 
```java
/**
* @modifies this.name
* @effects <pre>
*   if newName is valid
*     set this.name = newName\
*     return true
*   else
*     return false
* </pre>

public boolean setName (string newName)
{
this.name = newName;
}
```
- You can see how it plays out in the **following** picture:
![image](https://user-images.githubusercontent.com/113848893/229960288-267ac513-b6be-4e08-9ddc-97e5734c895a.png)

### Helper




### Validators
- The idea is this, for each attribute, we will have a validator. 
```java
/**
* @effects <pre>
*   if id is valid
*     return true (hence the boolean)
*   else
*     return false
* </pre>
private boolean validateID(){
  // Since we've already tested most of the previous conditions
  // We will test something that is unique.
  // int data has a min or max. So, we will tets that.
  
 
  // Also we will modify the Constructor above: 
}
```
- Some note about String (and null)
  - In some case

![image](https://user-images.githubusercontent.com/113848893/229962007-6bb33c64-89bb-44d7-be43-965396e6bd6c.png)

- And the constructor located aboved can be modify to this:
![image](https://user-images.githubusercontent.com/113848893/229962321-51df27a3-bb10-49f9-a8ce-391facef9422.png)

- A more update version will look like this:\
 ![image](https://user-images.githubusercontent.com/113848893/229962530-303e5dfb-1241-48d2-a737-4380e33573ef.png)

### RepOK
- Using the Banh Chung example: This is to MAKE SURE WE DON'T GET FOOD POSIONING.

![image](https://user-images.githubusercontent.com/113848893/229963112-da7c4e4d-e8cc-4e35-b1c5-58cb7366d2ef.png)

- But what if something is an Object, like in our MobilePhone class?
- 

- And the end result:
![image](https://user-images.githubusercontent.com/113848893/229963557-487820ed-6648-41f8-ae8c-612f3a7843ae.png)



### toString 
- A sample of ```toString``` can be founded here:\
![image](https://user-images.githubusercontent.com/113848893/229963680-42145da6-9c1b-408e-9a21-e16e0866d9de.png)


###
- And an overview of this program in the beginning here:
![image](https://user-images.githubusercontent.com/113848893/229953569-ed4e2a7a-8c7b-4558-9748-78ef7760551f.png)


```
## Some notes on Assignment 2:
- ```Set``` and ```PCProg``` are given. 
