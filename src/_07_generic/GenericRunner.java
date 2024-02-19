package _07_generic;

import java.util.ArrayList;

class CustomList<T> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T elem) {
        list.add(elem);
    }
    public  void removeElement(T elem) {
        list.remove(elem);
    }

    public T get(int i) {
        return list.get(i);
    }

    public String toString() {
        return "CustomList : " + list;
    }
}
public class GenericRunner {
    public static void main(String[] args) {
        CustomList<String> li = new CustomList<>();
        li.addElement("gdgdgd");
        System.out.println(li);
        li.removeElement("gdgdgd");
        System.out.println(li);
        System.out.println();

        CustomList<Integer>li2 = new CustomList<>();
        li2.addElement(141);
        System.out.println(li2.get(0));
        System.out.println(li2);
        li2.removeElement(141);
        System.out.println(li2);
    }
}
