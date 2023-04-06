package a2_2101040150;
/*
 * Import all the necessary package
 */





import utils.*; // import EVERYTHING at once. Now I start to realize.

import utils.DOpt;
import utils.DomainConstraint;
import utils.OptType;

// PART 1: HEADER SPECIFICATIONS

/**
 * @overview A PC (personal computer) is a multipurpose microcomputer
 * whose size, capabilities, and price mak
 * @attributes
 * model String  String
 * year  Integer int
 * manufacture String String
 * comps Set<String> Set
 * @object A typical PC is PC = < md, y, m, c >
 *         where md = model (md), year (y), manufacture (m) and comps (c)
 * @abstract_properties (a short description of the table):
 * mutable(md) = true /\ optional (md) = false /\ length (md) = 20
 * mutable(y) = false /\ optional (y) = false /\ min (y) = 1984
 * mutable(m) = false /\ optional (m) = false /\ length (y) = 15
 * mutable(c) = true /\ optional (c) = false
 */

// PART 2: STATE SPACE SPECIFICATION
public class PC {
    @DomainConstraint(type = "String", mutable = true, optional = false)
    private String model;
    @DomainConstraint(type = "Integer", mutable = false, optional = false)
    private int year;
    @DomainConstraint(type = "String", mutable = false, optional = false)
    private String manufacturer;
    @DomainConstraint(type = "Set<String>", mutable = false, optional = false)
    private Set comps;

    // PART 3: CONSTRUCTOR CLASS

    // constructor: optional = false -> params
    /**
     * @effects <pre>
     *     if model, year, manufacturer and comps is valid
     *      initializes this as <model, year, manufacturer and comps>
     *     else
     *      throws NotPossibleException
     * </pre>
     */
    public PC(@AttrRef("model") String model, @AttrRef("year") int year, @AttrRef("manufacturer") String manufacturer, @AttrRef("comps") Set comps) throws NotPossibleException {
        if (validateId(id) && validateName(name)) {
            this.model = model;
            this.year = year;
            this.manufacturer = manufacturer;
            this.comps = comps;
        } else {
            throw new NotPossibleException("You have messed up! Invalid data!");
        }
    }


    // PART 4: GETTER (OR OBSERVER, I DON'T GIVE A F*CK)
    // Do note that EACH ATTRIBUTE will GET IT OWNS GETTER.

    /**
     * @effects <pre>
     *     return this.model
     * </pre>
     */
    @DOpt(type = OptType.Observer) @AttrRef("id")
    public String getModel() {
        return this.model;
    }

    /**
     * @effects <pre>
     *     return this.year
     * </pre>
     */
    @DOpt(type = OptType.Observer) @AttrRef("id")
    public int getYear() {
        return this.year;
    }

    /**
     * @effects <pre>
     *    return this.manufacturer
     * </pre>
     */
    @DOpt(type = OptType.Observer) @AttrRef("id")
    public String getManufacturer(){
        return this.manufacturer;
    }

    /**
     * @effects <pre>
     *     return this.comps
     * </pre>
     */
    @DOpt(type = OptType.Observer) @AttrRef("comps")
    public Set getComps(){


    }


}
