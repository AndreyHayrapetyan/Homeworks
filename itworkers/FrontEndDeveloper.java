package itworkers;

import java.util.Random;

public class FrontEndDeveloper extends Developer implements UseIDE {
    FrontEndDeveloper(String name, String[] skills) {
        super(name, skills);
    }

    public void doHealthCheck() {
        System.out.println("Calling  API {baseUrl}/fe/healthCheck");
        Random random = new Random();
        boolean randomStatus = random.nextBoolean();
        System.out.println(randomStatus ? "Front End developer is ready to work" : "Front End developer is not ready to work");
    }

    public void useIDE() {
        System.out.println(super.getName() + " is FrontEnd Developer and he is using VS Code ");
    }

    public void doesWork() {
        System.out.println("FrontEnd Developer builds websites");
    }
}
