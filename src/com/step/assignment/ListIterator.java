package com.step.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator {
    private List<Integer> list;
    private int index;

    public ListIterator(List<Integer> list) {
        this.list = list;
        this.index =-1;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        ListIterator iterator = new ListIterator(list);
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

    }
    public boolean hasNext(){

        return ++this.index < this.list.size();
    }

    public int next(){
        ++this.index;
        if(index <this.list.size()) {
            return this.list.get(index);
        }
        throw new NoSuchElementException("No Such Element Exists");
    }
}
