package org.aston;

public class Main {

    private static ArrayListCollection<String> collection1 = new ArrayListCollection();
    public static void main(String[] args) {
        String o = "Kiril";
        String o1 = "Kiril";
        String o2 = "Artem";
        //инициализация
        collection1.setInnerMas(new String[]{"Vitya", "Vania", "Ilia"});
        collection1.setSize(collection1.getSize(collection1.getInnerMas()));

        //добавление нового элемента
        collection1.setInnerMas(collection1.add(o, collection1.getInnerMas(), collection1.getSize(collection1.getInnerMas())));

        collection1.setInnerMas(collection1.add(o1, collection1.getInnerMas(), collection1.getSize(collection1.getInnerMas())));

        collection1.setInnerMas(collection1.add(o2, collection1.getInnerMas(), collection1.getSize(collection1.getInnerMas())));

        collection1.remove("Kiril");

        for (int i = 0; i < collection1.getInnerMas().length; i++) {
            System.out.println(collection1.getInnerMas()[i]);
        }
        System.out.println(collection1.lastIndex(collection1.getInnerMas(), collection1.getSize(collection1.getInnerMas())));
        }


    }
