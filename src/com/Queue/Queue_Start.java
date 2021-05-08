package com.Queue;

public class Queue_Start {
    public static void main(String[] args) {

        Queue_Example firstQueue = new Queue_Example(5);  //очередь из 5 ячеек
        firstQueue.insert(3);                              //вставка 4-х элементов
        firstQueue.insert(9);
        firstQueue.insert(7);
        firstQueue.insert(1);

        firstQueue.remove();                                 //удаление 3-х элементов
        firstQueue.remove();
        firstQueue.remove();

        firstQueue.insert(5);                              //вставка еще 3-х элементов
        firstQueue.insert(12);
        firstQueue.insert(77);

        System.out.println(firstQueue.peekFront());          //первый элемент в очереди
        System.out.println(firstQueue.isFull());             //проверка на заполненность очереди
        System.out.println(firstQueue.size());               //вывод количества элементов в очереди

        while (!firstQueue.isEmpty()){                       //извлечение и вывод всех элементов
            long n = firstQueue.remove();
            System.out.println(n);
        }
        System.out.println(" ");
    }
}
