package rocks.zipcode;

public class Student implements Comparable<Student> {


    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
//        o.getName().compareToIgnoreCase(this.getName());
        int nameCompare = o.getName().compareTo(this.getName());
        int ageCompare = ((Integer) o.getAge()).compareTo(this.getAge());
        return nameCompare;
    }

//    @Override
//    public boolean equals(Object other) {
//        Student otherStudent = null;
//        if (other instanceof Student) {
//            otherStudent = (Student) other;
//        }
//        try {
//            Objects.requireNonNull(otherStudent);
//            return (otherStudent.getName() == this.getName() && otherStudent.getAge() == this.getAge());
//        } catch (NullPointerException failure) {
//            return false;
//        }
//    }


}
