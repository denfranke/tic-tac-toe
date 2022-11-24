import java.util.ArrayList;

public class Student {
    Group group;
    public String fio;
    private int counter = 0;
    private int id,age;

    public Student(String fio,int age) {
        this.fio = fio;
        this.age=age;
        this.counter++;
        this.id = counter;
    }

    public void setgroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        if(age>=40)
        return ("Student{" +
                "fio=" + fio + "age "+ age +
                '}');
        return "";
    }
}
