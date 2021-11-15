import java.util.Locale;

public class MoodAnalyser {
    String message;



    MoodAnalyser(String message){
        this.message=message;

    }

    public String analyseMood(){
        MoodAnalyser obj = new MoodAnalyser(message);
        String word = message.toLowerCase(Locale.ROOT);
        boolean store = obj.message.toLowerCase(Locale.ROOT).contains("sad");

        if(store == true)                   //Checking input contain sad or not
        {
            return "SAD";
        }
        else
        {
            return "HAPPY";
        }
    }
}
