package Data;

import java.util.Date;

public class Medium extends Task{

    public Medium(String task, String name){
        super.task = task;
        super.name = name;
        super.id++;
    }

    protected Medium(int id, Date dataTime, String task, String name){
        super.id = id;
        super.date = dataTime;
        new Medium(task, name);
    }
    public Medium(){
        new Medium("None","None");
    }
}
