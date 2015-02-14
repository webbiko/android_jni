package com.web.android.app;

import com.web.android.jni.Arithmetic;

public class Main {
    
    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();
        final double result = a.add(50, 30);
        System.out.println(result);
    }
    
}
