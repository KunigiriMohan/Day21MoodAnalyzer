import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {

    @org.junit.jupiter.api.Test
    void analyseMood() {
        MoodAnalyser obj1= new MoodAnalyser("sad");
        assertEquals("SAD",obj1.analyseMood());     //Checking input value matches with given condition
    }
    @org.junit.jupiter.api.Test                                       //Testing TC 1.1
    void analyseMood2() {
        MoodAnalyser obj = new MoodAnalyser("I am in Sad Mood"); //Creating MoodAnalyser object to access method in MoodAnalyser Class
        assertEquals("SAD",obj.analyseMood());                  //Checking input value matches with given condition
    }

    @org.junit.jupiter.api.Test
    void analyseMood3() {                                       //Testing TC1.2
        MoodAnalyser obj = new MoodAnalyser("I am in Any Happy Mood");              //Creating MoodAnalyser object to access method in MoodAnalyser Class

        assertEquals("HAPPY",obj.analyseMood());
    }
}