package Task5Continue;

import java.util.Scanner;

public class Candy {
   private String name;
   private String [] type;
   private String [] color;

    Candy(String name){

        this.name = name;

        System.out.println("Make your choise of candy colour:  " + "\n");
        System.out.println("1 - Red\n2 - Blue\n3 - White\n4 - Green");

        Scanner colorScanner = new Scanner(System.in);
        int candyColor = colorScanner.nextInt();


        System.out.println("Make your choise of candy type:  " + "\n");
        System.out.println("1 - Swat\n2 - Kaka\n3 - Lulu\n4 - Fife");

        Scanner typeScanner = new Scanner(System.in);

        int candyType = typeScanner.nextInt();

        System.out.println("Candy name is  " + name);
        System.out.println("Candy type: " + type[candyType]);
        System.out.println("Candy color: " + color[candyColor]);

    }

    String setType(int index){
        type = new String[]{"Swat", "Kaka", "Lulu", "Fife"};
        return type[index];
    }

    String setColor(int index){
        color = new String[]{"Red", "Blue", "White", "Green"};
        return color[index];
    }

    String getType(){

    }

}
