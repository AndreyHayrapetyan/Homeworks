package itworkers;

public class ProjectManager extends ITWorker {
    ProjectManager(String name, String[] skills) {
        super(name, skills);
    }

    public void doesWork() {
        System.out.println("Project manager is head of the project");
    }
}
