package Util;

import Data.Task;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExportFile<T extends Task> {

    public void addFile(String nameFile, List<T> data) throws IOException {
        List<String[]> dataLines = new ArrayList<>();
        dataLines.add(new String[]{"ID", "DataTime", "Task", "Name"});
        for (int i = 0; i < data.size(); i++) {
            dataLines.add(data.get(i).toString().split("/"));
        }
        String csv = nameFile + ".csv";
        File csvOutputFile = new File(csv);
        try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
            dataLines.stream().map(this::convertToCSV).forEach(pw::println);
        }
    }

    private String convertToCSV(String[] data) {
        return Stream.of(data)
                .map(this::escapeSpecialCharacters)
                .collect(Collectors.joining(","));
    }

    public String escapeSpecialCharacters(String data) {
        String escapedData = data.replaceAll("\\R", " ");
        if (data.contains(",") || data.contains("\"") || data.contains("'")) {
            data = data.replace("\"", "\"\"");
            escapedData = "\"" + data + "\"";
        }
        return escapedData;
    }

}
