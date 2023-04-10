package a2_2101040150;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @overview this class print out a table
 * @sources
 */
public class PCReport {
    // create a single displayReport operation:
    // modify class to static, since the requirement is *no instance variable*
    public static String displayReport(PC[] objs) {

        boolean justifiedLeftRows = false;

        String[][] table = new String[objs.length][5];

        int tempdata = 0;
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column += 5) {
                for (int k = tempdata; k < objs.length; k++) {
                    table[row][column] = Integer.toString(k + 1);
                    table[row][column + 1] = objs[k].getModel();
                    table[row][column + 2] = Integer.toString(objs[k].getYear());
                    table[row][column + 3] = objs[k].getManufacturer();
                    table[row][column + 4] = objs[k].getComps().toString();
                    tempdata += 1;
                    break;
                }
                break;
            }
        }
        Map<Integer, Integer> columnLengths = new HashMap<>();
        for (String[] strings : table) {
            Stream.iterate(0, (i -> i < strings.length), (i -> ++i)).forEach(i -> {
                switch (i) {
                    case 0 -> columnLengths.put(i, 3);
                    case 2 -> columnLengths.put(i, 6);
                    case 4 -> columnLengths.put(i, 50);
                    default -> columnLengths.put(i, 20);
                }
            });
        }

        final StringBuilder formatString = new StringBuilder("");
        String flag = justifiedLeftRows? "-":"";
        columnLengths.entrySet().forEach(e -> formatString.append(" %" + flag + e.getValue() + "s "));
        formatString.append("\n");
        String headerline = "-".repeat(99);
        headerline += String.format("%49s\n", "PCPROG REPORT");
        headerline += "-".repeat(99);

        var test = new Object(){
            String content = "";
        };
        Stream.iterate(0,(i -> i <table.length),(i ->++i))
                .forEach(a->test.content +=String.format(formatString.toString()+"\n", table[a]));
        String footerline = "-".repeat(99);
        String finalreturnTable = headerline + test.content + footerline;
        return finalreturnTable;


    }
    }
    // The code compiles without any syntax errors, so it should be able to run.
    // However, without any information about the input data or any examples of the expected output, it is difficult to determine whether the code produces the correct output or not.

