package com.codegym;

public class StaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(1,"LuonHaAnh");
        Student s2 = new Student(2,"HuyHonHo");
        Student s3 = new Student(3,"ABCDEFJ");
        s1.display();
        s2.display();
        s3.display();
    }
}
