import java.util.HashMap;
public class Abbreviations{
    private HashMap<String, String> abbrevMap;
    public Abbreviations(){
        this.abbrevMap = new HashMap<>();
    }
    public void addAbbreviations(String abbreviation, String explanation){
        abbrevMap.put(CleanString(abbreviation),explanation);
    }
private String CleanString(String abbreviation) {
        return null;
    }
public boolean hasAbbreviation(String abbreviation){
    return this.abbrevMap.containsKey(abbreviation);
}
public String findExplanationFor(String abbreviation){
    return this.abbrevMap.get(cleanString(abbreviation));
}
public void printkeys(){
    for(String e : this.abbrevMap.keySet()){
        System.out.println(e);
    }
}
public String cleanString(String strToClean){
    if (strToClean == null){
        return "";
    }
    return strToClean.toLowerCase().trim();
}
}