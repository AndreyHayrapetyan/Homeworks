package itworkers;

import java.util.Random;

public class FullStackDeveloper extends Developer implements UseIDE {

    FullStackDeveloper(String name, String[] skills) {
        super(name, skills);
    }

    public void doHealthCheck() {
        Random random = new Random();
        System.out.println("Calling API {baseUrl}/fe/healthCheck");
        System.out.println("Calling API {baseUrl}/be/healthCheck");
        boolean randomStatus1 = random.nextBoolean();
        boolean randomStatus2 = random.nextBoolean();
        System.out.println(randomStatus1 && randomStatus2 ? "FullStack developer is ready to work" : "FullStack developer is not ready to work");
    }

    public void doesWork() {
        System.out.println("Full-Stack developer can develop both client and server software");
    }

    public void useIDE() {
        System.out.println(super.getName() + " is FullStack Developer and he is using VS code");
    }
}