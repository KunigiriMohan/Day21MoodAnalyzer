import java.util.Locale;

public class MoodAnalyser {
    public String analyseMood(String message){
        String msg=message.toLowerCase(Locale.ROOT);        //Converting input from test class to Lower case
        if(msg.contains(("sad")))                   //Checking input contain sad or not
        {
            return "SAD";
        }
        else
        {
            return "HAPPY";
        }
    }
}
