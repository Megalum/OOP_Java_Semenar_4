package Data;

public class Medium extends Task{

    public Medium(String task, String name){
        super.task = task;
        super.name = name;
        super.id++;
    }

    public Medium(){
        new Medium("None","None");
    }
}
