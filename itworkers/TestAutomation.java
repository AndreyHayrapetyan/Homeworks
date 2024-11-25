package itworkers;

import java.util.Random;

public class TestAutomation extends Developer implements UseIDE{
    TestAutomation(String name, String[] skills) {
        super(name, skills);
    }

    public void doHealthCheck() {
        Random random = new Random();
        boolean testCase = random.nextBoolean();
        System.out.println(testCase ? "Test cases exist" : "Test cases does not exist");
        System.out.println(testCase ? "QA is ready to work" : "QA is not ready to work");
    }

    public void doesWork() {
        System.out.println("QA engineer tests the program and reveals bugs ");
    }

    public void useIDE() {
        System.out.println(super.getName() + " is QA Engineer and he is using Aqua");
    }
}
