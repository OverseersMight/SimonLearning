import java.util.Scanner;

public class GolfQ{
    class Golfer implements Comparable<Golfer>{
        public int score;
        public String name;
        @Override
        public int compareTo(Golfer o) {
            return score - o.score;
        }
        
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int numGolfers = s.nextInt();

        for(int i = 0; i<numGolfers; i++){

        }
        s.close();
    }
}