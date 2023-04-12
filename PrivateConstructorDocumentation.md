# Why using `private` in the first place?
- Sometimes, we want to implement a method that is **only accessible with in a class.**
- Assuming we have a program with 2 class: Ex1 and ContactList.
## Scenario 1: Coding as usual, without using any private constructor
- The `ContactList` class will look like this:
```java
import java.util.ArrayList;

// initializing ContactList
public class ContactList {
    public ArrayList<String> contacts;

    // constructors

    public ContactList(ArrayList<String> contacts) {
        // TODO: validiate
        this.contacts = copy;
    }
    
    // method to add:
    public void add (String name)
        this.contacts.add(name) // add "name" to this.contacts

    // getter, which GET the data
    public ArrayList<String> getContacts() {
        return this.contacts
    }
}
```
and the `Ex1` will contain Main:
```java
public class Ex1{
  public static void main (String []args){
  
  // initialize an ArrayList
  ArrayList<String> names = new ArrayList<String>();
  
  // add name to said ArrayList names:
  names.add("A");
  names.add("B");
  
  // Creating a ContactList object named CLS; which accept the ArrayList names above
  ContactList CLS = new ContactList(names);
  
  // Attemp to add name directly to CLS:
  CLS.add("C");
  CLS.add("D");
  
  // Display the result after create CLS, using getContacts:
  System.out.println(CLS.getContacts())
  
  //
  }
}
```
The result would be:
`
A,B,C,D
`
## Scenario 2: Using `private` constructor
- Well, you might want to **RESTRICT** access to something. Imagine you want to implement an data base with 2 class:
```java
import java.util.ArrayList;

public class ReturnMyBalance {
    private ArrayList<Integer> balance;  // Declare balance variable as an instance field

    // Private constructor to prevent direct instantiation
    private ReturnMyBalance() {
        this.balance = new ArrayList<Integer>();
    }

    // Static method to retrieve a new instance of ReturnMyBalance
    public static ReturnMyBalance getYourBalance() {
        if (balance == null) {
            balance = new ReturnMyBalance();
        } else {
            throw new NotPossibleException("Balance already exists.");
        }
    }

    // Method to add money to the balance
    public void addMoney(int money) {
        this.balance.add(money);
    }

    // Method to retrieve the balance
    public ArrayList<Integer> getBalance() {
        return this.balance;
    }
}
```
- And another class would be:
```java
import java.util.Scanner;

public class Main{
    public static void main (String []args){
        // initialize an ArrayList of balance
        ArrayList<Int> money = new ArrayList<String>();
        
        //accept user input of money
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        
        //add money
        // first initialize a ReturnMyBalance method
        ReturnMyBalance returnMoney = new ReturnMyBalance(money);
        
        //add money:
        //THIS IS THE ONLY WAY TO GET MONEY: money.add() WILL NOT WORK.
        returnMoney.add(n);
        
        //display
        System.out.println(returnMoney.getBalance.add(n));
        
    }
}
