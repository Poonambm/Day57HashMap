import java.util.HashMap;
public class IOU {
    private HashMap<String,Double>mapOfIOU;
    //Main.java
    public IOU(){
        this.mapOfIOU = new HashMap<>();

    }
    public void setSum(String toWhom, double amount){
        mapOfIOU.put(toWhom,amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        return mapOfIOU.getOrDefault(toWhom,0.0);
    }
}
