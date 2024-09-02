package net.vrakin;

import java.util.Arrays;
import java.util.Objects;

public class Group {
    private int id;
    private String name;
    private String specialty;
    private Student[] students;

    public boolean isDuplicatesStudent() {
        for (int i = 0; i+1 < students.length; i++) {
            for (int j = i+1; j < students.length; j++) {
                if (students[i].equals(students[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public Group(int id, String name, String specialty, Student[] students) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return id == group.id && Objects.equals(name, group.name) && Objects.equals(specialty, group.specialty) && Objects.deepEquals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, specialty, Arrays.hashCode(students));
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
