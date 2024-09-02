package net.vrakin;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student[] students = new Student[10];

        for (int i = 0; i <10; i++) {
            students[i] = new Student("Name" + i, (i+1)*9, i, i*10f);
        }

        Group group = new Group(1, "psd", "121", students);

        System.out.println(Arrays.deepToString(students));
        System.out.println(group.isDuplicatesStudent());
        students[0]=students[9].clone();
        System.out.println("After clone students");
        System.out.println(group.isDuplicatesStudent());
        students[0].setAveragePoint(187f);
        System.out.println("After changed students[0] in averagePoint");
        System.out.println(group.isDuplicatesStudent());
        students[1].setId(7);
        students[1].setAge(8*9);
        students[1].setName("Name7");
        students[1].setAveragePoint(70f);
        System.out.println("After changed students[1] on 7");
        System.out.println(group.isDuplicatesStudent());
    }
}
