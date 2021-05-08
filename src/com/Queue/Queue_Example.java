package com.Queue;

public class Queue_Example {
    private int maxSize;
    private long[]queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue_Example(int s){        //конструктор
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = - 1;
        nItems = 0;
    }

    public void insert(long j){          //вставка элемента в конец очереди
        if(rear == maxSize-1)            //циклический перенос
            rear = -1;
        queArray[++rear] = j;            //увеличение rear и вставка
        nItems++;                        //увеличение количества элементов
    }

    public long remove(){                //извлечение элемента в начале очереди
        long temp = queArray[front++];   //выборка и увеличение front
        if(front==maxSize)               //циклический перенос
            front = 0;
        nItems--;                        //уменьшение количества элементов
        return temp;
    }

    public String peekFront(){            //чтение элемента в начале очереди
        return "первый элемент очереди: " + queArray[front];
    }

    public boolean isEmpty(){           //true, если очередь пуста
        return (nItems == 0);
    }

    public String isFull(){            //true, если очередь заполнена
        if(nItems == maxSize) {
            return "очередь заполнена";
        }else{
            return "очередь не заполнена";
        }
    }

    public String size(){                  //количество элементов в очереди
        return "количество элементов в очереди:" + nItems;
    }
}
