package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
what is the diff bw comparator vs comparable
comparator-comparator is a functional interface it has a method called compare, it takes two values as a input
we have to specify when to swap when not to swap
if you give 1 it swaps
if you don't want swap give -1
to sort the values based on custom logic

comparable: we are giving permission to the class itself to sort it's objects
need to override compareTo method

 */
class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        if(this.age > that.age){
            return 1;
        }else{
            return -1;
        }
    }
}
public class SortingTheCollection {

    public static void main(String[] args) {
        // what if you want to sort based on your custom logic
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        Comparator<Student> stus = (i, j) -> i.age > j.age ? 1 : -1; // lambda

        List<Integer> list = new ArrayList<>();
        //adding values to the list
        list.add(14);
        list.add(11);
        list.add(23);

        // Special class from collection to sort the values
        Collections.sort(list, comparator); // custom sorting
        System.out.println(list);

        List<Student> student = new ArrayList<>();
        student.add(new Student(25, "guna"));
        student.add(new Student(24, "ssg"));
        student.add(new Student(45, "sekhar"));
        Collections.sort(student);
        System.out.println(student);
    }
}
