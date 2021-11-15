import java.util.Locale;

public class MoodAnalyser {
    String message;
    MoodAnalyser(String message){
        this.message=message;                               //Creating constructer of the class
    }

    public String analyseMood(){
        MoodAnalyser obj = new MoodAnalyser(message);                       
        boolean store = obj.message.toLowerCase(Locale.ROOT).contains("sad");       //Checking Word present in string by converting into lowerCase

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
