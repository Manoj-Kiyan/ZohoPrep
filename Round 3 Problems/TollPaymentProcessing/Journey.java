import java.util.*;

class Journey {
    int startPoint;
    int endPoint;
    List<Integer> tollPassed;
    int amountPaid;


    public Journey(int startPoint,int endPoint,List<Integer> tollPassed,int amountPaid){
        this.startPoint=startPoint;
        this.endPoint=endPoint;
        this.tollPassed=new ArrayList<>(tollPassed);
        this.amountPaid=amountPaid;
    }
    
}
