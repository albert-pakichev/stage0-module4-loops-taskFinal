package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        for(int i = 1; i < numberTableToPrint; i++){
            for(int k = 1; k < numberTableToPrint; k++){
                System.out.print(k * i + "  ");
            }
            System.out.println("");
        }
    }
}
