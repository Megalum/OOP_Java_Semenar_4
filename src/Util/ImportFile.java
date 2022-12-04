package Util;

import Data.Task;
import Data.TaskList;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ImportFile {

    public void importAllFile(String fileName){

        String file = fileName + ".csv";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            ArrayList<String[]> arrayList = new ArrayList<>();
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                arrayList.add(line.split(","));
            }
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(7);
            arr.add(30);
            arr.add(50);
            arr.add(20);
            int index = 0;
            System.out.println();
            System.out.println(fileName);
            for (String[] row: arrayList) {
                for (String cell : row) {
                    for (int i = 0; i < arr.get(index); i++) {
                        if (i < cell.length()) {
                            System.out.print(cell.charAt(i));
                        } else{
                            System.out.print(" ");
                        }
                    }
                    index++;
                }
                index = 0;
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
