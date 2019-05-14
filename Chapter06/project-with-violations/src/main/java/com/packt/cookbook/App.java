package com.packt.cookbook;

/**
 * Hello world!
 *
 */
public class App 
{
    public int add(int a, int b) {
        int c;
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        int c = a / b;
        return c;
    }

    public boolean checkValue(int i) {
        boolean status = false;
        switch(i) {
            case 3: status = true; break;
            case 7: status = false; break;
        }
        return status;
    }
    
    public void methodA() {
        int a = 3;
        int b = 2;
        int c = a + b;
        System.out.println(c);
        c = a - b;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(c);
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("i j" + i + " " + j);    
                int k = i % j;
                k++;
                System.out.println(k);
            }
        }
    }

    public void copyPasteMethod() {
        int a = 3;
        int b = 2;
        int c = a + b;
        System.out.println(c);
        c = a - b;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(c);
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("i j" + i + " " + j);    
                int k = i % j;
                k++;
                System.out.println(k);
            }
        }
    }
}
