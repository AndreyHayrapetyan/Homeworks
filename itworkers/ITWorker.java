package itworkers;

public abstract class ITWorker implements DoesWork{
    private String name;
    private String[] skills;

    ITWorker(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public String[] getSkills() {
        return skills;
    }
}