package Task3;

import java.util.ArrayList;

public class Student extends Person {
    ArrayList<String> passedCourse;
    ArrayList<String> currentCourse;
    public Student(String name, ArrayList<String> passedCourse) {
        super(name);
        this.passedCourse = passedCourse;
        this.currentCourse = new ArrayList<>();
    }

    @Override
    public boolean addCourse(String course) {
        for (String e : passedCourse) {
            if (e.equals(course)) {
                System.out.println(this.name + " already passed this.");
                return false;
            }
        }
        currentCourse.add(course);
        return true;
        }
    }



