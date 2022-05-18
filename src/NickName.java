import java.util.HashMap;

public class NickName {
    public static void main(String[] args) throws Exception {

        HashMap<String,String>NickNames = new HashMap<>();
        NickNames.put("mathhew","matt");
        NickNames.put("michael","mix");
        NickNames.put("arthur","artie");
        System.out.println(NickNames.get("mathhew"));

    }
}
