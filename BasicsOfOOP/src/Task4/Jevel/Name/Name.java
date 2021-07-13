package Task4.Jevel.Name;

import Task4.Jevel.Jewel;
import Task4.Jevel.Price.Price;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Name {
    public String [] names;

    String output(int index) throws IOException, FileNotFoundException {

        final String NAME = "Names.txt";


        Scanner reader = new Scanner(new File(NAME));
        String fileLine = Files.readAllLines(Paths.get("Names.txt")).get(index);
        return fileLine;

    }
    public void getName(int count) throws IOException {
        names = new String[count];

        for (int i = 0; i < count; i++){
            names[i] = output(i);
        }
    }
}
