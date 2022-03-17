package ru.saumlaki.di.entity;

/**
 * Класс описывает билет. Билет необходимо в начале напечатать, потом отправить на переработку. Для этого используем методы инициализации и уничтожения
 */
public class Ticket {

    public void print() {
        System.out.println("Печатаю билет");
    }

    public void remove() {
        System.out.println("Отдаю на переработку использованный билет");
    }
}
