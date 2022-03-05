/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runit;

/**
 *
 * @author Libuseng
 */
public class Course {

    String courseName;

    Course() {
        Course c = new Course();
        c.courseName = "oracle";

    }
}

class EjavaGuruPrivate {

    public static void main(String[] args) {
        // TODO code application logic here
        Course c = new Course();
        c.courseName = "java";
        System.out.println(c.courseName);
    }

}
