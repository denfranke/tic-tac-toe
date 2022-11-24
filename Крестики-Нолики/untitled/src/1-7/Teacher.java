import java.util.ArrayList;

public class Teacher {
    private String fio;
    ArrayList<Group> groups;

    public Teacher(String fio) {
        this.fio = fio;
        this.groups = new ArrayList<>();
    }

    public void Selectgroup(Group group) {
        groups.add(group);
        if (!group.getTeachers().contains(this))
            group.addTeacher(this);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fio=" + fio +
                '}';
    }

    public void showgrouplist() {
        System.out.println(groups);
    }

    public void showstudentlistbygroup(Group group)
    {
        System.out.println(group.getStudents());
    }
}
