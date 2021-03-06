package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //1909.txt
        //1909_result.txt
        String sourceFile = reader.readLine();
        String destFile = reader.readLine();
        FileReader fr = new FileReader(sourceFile);
        FileWriter fw = new FileWriter(destFile);
        BufferedReader bfr = new BufferedReader(fr);
        BufferedWriter bfw = new BufferedWriter(fw);

        while (bfr.ready()){
            String str = bfr.readLine();
            String newStr = str.replace(".", "!");
            System.out.println(newStr);
            bfw.write(newStr);

        }

        reader.close();
        bfw.close();
        bfr.close();
    }
}
