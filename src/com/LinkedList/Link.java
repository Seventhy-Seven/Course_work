package com.LinkedList;

public class Link {

    public int iData;    //данные(ключ)
    public double dData; //данные
    public Link next;    //следующий элемент в списке

    public Link(int id, double dd){    //конструктор
        iData = id;
        dData = dd;
    }
    public void displayLink(){        //вывод содержимого элемента
        System.out.println("[" + iData + "," + dData + "]");
    }
}

