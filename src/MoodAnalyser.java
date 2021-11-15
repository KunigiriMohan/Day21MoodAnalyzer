import java.util.Locale;

public class MoodAnalyser {
    String message;

    MoodAnalyser(String message){
        this.message=message;                               //Creating constructer of the class
    }
        public String analyseMood () {
            MoodAnalyser obj = new MoodAnalyser(message);

            try {                                               //Handling Exception using try catch
                boolean store = obj.message.toLowerCase(Locale.ROOT).contains("sad");
                if (store == true)                   //Checking input contain sad or not
                {
                    return "SAD";
                } else {
                    return "HAPPY";
                }
            }
            catch (Exception rv){           //Catching of exception and return Happy
                System.out.println("Enter Proper Value ");
                return "Happy";
            }
        }
}
