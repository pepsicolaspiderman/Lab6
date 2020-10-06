package Var;

import java.io.*;

public class Var4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out=null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:\\Lab6\\MyFile1.txt")));
            out = new PrintWriter("C:\\Lab6\\MyFile2.txt");

            String s;
            int lineCount = 0;
            int pervslovo = 0;
            int dlin = 0;

            while ((s = br.readLine()) != null) {
                lineCount++;
                for (String who : s.split(" ")) {
                    if(pervslovo == 0){
                        System.out.print("Длина первого слова "+lineCount+" строки = " + who.length());
                        out.print(who + " ");
                        pervslovo++;
                        dlin = who.length();
                    } else if(dlin > who.length()) {
                        out.print(who + " ");
                    }
                }
                pervslovo = 0;
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!");
        } finally{
            br.close();
            out.flush();
            out.close();
        }
    }
}

