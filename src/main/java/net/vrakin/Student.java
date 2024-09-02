package net.vrakin;

import java.util.Objects;

public class Student extends Human implements Cloneable{

    private int id;
    private Float averagePoint;

    public Student(String name, int age, int id, Float averagePoint) {
        super(name, age);
        this.id = id;
        this.averagePoint = averagePoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Float getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(Float averagePoint) {
        this.averagePoint = averagePoint;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(averagePoint, student.averagePoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, averagePoint);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", averagePoint=" + averagePoint +
                '}';
    }

    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
