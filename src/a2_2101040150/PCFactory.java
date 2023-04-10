package a2_2101040150;

 // using the TextIO class as required


/**
 * @overview PCFactory is a program that is used to create PC.
 * This class must also be a singleton. In layman's term, this is a simple class uses Customer and has only one instance.
 * This work is based on the works in Chapter 9 of textbook,
 * and javatpoint: https://www.javatpoint.com/singleton-design-pattern-in-java
 */
public class PCFactory{
    // create a factory method
    private static PCFactory factory = new PCFactory();

    private PCFactory(){
        // private constructor to prevent instantiation from outside.
        // in other words: this is empty, on purpose.
    }
    public static PCFactory getFactory(){
        return factory;
    }

    /**
     * @param model
     * @param year
     * @param manufacture
     * @param comps
     * @return
     */
    public PC createPC(String model, Integer year, String manufacture, Set<String> comps) {
        // create new PC, with in the class PC (hence the highly confusing command)
        PC newPC = new PC(model, year, manufacture, comps);
        return newPC;
    }




}

    // ASK USER INPUT HERE, DO NOT USE SCANNER
    // use textIO AND do not submit utils an textio

