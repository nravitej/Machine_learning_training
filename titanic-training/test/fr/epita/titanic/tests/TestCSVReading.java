package fr.epita.titanic.tests;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCSVReading {

    public static void main(String[] args) {
        String line = "892,3,\"Kelly, , Mr. James\",male,34.5,0,0,330911,7.8292,,Q";

        String[] values = line.split(",");
        char[] chars = line.toCharArray();
        String currentColumnValue = "";


        List<String> columnsValues = new ArrayList<>();
        for (int i = 0, charsLength = chars.length; i < charsLength; i++) {
            boolean escapedColumn = false;
            char currentChar = chars[i];
            char nextChar = 0;
            if (i + 1  < charsLength){
                nextChar = chars[i+1];
            }

            if (currentChar == ',') {
                if (nextChar == '"'){
                    escapedColumn = true;
                    i++;
                }else {
                    if (!escapedColumn) {
                        columnsValues.add(currentColumnValue);
                        currentColumnValue = "";
                        if (!(i + 1 >= charsLength)){
                            currentChar = chars[++i];
                        }

                    }
                }
            }
            if (currentChar == '"'){
                if (nextChar == ','){
                    columnsValues.add(currentColumnValue);
                    currentColumnValue = "";
                    escapedColumn = false;
                    i++;
                }
            }
            currentColumnValue += currentChar;
        }
        System.out.println(columnsValues);

    }

}
