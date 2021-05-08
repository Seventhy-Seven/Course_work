package com.LinkedList;

public class LinkedList_Start {
    public static void main(String[] args) {
        LinkList theList = new LinkList();
        theList.insertFirst(22,2.99);
        theList.insertFirst(44,4.99);
        theList.insertFirst(66,6.99);
        theList.insertFirst(88,8.99);

        theList.displayLink();
        theList.deleteFirst();

        Link f = theList.find(44);
        if(f!=null)
            System.out.println("Найдена ссылка с ключом " + f.iData);
        else
            System.out.println("Ссылкаа не найдена");

        Link d = theList.delete(66);
        if(d!=null)
            System.out.println("Удалена ссылка с ключом " + d.iData);
        else
            System.out.println("Не могу удалить ссылку");

        theList.displayLink();
    }
}
