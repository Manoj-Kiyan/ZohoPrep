

public class CricketScore {
    public static void main(String[] args) {
        String scores =". 1 . 2 . 4 3 6 W 1 . N . 2 1";
        calculateScore(scores);
    }
    public static void calculateScore(String scores){
        int player1Score=0;
        int player2Score=0;
        int extras=0;
        boolean isplayer1OnStrike=false;
        String[] events=scores.split(" ");

        for (String event : events) {
            switch (event) {
                case "W":
                case "N":
                    extras++;                   
                    break;

                case ".":
                    break;
                default:
                    int runs =Integer.parseInt(event);
                    if(isplayer1OnStrike){
                        player1Score +=runs;
                    }else{
                        player2Score +=runs;
                    }
                    if(runs % 2 != 0){
                        isplayer1OnStrike=!isplayer1OnStrike;
                    }
                    break;                
            }
            
        }
        System.out.println("Player1Score : "+ player1Score);
        System.out.println("Player2Score : "+ player2Score);
        System.out.println("Extras : "+ extras);

    }
    
}
