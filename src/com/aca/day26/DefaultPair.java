package com.aca.day26;

public class DefaultPair <K,V> implements Pair{
    K key;
    V value;
    @Override
    public K getKey() {
        return key;
    }
    @Override
    public V getValue() {
        return value;
    }

    public DefaultPair() {
    }

    public DefaultPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static void main(String[] args) {
        DefaultPair<Integer,String> pair=new DefaultPair<>(10,"G");
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
