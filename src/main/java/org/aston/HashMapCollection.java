package org.aston;

public class HashMapCollection<K, V> {

    static final int DEFAULT_CAPACITY = 16;
    private final Node[] table;

    public HashMapCollection() {
        table = new Node[DEFAULT_CAPACITY];
    }

    public void put(K key, V value) {
        if (key == null) {
            return;
        }

        int hash = hash(key);

        Node<K, V> newNode = new Node<K, V>(key, value, null);

        if (table[hash] == null) {
            table[hash] = newNode;
        } else {
            Node<K, V> priv = null;
            Node<K, V> cur = table[hash];
            //Пока текущий Node не равен нулю мы кладем элемент в корзину
            while (cur != null) {
                //Если текущий ключ совпадает с предыдущим проверяем не является ли предыдущий Node пустым
                if (cur.key.equals(key)) {
                    // Если является то текщий Node кладем в корзину
                    if (priv == null) {
                        newNode.next = cur.next;
                        table[hash] = newNode;
                        return;
                        //Если ключи совпадают то заменяем предыдущий Node на новый
                    } else {
                        newNode.next = cur.next;
                        priv.next = newNode;
                        return;
                    }
                }
                priv = cur;
                cur = cur.next;
            }
            priv.next = newNode;
        }
    }

    public void get(K key) {
        int hash = hash(key);
        if (table[hash] == null) System.out.println("Пусто в корзине ");
        if (table == null) System.out.println("Массив пустой");
        else {
            Node<K, V> newNode = table[hash];
            while (newNode != null) {
                if (newNode.key.equals(key)) {
                    System.out.println(newNode.value);
                    newNode = newNode.next;
                }

            }
        }

    }

    public boolean remove(K key) {
        int hash = hash(key);

        if (table[hash] == null) return false;
        else {
            Node<K, V> priv = null;
            Node<K, V> cur = table[hash];

            //пока не достигнем последнего элемента в корзине
            while (cur != null) {
                if (cur.key.equals(key)) { //Если ключь текущего элемента равен ключу то удаляем первый элемент
                    //Удаление первого эдемента если нет предыдущего
                    if (priv == null) {
                        table[hash] = table[hash].next;
                        return true;
                    } else { // удаляем предыдущий элемент в корзине и ставим на его место текущий
                        priv.next = cur.next;
                        return true;
                    }
                }
                priv = cur;
                cur = cur.next;
            }
            return false;
        }

    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % DEFAULT_CAPACITY;
    }

    public void display() {

        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            if (table[i] != null) {
                Node<K, V> entry = table[i];
                while (entry != null) {
                    System.out.print("{" + entry.key + "=" + entry.value + "}" + " ");
                    entry = entry.next;
                }
            }
        }

    }

    class Node<K, V> {
        final K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

    }
}
