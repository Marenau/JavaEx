package ru.mirea.pr.pr6;

public class Test {

    private static int partition(Student arr[], int begin, int end) {
        Student pivot = arr[end];
        int i = (begin - 1);
        SortingStudentsByGPA comp = new SortingStudentsByGPA();
        for (int j = begin; j < end; j++) {
            if (comp.compare(arr[j], pivot) < 0) {
                i++;
                Student swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        Student swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

    public static void qSort(Student[] arr, int begin, int end) {
        if (begin < end) {
            int partitions = partition(arr, begin, end);

            qSort(arr, begin, partitions - 1);
            qSort(arr, partitions + 1, end);
        }
    }

    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) < 0) a[k++] = l[i++];
            else a[k++] = r[j++];
        }
        while (i < left) a[k++] = l[i++];
        while (j < right) a[k++] = r[j++];
    }

    public static void mergeSort(Student[] a) {
        if (a.length < 2) return;
        int mid = a.length / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[a.length - mid];

        for (int i = 0; i < mid; i++) l[i] = a[i];
        for (int i = mid; i < a.length; i++) r[i - mid] = a[i];

        mergeSort(l);
        mergeSort(r);

        merge(a, l, r, mid, a.length - mid);
    }

    public static void exOne() {
        Student[] students = new Student[]{
                new Student(12, 4),
                new Student(10, 5),
                new Student(189, 81),
                new Student(2, 320)
        };

        System.out.println("Нетсортированный массив: ");
        for (Student s : students) System.out.println(s);

        for (int i = 0; i < students.length; i++) {
            Student st = students[i];
            int j = i - 1;
            for (; (j >= 0) && (st.compareTo(students[j]) < 0); j--)
                students[j + 1] = students[j];
            students[j + 1] = st;
        }

        System.out.println("\nОтсортированный массив: ");
        for (Student s : students) System.out.println(s);
    }

    public static void exTwo() {
        Student[] students = new Student[]{
                new Student(12, 34),
                new Student(10, 768),
                new Student(189, 2),
                new Student(2, 317)
        };

        System.out.println("Нетсортированный массив: ");
        for (Student s : students) System.out.println(s);

        qSort(students, 0, students.length - 1);

        System.out.println("\nОтсортированный массив: ");
        for (Student s : students) System.out.println(s);
    }

    public static void exThree() {
        Student[] students1 = new Student[]{
                new Student(12, 34),
                new Student(10, 768),
                new Student(189, 2),
                new Student(2, 317)
        };
        Student[] students2 = new Student[]{
                new Student(6, 6),
                new Student(14, 13),
                new Student(35, 26),
                new Student(100, 289)
        };

        Student[] mergeArr = new Student[students1.length + students2.length];
        for (int i = 0; i < students1.length; i++) mergeArr[i] = students1[i];
        for (int i = 0; i < students2.length; i++) mergeArr[students1.length + i] = students2[i];
        mergeSort(mergeArr);
        System.out.println("Отсортированный массив: ");
        for (Student s : mergeArr) System.out.println(s);
    }

    public static void main(String[] args) {
        exOne();
        exTwo();
        exThree();
    }
}