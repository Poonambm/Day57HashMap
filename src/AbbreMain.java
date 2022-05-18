public class AbbreMain {

     public static void main(String[] args) {
        
Abbreviations abbreviations = new Abbreviations();
abbreviations.addAbbreviations("e.g.", "for example");
abbreviations.addAbbreviations("etc.", "and so on");
abbreviations.addAbbreviations("i.e.", "more precisely");

String text = "e.g. i.e. etc. lol";

for (String part: text.split(" ")) {
    if(abbreviations.hasAbbreviation(part)) {
        part = abbreviations.findExplanationFor(part);
    }

    System.out.print(part);
    System.out.print(" ");
}

System.out.println();
}
}