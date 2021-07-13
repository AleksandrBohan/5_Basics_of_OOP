package Task4.Jevel.Price;

import Task4.Jevel.Jewel;
import Task4.Jevel.Name.Name;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Price{
    private int [] prices;

    String output(int index) throws IOException, FileNotFoundException {

        final String PRICE = "Prices.txt";


        Scanner reader = new Scanner(new File(PRICE));
        String fileLine = Files.readAllLines(Paths.get("Prices.txt")).get(index);
        return fileLine;

    }
    public void getPrices(int count) throws IOException {

        prices = new int[count];

        for (int i = 0; i < count; i++){
            prices[i] = Integer.valueOf(output(i));
        }
    }

   public void theMostExpensive(){
        int maxValue = 0;
        int index = 0;
        for (int i = 0; i < prices.length; i++){
            if (prices[i] > maxValue){
                maxValue = prices[i];
                index = i;
            }
        }
        System.out.println(new Name().names[index]);
        System.out.println(maxValue);
    }
}
