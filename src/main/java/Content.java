import java.util.HashMap;
import java.util.Map;

public class Content {
  private static Map<String,String> content = new HashMap<String, String>();

  public Content() {
    register("Nothing here, just a Smart boi","https://drive.google.com/u/0/uc?id=19qpZznwZl4EdJ9rxXm_edN-iDw-QrUDk&export=download");
  }

  public void register(String message, String url){
    content.put(message,url);
  }

  public Map<String, String> getContent() {
    return content;
  }
}
