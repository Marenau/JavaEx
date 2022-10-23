package ru.mirea.pr.pr6;

public class Student implements Comparable{
    private int IDNumber;
    private int GPA;

    public Student() {}
    public Student(int IDNumber, int GPA) {
        this.IDNumber = IDNumber;
        this.GPA = GPA;
    }

    public int getIDNumber() { return IDNumber; }
    public void setIDNumber(int IDNumber) { this.IDNumber = IDNumber; }
    public int getGPA() { return GPA; }
    public void setGPA(int GPA) { this.GPA = GPA; }

    @Override
    public int compareTo(Object o) {
        return this.IDNumber - ((Student) o).IDNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "IDNumber=" + IDNumber +
                ", GPA=" + GPA +
                '}';
    }
}