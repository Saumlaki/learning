package ru.saumlaki.di.entity;

/**
 * Класс описывает зрителя концерта.
 * Зрителю необходим билет который мы дадим через создание внутреннего компонента
 */
public class Viewer {

    Ticket ticket;

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
