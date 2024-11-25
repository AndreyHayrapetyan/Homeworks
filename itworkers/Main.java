package itworkers;

public class Main {
    public static void main(String[] args) {
        FrontEndDeveloper front = new FrontEndDeveloper("Karen", new String[]{"Team Work", "Responsible"});
        FullStackDeveloper full = new FullStackDeveloper("Thomas", new String[]{"Communicative", "Flexible"});
        TestAutomation test = new TestAutomation("William", new String[]{"Funny ", "Expert"});
        ProjectManager manager = new ProjectManager("Henderson", new String[]{"Creative", "Responsible "});
        ITWorker arr[] = {front, test, full, manager};

        for (ITWorker worker : arr) {
            worker.doesWork();
        }
        Developer arr2[] = {front, full, test};
        for (Developer dev : arr2) {
            dev.doHealthCheck();
        }
    }
}
