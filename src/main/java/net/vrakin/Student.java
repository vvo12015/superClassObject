package net.vrakin;

import java.util.Objects;

public class Student extends Human{
    private int id;
    private Group group;
    private Float averagePoint;

    public Student(int id, String name, int age,
                   Group group, Float averagePoint) {
        super(name, age);
        this.id = id;
        this.group = group;
        this.averagePoint = averagePoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Float getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(Float averagePoint) {
        this.averagePoint = averagePoint;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        if (!super.equals(obj)){
            return false;
        }
        Student other = (Student) obj;
        if (id != other.id)
            return false;
        if (!this.group.equals(other.group)) {
            return false;
        }
        if (averagePoint == null) {
            return other.averagePoint == null;
        } else return averagePoint.equals(other.averagePoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), group, averagePoint);
    }
}
