class Main {
    public static void main(String[ ] args) {
        int dolphinScores[] = {44, 23, 71};
        int KoalaScores[] = {65, 54, 49 };
        ICalculateAverage calAverage = (int [] scores) -> {
            int lengthOfScores = scores.length;
            int sum = 0;
            for(int i=0; i<lengthOfScores; i++){
                sum+=scores[i];
            }
            return sum/lengthOfScores;
        };
        

        ICheckWinner checkGameWinner = (double AvgDolphin, double avgKoala) -> {
        if(AvgDolphin>avgKoala*2.0){
            System.out.println("Dolphin Wins (" + AvgDolphin + " vs. " + avgKoala + ")");
        }
        else if(avgKoala>AvgDolphin*2.0){
            System.out.println("Koala Wins (" + avgKoala + " vs. " + AvgDolphin + ")");
        }
        else {
            System.out.println("No winner");
            System.out.println("Scores: Koala (" + avgKoala + " vs. " + AvgDolphin + ") Dolphin");
        }
        };
  
        double avgDolphins = calAverage.average(dolphinScores);
        double avgKoalas = calAverage.average(KoalaScores);
        checkGameWinner.checkWinner(avgDolphins, avgKoalas);
        
    }
}

interface ICalculateAverage {
    double average(int[] args);
}
interface ICheckWinner {
    void checkWinner(double AvgDolphin, double AvgKoala);
}