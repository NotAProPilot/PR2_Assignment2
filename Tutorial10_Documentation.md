# Introduction about information hiding
- Well, one of the best way to demo first is to implement this (alternate) code:
```java
/**
* TODO: All of this
/*
public class ContactList{
  // for demo, assuming a list of students name.
  private ArrayList<String> contacts;
  if (contact.contains(name)){
      System.err.println("FUCKING DUPLICATE NAME");
    }
    else{
      
    }
  
  // constructor
  public ContactList {
    private ArrayList<String> contacts
    if 
    //TODO: (see Tutorial 9 for demo)
  }
  
  // TODO: getteR
  
  // TODO: setter
  
  // TODO: validator
  
  // TOOD: toString
  
  // TODO: repOK
  
  // (for List only): add
  // (for List only): remove
  // (for List only): insert
  // (for List only): get (and at which location)
  
  //
}
```
- Back to the example: Assuming you want a program to be able to ADD to a list, but you CAN'T access it. A simple implemetnation would be:
```java
public class Test{
  public static void main (String[] args{
    // create new ArrayList
    ArrayList<String> names = new ArrayList()<String>;
    this.name = name
    
    
    
    // add names
    names.add("A");
    names.add("B");
    
    //handle operation to object ContactList; at the class above 
    ContactList CSL = new ContactList(names);
    
    
    //TRY THIS:
    // If set to public, all of this will work:
    CSL.add("Name");
    contactLis
    
    // If set to private, 
    
}
```
- If we set something to public, well... it could be access/modify in a way that can violate the design principle. 

- Note: A `private` class is NOWHERE near enough to protect data. Why? 
- It went back to the design of Java, to the concept of Stack and Heap (to store object; and is WAYYY bigger than stack). When we create something, we have a pointer in Stack that point to space in Heap. 
- When we generate object ContactList, again, new pointer in Stack, and new space in Heap. APPEREANTLY, since name is the parameter of ContactList; when WE MODIFY NAME; the private ContactList is ALSO modified. The solution might be to just **create 2 seperate ArrayList**, so that 
- In other word:
```java
public ContactList(ArrayList<String> contatcs){
  this.contacts = contact // THIS IS VERY BAD
}

public ContactList(ArrayList<String> contatcs){
  // FOR THE LOVE OF GOD; PLEASE DO THIS, CLONE A FUCKING ARRAYLIST TO MAKE SURE PRIVATE IS PRIVATE
  ArrayList<String> clone = new ArrayList<String>();
  for (String name: contacts){
    clone.add(name)
  }
}
```
TL;DR: If you see something with `this.something = something` and if the getter and setter return `something`, FOR THE LOVE OF GOD; CLONE YOUR FUCKING ARRAY LIST!
- Note: Primitive data types are the exception to this. 


# A (horrible) example to demonstrate our point
```java
import java.util.Vector;
2 import userlib.DomainConstraint;
3 /**
4 * @overview SClass is student class, which is a group of
students that studies together throughout a university
degree.
5 *
6 * @attributes
242
8.7 Generic Class
7 * id Integer int
8 * name String
9 * students Student[] Vector<Student>
10 *
11 * @object
12 * A typical SClass is <i,n,s>, where id(i), name(n),
students(s). For example, <1,1c10,[]> is an SClass
representing the student class whose id is 1, whose name
is 1c10, and whose student list is empty.
13 *
14 * @abstract_properties
15 * mutable(id)=true /\ optional(id)=false /\ min(id)=1 /\
16 * mutable(name)=true /\ optional(name)=false /\
17 * length(name)=20 /\
18 * mutable(students)=true /\ optional(students)=false
19 */
20 public class SClass {
21 @DomainConstraint(type="Integer",mutable=true,optional=
false,min=1)
22 public int id;
23 @DomainConstraint(type="String",mutable=true,optional=
false,length=20)
24 public String name;
25 @DomainConstraint(type="Vector",mutable=true,optional=
false)
26 public Vector students;
27 /**
28 * @effects
29 * if name and students are valid
30 * initialise this as <0,name,students>
31 * else
32 * print error message "Invalid input"
33 */
34 public SClass(String name, Vector students) {
35 this.name = name;
36 this.students = students;
243
8.7 Generic Class
37 }
38
39 /**
40 * @effects
41 * return id
42 */
43 public int getId() {
44 return id;
45 }
46
47 /**
48 * @effects
49 * return name
50 */
51 public String getName() {
52 return name;
53 }
54
55 /**
56 * @effects
57 * return students
58 */
59 public Vector getStudents() {
60 return students;
61 }
62
63 @Override
64 public String toString() {
65 return "SClass:<"+id+","+name+","+students+">";
66 }
67 }
```
