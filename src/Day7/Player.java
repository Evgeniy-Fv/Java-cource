package Day7;

class Player {
    private int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public int getStamina(){
        return stamina;
    }
    public static int getCountPlayers(){
        return countPlayers;
    }

    public Player(int stamina){
        this.stamina = stamina;
        if(countPlayers<6){

        countPlayers++;}


    }
    int x=0;
    public void run(){
        if (stamina == 0)
            return;;

            stamina--;

        if (stamina == 0)
            countPlayers--;




        }


    public static void info(){
        if(getCountPlayers()<6)
        System.out.println("Команды неполные. На поле есть ещё "+(6-countPlayers)+" мест.");
        else
        System.out.println("На поле нет свободных мест");

    }
}
