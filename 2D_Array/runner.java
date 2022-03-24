
public class runner
{
    String[] players = new String[20];
    
    public runner()
    {
        for (int i = 0; i < players.length; i++) 
            players[i] = "Dude " + i;
        
        print2D(array2D.draft(players));
    }
    
    public void print2D(String[][] print) {
        int coach = 1;
        for (String[] printS: print) {
            System.out.print("\ncoach " + coach + " ");
            coach++;
            for (String printSS: printS) 
                System.out.print(printSS+" ");
        }
    }
}
