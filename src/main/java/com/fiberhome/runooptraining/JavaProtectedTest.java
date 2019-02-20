package com.fiberhome.runooptraining;

public class JavaProtectedTest {
    public static void main(String[] args) {
        byte a = (byte) 0xFF;
        System.out.println(a);
        System.out.println(a+1);

        byte b = (byte)0x7F;
        System.out.println(b);
        byte c = (byte)(b+1);
        System.out.println(c);
    }

}
