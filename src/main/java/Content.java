import java.util.HashMap;
import java.util.Map;

public class Content {
  private static Map<String,String> content = new HashMap<String, String>();

  public Content() {
    register("Nothing here, just a Smart boi","https://drive.google.com/u/0/uc?id=19qpZznwZl4EdJ9rxXm_edN-iDw-QrUDk&export=download");
    register("Smiling becomes involuntary around you", "https://drive.google.com/u/0/uc?id=1JJAVEQeT_vkb8pXb_kLaKLJBn1Qwhpc5&export=download");
//    register("Cutest puppies ever", "https://drive.google.com/u/0/uc?id=1OUWddiXjM1ftBkk33mb01jwhh_oTMDcC&export=download ");
    register("my favorite place to chill", "https://drive.google.com/file/d/1UwZoNnAVjyM3HwXKBYvSaV-QZ12pAkAC/view?usp=sharing");
    register("You totally are a sight to behold", "https://drive.google.com/u/0/uc?id=1eSUK4o3xI4oDJXbwYgT_dCA0gzy4mbjj&export=download");
    register("You shine bright, letting that light into my life", "https://drive.google.com/u/0/uc?id=1ekg5Rft40mAcWq7E0ErwQehWRXFf_5Cv&export=download");
    register("I hope we can go on many more adventures together", "https://drive.google.com/u/0/uc?id=1e_88btyHL-zPbuf6fTt3PjCKeyRCdXlk&export=download");
    register("Keep yawning your troubles away", "https://drive.google.com/u/0/uc?id=1eoKP7n7-d6VLm4gtZ_LRPSojGB9GhDsB&export=download");
    register("Buri nazar wale tera muh kaala", "https://drive.google.com/u/0/uc?id=1ex9_0KVELlOtCU6bs3QUB6MYXq1R-p9x&export=download");
    register("Saste nashe band karo plis, also you look cute in this", "https://drive.google.com/u/0/uc?id=1euiKLuePe55CWSBumOQm1G8Q8xXdtEa1&export=download");
  }

  public void register(String message, String url){
    content.put(message,url);
  }

  public Map<String, String> getContent() {
    return content;
  }
}
