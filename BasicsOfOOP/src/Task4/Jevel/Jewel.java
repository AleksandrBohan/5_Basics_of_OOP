package Task4.Jevel;

import Task4.Jevel.Name.Name;
import Task4.Jevel.Price.Price;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Jewel {
Jewel(){
    System.out.println("What do you want to do with jevels:");
    System.out.println("    1 - to watch");
    System.out.println("    2 - to choose the most expensive");
    System.out.println("    3 - a certain amount of jevels");

}

void toChoose() throws IOException {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    if (number == 1){
        Name name = new Name();
        name.getName(10);
        Price price = new Price();
        price.getPrices(10);
    }
    else if (number == 2){
        new Price().theMostExpensive();
    }
}

    public static void main(String[] args) throws IOException {
        Jewel jevels = new Jewel();
        jevels.countOfJevels(10);
    }

}
