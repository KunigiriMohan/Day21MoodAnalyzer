import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {

    @org.junit.jupiter.api.Test
    void analyseMood() {
        MoodAnalyser obj = new MoodAnalyser();              //Creating MoodAnalyser object to access method in MoodAnalyser Class
        obj.analyseMood("SAD");
        assertEquals("SAD",obj.analyseMood("Sad"));     //Checking input value matches with given condition
    }
    @org.junit.jupiter.api.Test                                       //Testing TC 1.1
    void analyseMood2() {
        MoodAnalyser obj = new MoodAnalyser();              //Creating MoodAnalyser object to access method in MoodAnalyser Class
        obj.analyseMood("SAD");
        assertEquals("SAD",obj.analyseMood("I am in Sad Mood"));     //Checking input value matches with given condition
    }

    @org.junit.jupiter.api.Test
    void analyseMood3() {                                       //Testing TC1.2
        MoodAnalyser obj = new MoodAnalyser();              //Creating MoodAnalyser object to access method in MoodAnalyser Class

        assertEquals("HAPPY",obj.analyseMood("I am in Any Happy Mood"));
    }
}