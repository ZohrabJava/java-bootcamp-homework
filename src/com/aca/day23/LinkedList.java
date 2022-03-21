package com.aca.day23;

import java.util.Iterator;

public class LinkedList implements List  {
    int size;
    Node head;

    public LinkedList() {

    }

    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator();
    }

    public class LinkedListIterator implements Iterator<Integer>{
        Node current=head;
        @Override
        public boolean hasNext() {
            return current!=null;
        }
        @Override
        public Integer next() {
           Integer returnVal=current.val;
           current=current.next;
           return returnVal;
        }
    }
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }


    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size != 0;
    }

    @Override
    public int get(int index) {
        Node rec = head;
        for (int i = 0; i < size; i++) {
            if (index == i) {
                return rec.val;
            }
            rec = rec.next;
        }
        throw new IndexOutOfBoundsException("Index out");
    }

    @Override
    public void add(int val) {
        if (size() == 0) {
            head = new Node(val);
            size++;
        } else {
            Node end = head;
            while (end.next != null) {
                end = end.next;
            }
            end.next = new Node(val);
            size++;
        }
    }

    @Override
    public void add(int index, int val) {
        if (index > size() || index < 0) {
            throw new IndexOutOfBoundsException("Index out");
        }
        if (index == size) {
            add(val);
        }else if(index==0){
            Node start=new Node(val);
            Node end=head;
            head=start;
            head.next=end;
            size++;
        }
        else {
            Node change = new Node(val);
            size++;
            Node start = head;
            Node end;
            for (int i = 0; i < index-1; i++) {
                start = start.next;
            }
            end = start.next;
            start.next = change;
            change.next = end;
        }

    }

    @Override
    public void delete(int index) {
        if(index==0){
            head=head.next;
            size--;
        }else {
            Node start = head;
            Node end;
            for (int i = 0; i < index - 1; i++) {
                start = start.next;
            }
            end = start.next;
            end = end.next;
            start.next = end;
            size--;
        }
    }

    @Override
    public String toString() {
        String ret;
        Node start = head;
        StringBuilder retBuilder = new StringBuilder("[");
        while (start != null) {
            retBuilder.append(start.val);
            retBuilder.append("->");
            start = start.next;
        }
        ret = retBuilder.toString();
        ret += ("null]");
        return ret;
    }

    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.add(10);
        li.add(30);
        li.add(40);
        li.add(50);
        System.out.println(li.toString());
        li.add(0, 20);
        System.out.println(li.toString());
        li.add(3,5);
        System.out.println(li.toString());
        li.delete(0);
        System.out.println(li.toString());
        li.delete(2);
        System.out.println(li.toString());
        li.delete(3);
        System.out.println(li.toString());

        for(Integer i : li){
            System.out.println(i);
        }
        //Colection API Aray list,
    }
}
