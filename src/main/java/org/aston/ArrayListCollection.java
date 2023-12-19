package org.aston;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ArrayListCollection<E> {
    private Object[] innerMas;
    private int size;

    public ArrayListCollection() {
    }

    public ArrayListCollection(Object[] innerMas, int size) {
        this.innerMas = innerMas;
        this.size = size;
    }

    public Object[] getInnerMas() {
        return innerMas;
    }

    public void setInnerMas(Object[] innerMas) {
        this.innerMas = innerMas;
    }

    public int getSize(Object[] innerMas) {
        size = innerMas.length;
        return size;
    }

    public void setSize(int size) {
        this.size = innerMas.length;
    }

    public int lastIndex(Object[] innerMas, int size) {
        int indexLast = size-1;
        return indexLast;
    }

    public Object[] add(Object o, Object[] innerMas, int size) {
        Object[] newMas;
        if (size >= innerMas.length) {
            newMas = copy(size + 1, innerMas);
            newMas[size] = o;
        } else {
            newMas = copy(size, innerMas);
            newMas[lastIndex(innerMas, size)] = o;
        }
        return newMas;
    }

    public Object[] remove(Object o) {
        for (int i=0; i < innerMas.length; i++) {
            if(innerMas[i].equals(o)) {
                if(i != lastIndex(innerMas, innerMas.length)) {
                    innerMas[i] = innerMas[i+1];
                }
            }
        }
        innerMas[lastIndex(innerMas, innerMas.length)] = null;
        return innerMas;
    }

    public Object[] copy(int size, Object[] innerMas) {
        Object[] copyInnerMas = new Object[size];
        for (int i = 0; i < innerMas.length; i ++) {
            copyInnerMas[i] = innerMas[i];
        }
        return copyInnerMas;
    }


    @Override
    public String toString() {
        return "ArrayListCollection{" +
                "innerMas=" + Arrays.stream(innerMas)
                .filter(Objects::nonNull)
                .toArray() +
                '}';
    }
}
