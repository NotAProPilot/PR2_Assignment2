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
- Note: `String` is the exception to this. 


# A (horrible) example to demonstrate our point

