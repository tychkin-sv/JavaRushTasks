package com.javarush.task.task18.task1806;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Исправить ошибки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");
        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            // System.out.println(inputStream.available());
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            //System.out.println(Arrays.toString(buffer));
            outputStream.write(buffer, 0, count);
           //outputStream.flush();
        }

        //outputStream.flush();
        inputStream.close();
        outputStream.close();
    }
}