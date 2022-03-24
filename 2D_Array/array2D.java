
public class array2D
{
    public static String[][] draft(String[] players) {
        String[][] temp = new String[4][players.length/4];
        boolean swap = false;
        int playerI = 0;
        
        for (int i = 0; i < players.length/4; i++) {
            if (!swap) {
                for (int ii = 0; ii < 4; ii++) {
                    temp[ii][i] = players[playerI];
                    playerI++;
                }
                swap = true;
            }
            else {
                for (int ii = 3; ii >= 0; ii--) {
                    temp[ii][i] = players[playerI];
                    playerI++;
                }
                swap = false;
            }
        }
        
        return temp;
    }
    
    public static int[][] flipHor(int[][] changer) {
        int temp;
        
        for (int i = 0; i < changer.length; i++) 
            for (int ii = 0; ii < changer[i].length/2; ii++){
                temp = changer[i][ii];
                changer[i][ii] = changer[i][changer[i].length-ii];
                changer[i][changer[i].length-ii] = temp;
            }
        
        return changer;
    }
    
    public static int[][] rotate90(int[][] changer) {
        int[][] temp = new int[changer[0].length][changer.length];
        
        return temp;
    }
}
