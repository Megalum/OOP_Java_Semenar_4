package Controller;

import Data.Easy;
import Data.Hard;
import Data.Medium;
import Data.TaskList;
import Util.ImportFile;
import Util.Login;

public class Controller {
    public void buttonClick() throws Exception {

        Login user = new Login("Fird F.");
        TaskList<Easy> taskEasy = new TaskList<>();
        taskEasy.add(new Easy("Add password", user.getName()));
        taskEasy.add(new Easy("Add word", user.getName()));
        taskEasy.add(new Easy("Add pascal", user.getName()));
        taskEasy.getAll();
        taskEasy.exp("Easy");

        Login userFirst = new Login("Ralf T.");
        TaskList<Medium> taskMedium = new TaskList<>();
        taskMedium.add(new Medium("Add import", userFirst.getName()));
        taskMedium.add(new Medium("Add export", userFirst.getName()));
        taskMedium.getAll();
        taskMedium.exp("Medium");

        Login userSecond = new Login("Terlo R.");
        TaskList<Hard> taskHard = new TaskList<>();
        taskHard.add(new Hard("Сhanging the encoding", userSecond.getName()));
        taskHard.add(new Hard("Add three modes", userSecond.getName()));
        taskHard.getAll();
        taskHard.exp("Hard");

        ImportFile imp = new ImportFile();
        imp.importAllFile("Easy");
        imp.importAllFile("Medium");
        imp.importAllFile("Hard");
    }

}
