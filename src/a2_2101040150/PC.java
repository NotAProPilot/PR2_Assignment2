package a2_2101040150;
/*
 * Import all the necessary package
 */
import java.util.Vector;

import utils.DOpt;
import utils.DomainConstraint;
import utils.OptType;
import utils.collections.Collection;

/**
 * (HEADER SPECIFICATIONS)
 * @overview A PC (personal computer) is a multipurpose microcomputer
 * whose size, capabilities, and price mak
 * @attributes
 * model String  String
 * year  Integer int
 * manufacture String String
 * comps Set Set
 * @object A typical PC is PC = < md, y, m, c >
 *         where md = model (md), year (y), manufacture (m) and comps (c)
 * @abstract_properties (a short description of the table):
 * mutable(md) = true /\ optional (md) = false /\ length (md) = 20
 * mutable(y) = false /\ optional (y) = false /\ min (y) = 1984
 * mutable(m) = false /\ optional (m) = false /\ length (y) = 15
 * mutable(c) = true /\ optional (c) = false
 */
public class PC {
    @DomainConstraint(type = "String", mutable = true, optional = false)
    private String model;
    @DomainConstraint(type = "Integer", mutable = false, optional = false)
    private int year;
    @DomainConstraint(type = "String", mutable = false, optional = false)
    private String manufacturer;
    @DomainConstraint(type = "Set<String>", mutable = false, optional = false)
    private Set<String> comps;

}
