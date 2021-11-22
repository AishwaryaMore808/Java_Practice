import org.json.simple.JSONObject;
public class JsonEncode {
public static void main(String[] args) {

JSONObject obje = new JSONObject();

obje.put("bal", new Double(100.22));
obje.put("number", new Integer(200));
obje.put("check_vvip", new Boolean(true));
obje.put("name1", "sean");

System.out.print(obje);
}
}