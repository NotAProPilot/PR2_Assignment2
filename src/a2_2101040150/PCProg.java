package a2_2101040150;

import static utils.TextIO.getln;
import static utils.TextIO.putln;
import static utils.TextIO.writeFile;
import static utils.TextIO.writeStandardOutput;

import java.time.Year;
import java.util.*;

import org.w3c.dom.Text;
import utils.DomainConstraint;
import utils.NotPossibleException;
import utils.TextIO;

/**
 * @overview PCProg is a program that captures data about PC objects and
 *           displays a report about them on the console.
 * 
 * @attributes objs Set<PC>
 * 
 * @object A typical PCProg is {c1,...,cn} where c1,...,cn are pcs
 * 
 * @abstract_properties mutable(objs)=true /\ optional(objs)=false
 * 
 * @author dmle
 */
public class PCProg {
	private static final Object YES = "Y";
	@DomainConstraint(mutable = true, optional = false)
	private Set<PC> objs;

	/**
	 * @effects initialise this to have an empty set of PCs
	 */
	public PCProg() {
		objs = new Set<>();
	}


	/**
	 * @overview this method take in user input
	 * @param pcFactory
	 * @param objs
	 */
	public void createObjects(PCFactory pcFactory, PC[] objs){
		// accept user input about model
		System.out.println("ENTER YOUR MODEL!: ");
		String ModelInput;
		ModelInput = TextIO.getlnString();
		// accept user input about model
		System.out.println("ENTER YOUR YEAR OF MANUFACTURE!: ");
		int YearInput;
		YearInput = TextIO.getlnInt();
		// accept user input about model
		System.out.println("ENTER YOUR MANUFACTURER!: ");
		String ManufacturerInput;
		ManufacturerInput = TextIO.getlnString();
		// accept user input about model
		//
		System.out.println("ENTER YOUR COMPONENTS: ");
		System.out.println("Please pay attention that you can't enter DUPLICATE components.");
		Set<String> CompsInput = new LinkedHashSet<>();
		CompsInput = TextIO.getlnString();
		//TODO: FIX THE GOD DAMN TEXT IO, OR RESORT TO USER SCANNER
		//TODO: CREATE A PROGRAM ON VSCODE TO TEST WHETHER WE REALLY NEED TO ADD A FOR LOOP TO ADD COMPONENTS


		// Create a new PC object using the factory method
		PC newPC = pcFactory.createPC(ModelInput, YearInput, ManufacturerInput, TODO);

		// Check whether the PC is validated or not:
		if (newPC.repOK()) {
			System.out.println("Your input is validated.");
			System.out.println("We're processing your PC input. Please wait.");
			// create PC object if input is validated
			createObjects(pcFactory, objs);
		} else
		// if the input is NOT valid, it will do the following
		{
			char YesOption = 'Y';
			char UserOptionInCaseOfError;
			do {
				System.out.println("Sorry, but we can't create your PC.");
				System.out.println("Do you want to continue?");
				System.out.println("[Y/N]: Press Y for Yes, and N for No.");
				UserOptionInCaseOfError = TextIO.getlnChar();
				if (UserOptionInCaseOfError == YesOption) {
					if (newPC.repOK()) {
						System.out.println("Your input is validated.");
						System.out.println("We're processing your PC input. Please wait.");
						// create PC object if input is validated
						createObjects(pcFactory, objs);
						break;
					} else {
						System.out.println("Your input is still invalid.");
					}
				} else {
					System.out.println("Exiting program.");
					break;
				}
			} while (true);
		}
			// Record the new PC object in objs
			objs[index] = newPC;
		index++;
	}


	/**
	 * DO NOT MODIFY THIS
	 * @effects if objs is not empty display to the standard console a text-based
	 *          tabular report on objs return this report else display nothing and
	 *          return null.
	 */
	public String displayReport() {
		if (objs.size() > 0) {
			Vector<PC> pcs = objs.getElements();

			PCReport reportObj = new PCReport();
			return reportObj.displayReport(pcs.toArray(new PC[pcs.size()]));
		} else {
			return null;
		}
	}

	/**
	 * @effects save report to a file pcs.txt in the same directory as the program's
	 * DO NOT MODIFY THIS
	 */
	public void saveReport(String report) {
		String fileName = "pcs.txt";
		writeFile(fileName);
		putln(report);
		writeStandardOutput();
	}

	/**
	 * The run method
	 * DO NOT MODIFY THIS
	 *
	 * @effects initialise an instance of PCProg create objects from data entered by
	 *          the user display a report on the objects prompt user to save report
	 *          to file if user answers "Y" save report else end
	 */
	public static void main(String[] args) {
		//
		PCProg prog = new PCProg();

		// create objects
		try {
			prog.createObjects();
			// display report
			String report = prog.displayReport();
			System.out.println(report);
			if (report != null) {
				// prompt user to save report
				putln("Save report to file? [Y/N]");
				String toSave = getln();
				if (toSave.equals("Y")) {
					prog.saveReport(report);
					putln("report saved");
				}
			}

		} catch (NotPossibleException e) {
			System.err.printf("%s: %s%n", e, e.getMessage());
		}
		putln("~END~");
	}

}
