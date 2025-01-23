package Students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentGrades {
    private String name;
    private int mathKnowledge;
    private int physicsKnowledge;
    private int historyKnowledge;

    public StudentGrades(String name, int mathKnowledge, int physicsKnowledge, int historyKnowledge) {
        this.name = name;
        this.mathKnowledge = mathKnowledge;
        this.physicsKnowledge = physicsKnowledge;
        this.historyKnowledge = historyKnowledge;
    }

    public String getName() {
        return name;
    }

    public int getMathKnowledge() {
        return mathKnowledge;
    }

    public int getPhysicsKnowledge() {
        return physicsKnowledge;
    }

    public int getHistoryKnowledge() {
        return historyKnowledge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMathKnowledge(int mathKnowledge) {
        this.mathKnowledge = mathKnowledge;
    }

    public void setPhysicsKnowledge(int physicsKnowledge) {
        this.physicsKnowledge = physicsKnowledge;
    }

    public void setHistoryKnowledge(int historyKnowledge) {
        this.historyKnowledge = historyKnowledge;
    }

    @Override
    public String toString() {
        return name + " - Math: " + mathKnowledge + ", Physics: " + physicsKnowledge + ", History: " + historyKnowledge;
    }

    public int compareTo(StudentGrades o) {
        if (getName().charAt(0) > o.getName().charAt(0)) return 1;
        if (getName().charAt(0) < o.getName().charAt(0)) return -1;
        return 0;
    }
}
