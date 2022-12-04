package Data;

import Util.ExportFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TaskList<T extends Task>{

    List<T> list;

    public TaskList(){
        this.list = new ArrayList<>();
    }

    public List getAll() {
        for (int i = 0; i < list.size(); i++) {
            Logger.getAnonymousLogger().info(list.get(i).toString());
        }
        return list;
    }

    public void add(T task){
        list.add(task);
    }

    public void exp(String fileName) throws IOException {
        ExportFile exportFile = new ExportFile();
        exportFile.addFile(fileName, list);
    }
}
