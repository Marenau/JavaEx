package ru.mirea.pr.pr1314;

import java.text.SimpleDateFormat;
import java.util.*;

public class Test {

    public static void printEmployee(String surname) {
        StringBuilder stringBuilder = new StringBuilder(surname);

        //количество миллисекунд с полуночи 1 янаря 1970
        Date receiveDate = new Date();
        Date handingDate = new Date(System.currentTimeMillis() + 2628000000L);  //столько миллисекунд в месяце (31 день)

        SimpleDateFormat formatForDate = new SimpleDateFormat("dd.MM");
        stringBuilder.append(".\nЗадание получено: ").append(formatForDate.format(receiveDate))
                .append("\nДата сдачи: ").append(formatForDate.format(handingDate));

        System.out.println(stringBuilder);
    }

    public static void equalsDate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату в формате 'дд.мм.гггг':");
        String date = in.nextLine();
        StringTokenizer st = new StringTokenizer(date, ".");    //разделение через точку
        int[] arrayOfDate = new int[st.countTokens()];
        for (int i = 0; i < 3; i++)
            arrayOfDate[i] = Integer.parseInt(st.nextToken());

        Calendar inputDate = new GregorianCalendar();
        inputDate.set(arrayOfDate[2], arrayOfDate[1] - 1, arrayOfDate[0]);  //месяца с нуля ыыы

        Calendar currentDate = new GregorianCalendar();
        if (currentDate.after(inputDate))
            System.out.println("Ваша дата позже текущей.");
        else if (currentDate.equals(currentDate))
            System.out.println("Ваша дата равна текущей.");
        else
            System.out.println("Ваша дата раньше текущей.");
    }

    public static void formDate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату:");
        /*
            Проверки:
            20031125
            0220

            16700709
            1435
         */
        String date = in.nextLine();
        String time = in.nextLine();
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(4, 6));
        int day = Integer.parseInt(date.substring(6, 8));
        int hour = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(2, 4));

        Date generateDate = new Date((day - 1) * 86400000L);    //установка числа т.к. начальная дата - 1 января
        /*
            Сейчас начнутся танцы с бубном.
            Установка через миллисекунды это ужасно неудобно, я решил не делать.
            Методы set устарели, тут неприятно(((.
         */
        generateDate.setYear(year - 1900);  //Придётся отменять нормализацию.
        generateDate.setMonth(month - 1);   //месяца с нуля ыыы
        generateDate.setHours(hour);
        generateDate.setMinutes(minutes);
        System.out.println(generateDate);

        Calendar generateCalendar = new GregorianCalendar();
        generateCalendar.set(year, month - 1, day, hour, minutes, 0);
        System.out.println(generateCalendar.getTime());
    }

    public static void checkLists() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        long startDate, endDate, calculation;

        System.out.println("ArrayList:");
        startDate = System.nanoTime();
        arrayList.add(1);
        endDate = System.nanoTime();
        calculation = endDate - startDate;
        System.out.println("Время добавления нс: " + calculation);
        startDate = System.nanoTime();
        arrayList.add(1, 2);
        endDate = System.nanoTime();
        calculation = endDate - startDate;
        System.out.println("Время вставки нс: " + calculation);
        startDate = System.nanoTime();
        arrayList.contains(1);
        endDate = System.nanoTime();
        calculation = endDate - startDate;
        System.out.println("Время поиска нс: " + calculation);
        startDate = System.nanoTime();
        arrayList.remove(1);
        endDate = System.nanoTime();
        calculation = endDate - startDate;
        System.out.println("Время вставки нс: " + calculation);

        System.out.println("LinkedList:");
        startDate = System.nanoTime();
        linkedList.add(1);
        endDate = System.nanoTime();
        calculation = endDate - startDate;
        System.out.println("Время добавления нс: " + calculation);
        startDate = System.nanoTime();
        linkedList.add(1, 2);
        endDate = System.nanoTime();
        calculation = endDate - startDate;
        System.out.println("Время вставки нс: " + calculation);
        startDate = System.nanoTime();
        linkedList.contains(1);
        endDate = System.nanoTime();
        calculation = endDate - startDate;
        System.out.println("Время поиска нс: " + calculation);
        startDate = System.nanoTime();
        linkedList.remove(1);
        endDate = System.nanoTime();
        calculation = endDate - startDate;
        System.out.println("Время вставки нс: " + calculation);
    }

    public static void main(String[] args) {
        printEmployee("Вадим Малин");   //ex1
        System.out.println();

        equalsDate();   //Ex2
        System.out.println();

        //Ex3
        Student AD = new Student("Анастасиади Дмитрий", "27.09.2003");
        Student VM = new Student();
        VM.setFIO("Вадим Малин");
        VM.setDate("25.11.2003");
        System.out.println(AD);
        System.out.println(VM);
        System.out.println(VM.getDate('l'));    //получение полной даты
        System.out.println(AD.getDate('m'));    //получение средней даты
        System.out.println();

        formDate(); //Ex4
        System.out.println();

        checkLists();   //Ex5
    }
}