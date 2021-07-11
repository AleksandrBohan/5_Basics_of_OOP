package Task4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Jevels {

   private int price;
   private String name;

   void input(){
       try(FileWriter writer = new FileWriter("notes3.txt", false))
       {
           // запись всей строки
           String text = "Hello Gold!";
           writer.write(text);
           // запись по символам
           writer.append('\n');
           writer.append('E');

           writer.flush();
       }
       catch(IOException ex){

           System.out.println(ex.getMessage());
       }
   }

   void countOfJevels() throws IOException {
       String [] s = new String[4];

       for (int i = 0; i < s.length; i++){
           String line = Files.readAllLines(Paths.get("Jevels.txt")).get(i);
           s[i] = line;
           System.out.println(s[i]);
       }
   }

void output() throws IOException, FileNotFoundException {
    final String PATH = "Jevels.txt";


        //Scanner read = new Scanner(System.in);
       // System.out.print("Введите строку: ");
       // String sub = read.nextLine();

        //читаем файл
        try (Scanner reader = new Scanner(new File(PATH))) {
            String line3 = Files.readAllLines(Paths.get("Jevels.txt")).get(0);
            System.out.println(line3);

            while (reader.hasNextLine()) {
                String lineFile = reader.nextLine();
                //если строка из файласодержит наш текст, то выводим
              /*  if (lineFile.contains(sub)) {
                    System.out.println(lineFile);
                }*/
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }





    public static void main(String[] args) throws IOException {
        Jevels jevels = new Jevels();
        //jevels.input();
        jevels.countOfJevels();
    }

}
