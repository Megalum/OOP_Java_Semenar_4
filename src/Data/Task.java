package Data;

import java.util.Date;

public abstract class Task {

    protected Date date = new Date();
    protected int id = (int) getRandomDoubleBetweenRange(1000, 100000);
    protected String task;
    protected String name;

    @Override
    public String toString() {
        return id + "," + date + "," + task + "," + name;
    }

    public static double getRandomDoubleBetweenRange(double min, double max){
        double x = (Math.random()*((max-min)+1))+min;
        return x;
    }
}
