/**
 * @overview: represent each mobile phone
 * @attributes:
 * manName      String      String
 * model        String      String
 * color        Character   char
 * year         Integer     int
 * guaranteed   Boolean     boolean
 * @object a typical phone is <mN, m, c, y, g>, where manName(mN), model(m), color(c), year (y), guaranteed(g)
 */
public class MobilePhone {
    @DomainConstraint(type = "String", mutable = false, optional = true)
    private String manName;
    @DomainConstraint
    private String model;
    @DomainConstraint
    private char color;
    @DomainConstraint
    private int year;
    @DomainConstraint
    private boolean guaranteed;
}
    
