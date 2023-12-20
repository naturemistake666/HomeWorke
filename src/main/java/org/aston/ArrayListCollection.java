package org.aston;

import java.util.Arrays;

public class ArrayListCollection<T> {
    private T[] innerMas;
    private int size;

    private final int DEFAULT_CAPACITY = 10;

    public ArrayListCollection(int capacity) {
        if (capacity == 0) {
            throw new IllegalArgumentException();
        } else {
            innerMas = (T[]) new Object[capacity];
        }
    }

    public ArrayListCollection() {
        innerMas = (T[]) new Object[DEFAULT_CAPACITY];
    }


    public void add(T item) {
        if(size >= innerMas.length) {
            innerMas = copy(size * 2 , innerMas);
        }
        innerMas[size++] = item;
    }

    public void delete(int index) {
        if (index <= innerMas.length) {
            for (int i = index; i < size; i++) {
                innerMas[i] = innerMas[i + 1];
            }
            size--;
        } else {
            System.out.println("Индекс привышает границы коллекции");
        }
        }

    public void get(int index) {
        if(index <= innerMas.length) {
            if (innerMas[index] != null) {
                System.out.println(innerMas[index]);
            } else {
                System.out.println("Данный элемент массива равен нулю");
            }
        }
         else {
            System.out.println("Индекс привышает границы коллекции");
        }
    }

    public T[] copy(int size, T[] innerMas) {
        T[] copyInnerMas = (T[]) new Object[size];
        for (int i = 0; i < innerMas.length; i ++) {
            copyInnerMas[i] = innerMas[i];
        }
        return copyInnerMas;
    }

    public void set(int index, T item) {
        innerMas[index] = item;
    }

    public boolean isEmpty() {
        return size == 0;
    }



    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(innerMas, size));
    }
}
