package com.company;

public class InteeruptedException extends Thread {
    public void run() {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        InteeruptedException i = new InteeruptedException();
i.start();
i.interrupt();
System.out.println("interrupted exception");
    }
}
