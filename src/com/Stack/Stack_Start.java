package com.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stack_Start {
    public static void main(String[] args) throws Exception {
        Stack_Example FirstStack = new Stack_Example(5);   //создаём новый объект класса Stack_Example

        FirstStack.push(3);   //заполняем поочерёдно значениями пять элементов стэка
        FirstStack.push(41);
        FirstStack.push(28);
        FirstStack.push(9);
        FirstStack.push(77);

        System.out.println(FirstStack.isFull()+"\n");  //вывод в консоль полон ли стэк (true - если полон)


        while (!FirstStack.isEmpty()){      //пока стэк не станет пустым
            long value = FirstStack.pop();  //удалить элемент из стэка
            System.out.println(value);      //вывод содержимого
        }
        System.out.println(" ");

        Stack_Example TwoStack = new Stack_Example(5);
        TwoStack.push(23);
        TwoStack.push(41);
        TwoStack.push(93);
        TwoStack.push(25);
        System.out.println(TwoStack.isEmpty());

        System.out.println(TwoStack.peek());   //вывод верхнего элемента стэка

        String input, output;
        while (true){
           System.out.println("Введите строку символов или 0 для выхода: ");
           System.out.flush();   //перенос содержимого буфера в соответсвующий поток
           input = getString();   //чтение строки с клавиатуры
           if (input.equals("0")) {
               break;
           }
            Reverse_Letters theRevers = new Reverse_Letters(input);
            output = theRevers.doRevers();
            System.out.println("Реверс строки: " + output);
       }
    }


    private static String getString() throws IOException {
        InputStreamReader InputString = new InputStreamReader(System.in);
        BufferedReader Buffer = new BufferedReader(InputString);
        return Buffer.readLine();
    }
}
