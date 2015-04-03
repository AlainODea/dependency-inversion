package com.alainodea.training;

public class MessagePrinterImpl implements MessagePrinter {
    private final MessageProvider messageProvider;

    public MessagePrinterImpl(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public void printMessage() {
        System.out.println(messageProvider.getMessage());
    }
}
