package Data;

import java.util.Date;

public class Easy extends Task{

    public Easy(String task, String name){
        super.task = task;
        super.name = name;
        super.id++;
    }

    protected Easy(int id, Date dataTime, String task, String name){
        super.id = id;
        super.date = dataTime;
        new Easy(task, name);
    }

    public Easy(){
        new Easy("None","None");
    }

}
