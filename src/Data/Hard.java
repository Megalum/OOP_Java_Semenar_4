package Data;

public class Hard extends Task{

    public Hard(String task, String name){
        super.task = task;
        super.name = name;
        super.id++;
    }

    public Hard(){
        new Easy("None","None");
    }

}
