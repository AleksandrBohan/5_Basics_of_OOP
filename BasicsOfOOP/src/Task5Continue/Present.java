package Task5Continue;

public class Present {

   private String name;
   private Candy [] candies;
   private Pack [] packs;

    Present(String name, Pack[] packs, Candy [] candies){

        System.out.println("Present " + name);

        this.name = name;
        this.candies = candies;
        this.packs = packs;



    }

    public static void main(String[] args) {
                new Present("Pretty", new Pack[]{
                new Pack("Pretty"), new Pack("Lonely")},
                new Candy[]{new Candy("Buble"), new Candy("Jele")});
    }
}
