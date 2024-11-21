package itworkers;

public abstract class Developer extends ITWorker {
    Developer(String name, String[] skills) {
        super(name, skills);
    }

    public abstract void doHealthCheck();
}