import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.net.URI;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
  private static ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1);
  static ScheduledFuture<?> t;
  public static int attempt = 0;
  public static Content content = new Content();


  public static void main(String[] args) {
      Twilio.init(TwilioConfig.TwilioSid,TwilioConfig.authToken);
      t = executorService.scheduleAtFixedRate(postman,0,15,TimeUnit.MINUTES);

  }

  public static final Runnable postman = new Runnable() {
    public void run() {
      //getting the content from the hashMap
      Map map = content.getContent();
      Object [] array  = map.keySet().toArray();
      int length = array.length;
      //First Message
      if(attempt == 0){
        Message message = Message.creator(new PhoneNumber("whatsapp:+919456609191"),
            new PhoneNumber("whatsapp:+14155238886"), "Hello there, Since I know I have messed up in numerous ways, here is a way for me to have some redemption."
                + "I have created this app that will send you randomized images every 15 mins, I Think it will send about 5-6 images. Hope you'll like it!!").create();

        System.out.println(message.getSid());
      }
      else {
        Object randomEntry = array[attempt];
        Message message = Message.creator(new PhoneNumber("whatsapp:+919456609191"),
            new PhoneNumber("whatsapp:+14155238886"), randomEntry.toString())
            .setMediaUrl(Arrays.asList(URI.create(map.get(randomEntry).toString()))).create();
        System.out.println(message.getSid());
      }

      attempt++;
      if(attempt >= length){
        Message message = Message.creator(new PhoneNumber("whatsapp:+919456609191"),
            new PhoneNumber("whatsapp:+14155238886"), "This took a lot of effort, appreciate it").create();
        System.out.println(message.getSid());
        executorService.shutdown();
      }

    }
  };



}
