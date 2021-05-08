package com.LinkedList;

public class LinkList {

    private Link first;   //сылка на первый элемент списка

    public LinkList(){    //конструктор
        first = null;
    }

    public boolean isEmpty(){   //true, если список пуст
        return (first==null);
    }

    public void insertFirst(int id, double dd){   //вставка элемента в начало списка
        Link newLink = new Link(id,dd);           //создание нового элемента
        newLink.next = first;                     //newLink --> старое значение first
        first = newLink;                          //first --> newLink
    }

    public Link deleteFirst(){                    //удаление первого элемента
        Link temp = first;                        //сохранение ссылки
        first = first.next;                       //удаление (first--> ссылка на второй элемент)
        return temp;                              //возвращает ссылку на удаленный элемент
    }

    public void displayLink(){                    //вывод
        System.out.println("List (первый --> последний): ");
        Link current = first;                     //от начала списка
        while (current != null){                  //перемещение до конца списка
            current.displayLink();                //вывод данных
            current = current.next;               //переход к следующему элементу
        }
        System.out.println(" ");
    }

    public Link find(int key){                    //поиск элемента с заданным ключом
        Link current = first;                     //начиная с first
        while(current.iData != key){              //пока совпадения не найдено
            if(current.next == null)              //если достигнут конец списка
                return null;                      //и совпадения не найденно
            else
                current = current.next;           //перейти к следующему элементу
        }
        return current;                           //совпадение обнаружено
    }

    public Link delete(int key){                  //удаление элемента с заданным ключом
        Link current = first;                     //поиск элемента с заданным ключом
        Link previous = first;
        while (current.iData != key){
            if(current.next == null)
                return null;                      //элемент не найден
            else {
                previous = current;               //перейти к следующему элементу
                current = current.next;
            }
        }                                         //совпадения не найдено
        if(current == first)                      //если первый элемент
            first = first.next;                   //изменить first
        else
            previous.next = current.next;         //в противном случае обойти его в списке
        return current;
    }
}
