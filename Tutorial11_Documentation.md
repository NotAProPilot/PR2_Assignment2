# Recap on common terms:
## Devried attribute:
- Stricly speaking: A derived attribute, also known as a calculated or computed attribute, is an attribute in a Java class that is calculated **based on the values of other attributes** or the internal state of the object. It is **not explicitly set by the user**, but rather **derived from other attributes** or logic within the class.

### Why we need devried attribute?
- It is a data that **depends/devrived** (or can be **calculated**) on another data. 
- Consider the following program, for instance. Let say, we have a **person** object. We'd like to know 2 attributes: `year of birth` (which we can ask directly) and `current age`.
- To calculate our `current age` we need to know one's `year of birth`. 

### Design pattern:
- It will usually have the following componenets:
```java
getYearofBirth()
  //TODO: code here
getAge(int YearofBirth()
  //TODO: code here
 
 setYearOfBirth()
 //
 getYearOfBirth()
 ```
 - However, there are a lot of problems with it. Worst case scenraio, we could get a situation when someone born in 2000 has the age of 1000, for instance. 
 - We could do in a short way:
 ```java
 getYearofBirth()
  //TODO: code here
getAge(int YearofBirth()
  return int age = currentYear - YearOfBirth;
 ```
 - BUT, it could go wrong very, very fast...
 ### Mr.Teacher decend into madness over Vinmart
 - I'm too lazy to type in here.
 - But essentially, let's imagine we want to to know how much money we made in a VinMart store. Easy, right? Just add all the reciept together.
 - However, what if we need to calculate that same number every week, every month, every year; for all provinces? Adding all the reciept? On average, it'll take around 90 billions calculations. 
 - What if instead, for every month, instead of adding all the reciept, we just add the number at the end of each day? That's a classic use of **devried attribute**, since the number is devried from othe data. 
 
 ### How to implement?
 - Well, assuming we have a program to calculate the circle, which run in 2 classes:
 ```java
 /**
 * @overview a program with 2 classes designed to demonstrate
 *           devried attribute; based on calculating the area of a circle given the radius
 */
 
 // create class Circle
 // TODO: DomainConstraint table supposed to go here
 public class Circle {
    private double radius;
    private double calculatedArea;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
        this.calculatedArea = calculateArea(); // Calculate the area upon object creation
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
        this.calculatedArea = calculateArea(); // Recalculate the area after setting radius
    }

    // Getter for calculatedArea
    public double getCalculatedArea() {
        return calculatedArea;
    }

    // Helper method to calculate the area
    private double calculateArea() {
        return Math.PI * Math.pow(radius, 2)
    }
}
```
- And here's the main class for running said program:
```java
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0); // Create a circle with radius 5.0
        System.out.println("Radius: " + circle.getRadius()); // Output: Radius: 5.0
        System.out.println("Area: " + circle.getCalculatedArea()); // Output: Area: 78.53981633974483

        circle.setRadius(7.0); // Set the radius to 7.0
        System.out.println("Radius: " + circle.getRadius()); // Output: Radius: 7.0
        System.out.println("Area: " + circle.getCalculatedArea()); // Output: Area: 153.93804002589985
    }
}
```
- Why there are 2 `this.calculatedArea`? If you look at the `Main` method, you will see there are 2 `setRadius`. So, as long as we want to change the 

 
-TL;DR: There are 4 steps:
1. Generate a derived attribute
2. Setter
3. Getter
4. Activate a method that uses derived attribue (practice that using the modified PCProg Program)


## Singleton class

