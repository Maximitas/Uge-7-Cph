package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Person> persons = new ArrayList<>();

        Student student1 = new Student("Lasse", new ArrayList<>());
        Student student2 = new Student("Asim", new ArrayList<>());
        Student student3 = new Student("Johan", new ArrayList<>());
        Student student4 = new Student("Oliver", new ArrayList<>());

        Teacher teacher1 = new Teacher("Tess", new ArrayList<>());
        Teacher teacher2 = new Teacher("Signe", new ArrayList<>());
        Teacher teacher3 = new Teacher("Anders", new ArrayList<>());


        student1.passedCourse.add("Java");
        student2.passedCourse.add("Java");
        student3.passedCourse.add("Java");
        student4.passedCourse.add("Java 1.0");
        teacher1.canTeach.add("Java 1.0");
        teacher2.canTeach.add("Java 1.0");
        teacher3.canTeach.add("English");
        persons.add(student1);
        persons.add(student2);
        persons.add(student3);
        persons.add(student4);
        persons.add(teacher1);
        persons.add(teacher2);
        persons.add(teacher3);

        for (int i = 0; i < persons.size(); i++) {
            persons.get(i).addCourse("Java 1.0");
        }

        /*
        for (int i = 0; i < persons.size(); i++) {
            boolean added = persons.get(i).addCourse("Java 1.0");
            if (!added) {
                Person person = persons.get(i);
                if (person instanceof Student) {
                    System.out.println(person.getName() + " har allerede bestået dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan ikke undervise i dette fag.");
                }
            }
            if (added) {
                Person person = persons.get(i);
                if (person instanceof Student) {
                    System.out.println(person.getName() + " kan godt tage dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan godt undervise i dette fag");
                }
            }
        }
        */



    }
}
