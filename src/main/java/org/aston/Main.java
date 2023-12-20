package org.aston;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    private static ArrayListCollection<Integer> collection1 = new ArrayListCollection<>(1);
    private static ArrayListCollection<String> collection2 = new ArrayListCollection<>(4);
    public static void main(String[] args) {
        //Добавление элемента
        collection2.add("i");
        collection2.add("b");
        collection2.add("c");
        collection2.add("t");
        collection2.add("5");

        //Удаление элемента по индексу
        collection2.delete(1);

        //Получение элемента по индексу
        collection2.get(3);

        //Замена эдемента по индексу
        collection2.set(1,"2");


        //Проверка пустая коллекция или нет
        if (collection1.isEmpty()) {
            collection1.add(1);
            collection1.add(2);
            collection1.add(3);
        } else {
            System.out.println("Коллекция уже содержит значение");
        }

        collection1.set(2,10);

        collection1.add(6);

        //Вывод всех элементов коллекции
        System.out.println(collection1);
        System.out.println(collection2);

    }

    }
