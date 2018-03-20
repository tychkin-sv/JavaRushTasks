package com.javarush.task.task16.task1619;

/* 
А без interrupt слабо?
*/

public class Solution {
    public static boolean isCancel;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
isCancel=true;
    }

    public static class TestThread implements Runnable {
       /* boolean isCanceled;
        public void cancel(){
         isCanceled = true;
        }*/

        public void run() {

            while (!isCancel) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}