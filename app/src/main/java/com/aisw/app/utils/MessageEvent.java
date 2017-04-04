package com.aisw.app.utils;


public final class MessageEvent {
    private MessageEvent() {
        throw new UnsupportedOperationException("This class is non-instantiable");
    }

    public static class Message1{
        public String str1;
        public Message1(String str) {
            str1 = str;
        }
    }


    public static class Message2{
        public String str2;
        public  Message2(final String str) {
            str2 = str;
        }
    }
}
