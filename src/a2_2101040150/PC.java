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
    private Set<String> comps;

    // PART 3: CONSTRUCTOR CLASS (ONLY APPLY IF SOMETHING IS NOT OPTIONAL)

    // constructor: optional = false -> params
    /**
     * @effects <pre>
     *     if model, year, manufacturer and comps is valid
     *      initializes this as <model, year, manufacturer and comps>
     *     else
     *      throws NotPossibleException
     * </pre>
     */
    public PC(@AttrRef("year") int year, @AttrRef("manufacturer") String manufacturer, @AttrRef("model") String model, @AttrRef("comps") Set<String> comps) throws NotPossibleException {
        if (validateModel(model) && validateYear(year) && validateManufacturer(manufacturer) && validateComps(comps)) {
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

    // 4.1: setter for model
    /**
     * @effects <pre>
     *     return this.model
     * </pre>
     */
    @DOpt(type = OptType.Observer) @AttrRef("model")
    public String getModel() {
        return this.model;
    }

    // 4.2: setter for year
    /**
     * @effects <pre>
     *     return this.year
     * </pre>
     */
    @DOpt(type = OptType.Observer) @AttrRef("year")
    public int getYear() {
        return this.year;
    }

    // 4.3: setter for manufacturer
    /**
     * @effects <pre>
     *    return this.manufacturer
     * </pre>
     */
    @DOpt(type = OptType.Observer) @AttrRef("manufacturer")
    public String getManufacturer(){
        return this.manufacturer;
    }

    // 4.4: setter for comps
    /**
     * @effects <pre>
     *     return this.comps
     * </pre>
     */
    @DOpt(type = OptType.Observer) @AttrRef("comps")
    public Set<String> getComps(){
        return this.comps;
    }

    // PART 5: GETTER (ONLY APPLY IF SOMETHING IS MUTABLE)

    // 5.1: getter for model
    /**
     * @modifies this.model
     * @effects <pre>
     *     if newModel is valid
     *          set this.model = newModel
     *          return true
     *     else
     *          return false
     * </pre>
     */
    @DOpt(type = OptType.Mutator) @AttrRef("model")
    public boolean setModel(String newModel) {
        if (validateModel(newModel) == true) {
            this.model = model;
            return true;
        } else {
            return false;
        }
    }

    // 5.2: getter for comps
    /**
     * @modifies this.comps
     * @effects <pre>
     *     if this.comps is valid
     *          set this.comps = newComps
     *          return true
     *     else
     *          return false
     * </pre>
     */
    @DOpt(type = OptType.Mutator) @AttrRef("model")
    public boolean setComps(Set<String> newComps) {
        if (validateComps(newComps) == true) {
            this.comps = newComps;
            return true;
        }
        else {
            return false;
        }
    }

    // PART 6: VALIDATOR (A.K.A HELPER)

    // helper
    // validators: foreach att -> validator


    // validator for model
    /**
     * @effects <pre>
     *     if model is valid
     *          return true
     *     else
     *          return false
     * </pre>
     */
    private boolean validateModel(String model){
        // valid condition: length of model <=20 /\ model != null
        if (model.length()<=20 && model != null) {
            return true;
        }
        else{
            return false;
        }
    }

    // validator for year
    /**
     * @effects <pre>
     *     if year is valid
     *          return true
     *     else
     *          return false
     * </pre>
     */
    private boolean validateYear(int year){
        // valid condition: year must be bigger than 1984
        if (year >= 1984){
            return true;
        }
        else {
            return false;
        }
    }

    // validation for manufacturer
    /**
     * @effects <pre>
     *     if manufacturer is valid
     *          return true
     *     else
     *          return false
     * </pre>
     */
    private boolean validateManufacturer(String manufacturer) {
        // validate condition: length <=15 /\ length != null
        if (manufacturer.length() <=15 && manufacturer != null){
            return true;
        }
        else {
            return false;
        }
    }

    //validator for comps
    /**
     * @effects <pre>
     *     if comps is validated
     *          return true
     *      else
     *           return false
     * </pre>
     */
    private boolean validateComps(Set<String> comps){
        // validation condition: comps must not be null and must not be empty
        if(comps != null && comps.size() !=0){
            return true;
        }
        else{
            return false;
        }
    }

    // PART 7: REP OK

    /**
     * @effects <pre>
     * if this satisfies abstract properties
     *      return true
     * else
     *      return false
     * </pre>
     */
    public boolean repOK(){
        if (validateModel(this.model) && validateYear(this.year) && validateManufacturer(this.manufacturer) && validateComps(this.comps)) {
            return true;
        }
        else {
            return false;
        }
    }

    // PART 8: TO STRING AND OVERRIDE (REQUIRED IN THE ASSIGNMENT)
    /**
     * @effects <pre>
     *
     * </pre>
     */
    public String toString() {
        StringBuilder report = new StringBuilder();

        // Report title
        String title = "PC Report";
        int titleWidth = 99;
        int titlePadding = (titleWidth - title.length()) / 2;
        report.append(String.format("%" + titlePadding + "s%s%" + titlePadding + "s%n", "", title, ""));

        // Column headers
        String[] headers = {"No.", "Model", "Year", "Manufacturer", "Components"};
        int[] widths = {3, 20, 6, 15, -1};
        for (int i = 0; i < headers.length; i++) {
            report.append(String.format("| %-" + widths[i] + "s ", headers[i]));
        }
        report.append("|%n");

        // Separator
        report.append(String.format("%99s%n", "-".repeat(99)));

        // Rows
        for (int i = 0; i < PC.size(); i++) {
            report.append(String.format("| %3d | %-" + widths[1] + "s | %6d | %-" + widths[3] + "s | %-s |%n",
                    i + 1, PC.get(i).getModel(), PC.get(i).getYear(), PC.get(i).getManufacturer(),
                    String.join(", ", PC.get(i).getComps())));
        }

        // Bottom border
        report.append(String.format("%99s%n", "-".repeat(99)));

        return report.toString();
    }


}

