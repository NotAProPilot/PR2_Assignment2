package a2_2101040150;

import utils.AttrRef;
import utils.OptType;
import utils.DomainConstraint;
import utils.NotPossibleException;
import utils.DOpt;

/**
 * @overview PCFactory is a program that is used to create PC.
 *           This class must also be a singleton. In layman's term,
 *           this is a simple class uses Customer and has only one instance.
 */
public class PCFactory{
    @DomainConstraint(type = "PCFactory", mutable = false, optional = false)
    // create a factory method
    private static PCFactory factory = new PCFactory();

    private PCFactory(){
        // private constructor to prevent instantiation from outside.
        // in other words: this is empty, on purpose.
    }
    @DOpt(type = OptType.Helper)
    @AttrRef("instance")
    public static PCFactory getFactory(){
        return factory;
    }

     // this method creating PC
    public PC createPC(String model, Integer year, String manufacture, Set<String> comps) {
        // create new PC, with in the class PC (hence the highly confusing command)
        PC newPC = new PC(model, year, manufacture, comps);
        return newPC;
    }
}



