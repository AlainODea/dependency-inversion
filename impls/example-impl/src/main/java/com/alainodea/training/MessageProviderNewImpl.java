package com.alainodea.training;

public class MessageProviderNewImpl implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello, DI World!";
    }
}
