package com.alainodea.training;

public class Application {
    public static void main(String[] args) {
        MessagePrinter messagePrinter = new MessagePrinterImpl(new MessageProviderImpl());
        messagePrinter.printMessage();
    }
}
