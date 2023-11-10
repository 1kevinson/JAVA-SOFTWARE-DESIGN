package com.example.demo.static_factory_method;

public class SimpleBoolean {
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}