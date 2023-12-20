package org.aston;

public class Main {

    private static final ArrayListCollection<Float> collectionEX = new ArrayListCollection<>();
    private static final ArrayListCollection<Integer> collection1 = new ArrayListCollection<>(1);
    private static final ArrayListCollection<String> collection2 = new ArrayListCollection<>(4);
    public static void main(String[] args) {
        //Добавление элемента
        collection2.add("i");
        collection2.add("b");
        collection2.add("c");
        collection2.add("t");
        collection2.add("5");

        collectionEX.add(2.1F);

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

        //Прверка HashMap
        HashMapCollection<Integer, String> hashMapCollection = new HashMapCollection<>();

        //Добавление элемента
        hashMapCollection.put(911893, "Viktor");
        hashMapCollection.put(911894, "Viktor");


        hashMapCollection.remove(911894);


        hashMapCollection.put(9876, "ARINA");
        hashMapCollection.get(911893);

        hashMapCollection.display();

    }

    }
