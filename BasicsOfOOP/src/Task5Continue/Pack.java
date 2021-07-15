package Task5Continue;

import java.util.Scanner;

public class Pack {
   private String name;
   private String [] type;
   private String [] color;


    Pack(String name){

        this.name = name;


        type = new String[]{"Carton", "Paper", "Foil"};
        color = new String[]{"Blue", "White", "Black"};

        System.out.println("Make your choise of candy colour:  " + "\n");
        System.out.println("1 - Blue\n2 - White\n3 - Black");

        Scanner colorScanner = new Scanner(System.in);

        System.out.println("Make your choise of candy type:  " + "\n");
        System.out.println("1 - Carton\n2 - Paper\n3 - Foil");

        Scanner typeScanner = new Scanner(System.in);

        int packColor = colorScanner.nextInt();
        int packType = typeScanner.nextInt();

        System.out.println("Pack name is  " + name);
        System.out.println("Candy color: " + color[packColor]);
        System.out.println("Candy type: " + type[packType]);

    }
}
