package Day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args){
        Random rand = new Random();

        Player pl1 = new Player(rand.nextInt(12)+89);
        Player pl2 = new Player(rand.nextInt(12)+89);
        Player pl3 = new Player(rand.nextInt(12)+89);
        Player pl4 = new Player(rand.nextInt(12)+89);
        Player pl5 = new Player(rand.nextInt(12)+89);
        Player pl6 = new Player(rand.nextInt(12)+89);

            pl1.info();
            pl1.run();
            System.out.println(pl1.getStamina());
            System.out.println(pl1.getCountPlayers());
   }
}
