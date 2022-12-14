package ru.mirea.lab.lab1516.order;

import ru.mirea.lab.lab1516.menu.MenuItem;
import ru.mirea.lab.lab1516.order.Order;

public class TableOrder implements Order {          //класс заказов в ресторане
    private int size;                               //поле количества позиций в заказе
    private MenuItem[] items;                       //массив позиций заказа

    public TableOrder() {      //конструктор
        size = 0;                   //присвоение полям значений
        items = new MenuItem[0];
    }

    private void addEmptyLastIndex() {                          //метод увеличения списка на 1 элемент в конце
        MenuItem[] temp = new MenuItem[items.length + 1];       //создание нового массива на +1 элемент
        System.arraycopy(items, 0, temp, 0, items.length);      //копирование старого массива
        items = temp;                                           //присвоение нового массива
        size++;                                                 //инкрементация длины
    }

    private void removeElementByIndex(int index) {                                  //метод удаления элемента по индексу
        MenuItem[] temp = new MenuItem[items.length - 1];                           //создание новго массива на -1 элемент
        System.arraycopy(items, 0, temp, 0, index);                                 //копирование старого массива
        System.arraycopy(items, index + 1, temp, index, items.length - index - 1);  //удаление элемента по индексу
        items = temp;                                                               //присвоение нового массива
        size--;                                                                     //декрементация длины
    }

    @Override
    public boolean add(MenuItem item) {          //переопределённый метод добавления элемента
        addEmptyLastIndex();                    //увеличение размера массива
        items[size - 1] = item;                 //присвоение элемента
        return true;                            //возврат логической единицы
    }

    @Override
    public boolean remove(String itemName) {            //удаление элемента по названию
        for (int i = 0; i < size; i++) {                //цикл по массиву
            if (items[i].getName().equals(itemName)) {  //сравнение параметра и названия элемента массива
                removeElementByIndex(i);                //удаление элемента по индексу
                return true;                            //возврат логической единицы
            }
        }
        return false;                                   //возврат логического нуля
    }

    @Override
    public int removeAll(String itemName) { //метод удаления всех элементов по названию
        int count = 0;                      //счётчик удалённых объектов
        while (remove(itemName))            //цикл удаления объектов по названию
            count++;                        //инкрементация счётчика
        return count;                       //возврат значения счётчика
    }

    @Override
    public int itemsQuantity() { return size; } //метод получения количества позиций заказа

    @Override
    public MenuItem[] getItems() { return items; }  //метод получения позиций заказа

    @Override
    public double costTotal() {                 //метод получения стоимости заказа
        int totalCost = 0;                      //счётчик стоимости
        for (int i = 0; i < size; i++)          //цикл по элементам
            totalCost += items[i].getCost();    //увеличение счётчика на значение поля стоимости
        return totalCost;                       //возврат значения счётчика
    }

    @Override
    public int itemQuantity(String itemName) {          //метод получения колтичества вхождений в заказ
        int counter = 0;                                //счётчик количества вхождений
        for (int i = 0; i < size; i++)                  //цикл по элементам
            if (items[i].getName().equals(itemName))    //сравнение параметра и названия элемента массива
                counter++;                              //инкрементация счётчика
        return counter;                                 //возврат значения счётчика
    }

    @Override
    public String[] itemsNames() {                      //метод, возвращающий заказы в виде массива строк
        String[] strings = new String[0];               //создание массива строк
        for (int i = 0; i < size; i++) {                //цикл по элементам
            boolean isFound = false;                    //переменная-флаг для проверки наличия вхождения
            for (String menuItem : strings) {           //цикл по строкам
                if (menuItem != null && menuItem.equals(items[i].getName())) {  //проверка на моответсвие элемента
                    isFound = true;                                             //поднятие флага наличия
                    break;                                                      //выход из цикла
                }
            }

            if (!isFound) {                                             //проверка флага
                String[] temp = new String[strings.length + 1];         //создание временного массива
                System.arraycopy(strings, 0, temp, 0, strings.length);  //копирование массива
                temp[temp.length - 1] = items[i].getName();             //присвоение элементу значения метола getName
                strings = temp;                                         //присвоение
            }
        }
        return strings;         //возврат массива строк
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {                     //метод сортировки по стоимости
        MenuItem[] sortItems = new MenuItem[items.length];          //создание массива для сортировки
        System.arraycopy(items, 0, sortItems, 0, items.length);     //копирование элементов массива
        for (int i = 0; i < sortItems.length; i++) {                //сортировка вставками
            MenuItem st = sortItems[i];
            int j = i - 1;
            for (; (j >= 0) && (st.getCost() - sortItems[j].getCost() < 0); j--)
                sortItems[j + 1] = sortItems[j];
            sortItems[j + 1] = st;
        }
        return sortItems;           //возврат отсортированного массива
    }
}