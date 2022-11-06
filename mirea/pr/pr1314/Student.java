package ru.mirea.pr.pr1314;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class Student {
    private int IDNumber = 0;
    static int counter = 1;
    private String FIO;
    private GregorianCalendar date;

    public Student() {
        IDNumber = counter++;
    }
    public Student(String FIO) {
        this.FIO = FIO;
        IDNumber = counter++;
    }
    public Student(String FIO, String date){
        this.FIO = FIO;
        IDNumber = counter++;
        setDate(date);
    }

    public int getIDNumber() { return IDNumber; }
    public String getFIO() { return FIO; }
    public String getDate(char typeOutput) {
        SimpleDateFormat formatForDate;
        switch (typeOutput) {
            case 'm':
                formatForDate = new SimpleDateFormat("dd.MM.yyyy");
                break;
            case 'l':
                formatForDate = new SimpleDateFormat("dd MMMM yyyy");
                break;
            default:    //короткий по умолчанию
                formatForDate = new SimpleDateFormat("dd.MM.yy");
                break;
        }

        return formatForDate.format(date.getTime());
    }
    public void setFIO(String FIO) { this.FIO = FIO; }
    public void setDate(String date) {
        StringTokenizer st = new StringTokenizer(date, ".");
        int[] arrayOfDate = new int[st.countTokens()];
        for (int i = 0; i < 3; i++)
            arrayOfDate[i] = Integer.parseInt(st.nextToken());
        GregorianCalendar setDate = new GregorianCalendar();
        setDate.set(arrayOfDate[2], arrayOfDate[1] - 1, arrayOfDate[0]);    //месяца с нуля
        this.date = setDate;
    }

    @Override
    public String toString() {
        return "Студент: " +
                "\nФИО: " + FIO +
                "\nДата рождения: " + getDate('s');
    }
}