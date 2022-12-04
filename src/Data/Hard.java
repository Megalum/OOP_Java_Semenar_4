package Data;

import java.util.Date;

public class Hard extends Task{

    public Hard(String task, String name){
        super.task = task;
        super.name = name;
        super.id++;
    }

    protected Hard(int id, Date dataTime, String task, String name){
        super.id = id;
        super.date = dataTime;
        new Hard(task, name);
    }

    public Hard(){
        new Easy("None","None");
    }

}
