package a2_2101040150;

import utils.TextIO;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @overview This class take input from the PC object, and print out a table in required form.
 * @effects <pre>
 *     (DESCRIPTION OF TABULAR TABLE)
 *     To display a report, the program first generates it and then presents the result on a table that looks like the one shown in Listing 1, which look like this:
 *
 *     (DATA SOURCE)
 *     The report title (PCPROG REPORT) is displayed in the middle of the top banner.
 *     All except the first column correspond to the PC attributes, the rows are data about the PC objects.
 *     Thus, the second column corresponds to attribute model, the third corresponds to year, the fourth corresponds to manufacturer.
 *
 *     (TABLE DISPLAY REQUIREMENTS)
 *     The last column lists the string representations of the components of the PC objects. The first column sequentially displays the row numbers.
 *
 *     Note that the widths of second and fourth columns are lengths of the corresponding attributes.
 *     Widths of the first and third columns are 3 and 6 respectively.
 *     The fifth column is unrestricted in width.
 *     The cell values are properly aligned with the columns and are displayed right-justified, except for the fifth column (to display components) which is left-aligned.
 *
 *     (OTHER NOTES)
 *     TO help you imagine, the widths of columns 1 to 4 are marked using a blue background in Listing 1.
 *     The horizontal lines (as displayed by lines of hyphens in the report) are exactly 99 characters in width.
 *     The cell values need not be wrapped.
 *     Further, the boundary between two adjacent cells on same row are exactly one space (␣) apart.
 * </pre>
 */
public class PCReport {
    // create a single displayReport operation:
    // modify class to static, since the requirement is no instance variable
    public String displayReport(PC[] objs) {
        StringBuffer report = new StringBuffer();
        // create 99 hyphens above the TITLE
        report.append("-".repeat(99));
        // PCPROG REPORT is in another line
        report.append("\n");
        report.append(
                "                                           PCPROG REPORT                                          ");
       // another 99 hyphens below PCPROG REPORT
        report.append("\n");

        report.append("-".repeat(99));
        // move down a line
        report.append("\n");

        // Print out the formatted index, as a decimal integer, width the width of 3:
        String FormattedIndex = "%3d";

        // Print out the formatted model, as a string, width the width of 20:
        String FormattedModel = "%20s";

        // Print out the formatted year, as a decimal integer, width the width of 3:
        String FormattedYear = "%6d";

        // Print out the formatted Manufacturer, as a string, width the width of 20:
        String FormattedManufacturer = "%15s";

        // Print out the formatted components, as a string. Since "lengths of the corresponding attributes", no limit needed.
        String FormattedComps = "%s";

        /**
         * The following loop create a table, BY ROW:
         * for i = 0 to i < the number of PC we created (objs.length)
         *      print a new line with the formatted index, model, year, manufacturer and components
         */
        for (int i = 0; i < objs.length; i++) {
            PC pc = objs[i];
            report.append(String.format(FormattedIndex, i + 1)).append(" ")
                    .append(String.format(FormattedModel, pc.getModel())).append(" ")
                    .append(String.format(FormattedYear, pc.getYear())).append(" ")
                    .append(String.format(FormattedManufacturer, pc.getManufacturer())).append(" ")
                    .append(String.format(FormattedComps, pc.getComps().getElements().toString())).append("\n");
        }

        // Print out 99 hyphens at the end
        report.append("-".repeat(99));

        // Converting the whole table to String
        TextIO.putln(report);
        return report.toString();
    }
}



