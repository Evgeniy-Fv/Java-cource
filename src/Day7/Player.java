package Day7;

class Player {
    public int stamina;
    public final int MAX_STAMINA = 100;
    public final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public int getStamina(){
        return stamina;
    }
    public int getCountPlayers(){
        return countPlayers;
    }

    public Player(int stamina){
        if(countPlayers<6){
        this.stamina = stamina;
        countPlayers++;}


    }
    int x=0;
    public void run(){


                  switch (stamina){
                case 0:{
                    if(x==1)break;
                    System.out.println("Игрок уже заменен");
                countPlayers--;
                x=1;
                break;
                }

                default:
                    stamina--;
                    break;


        }}


    public void info(){
        if(getCountPlayers()<6)
        System.out.println("Команды неполные. На поле есть ещё "+(6-countPlayers)+" мест.");
        else
        System.out.println("На поле нет свободных мест");

    }
}
