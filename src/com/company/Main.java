package com.company;

public class Main {

    public static void main(String[] args) {

            String text="Сюда можно ввести любой текст.";
            int i =text.indexOf(".");
            int y =text.indexOf(" ");
            System.out.println("Всего символов: "+i);
            System.out.println("Пробелов в предложении:"+y);
    }
}
