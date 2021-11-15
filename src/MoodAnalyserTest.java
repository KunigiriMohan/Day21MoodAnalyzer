import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {

    @org.junit.jupiter.api.Test
    void analyseMood() {
        MoodAnalyser obj = new MoodAnalyser();              //Creating MoodAnalyser object to access method in MoodAnalyser Class
        obj.analyseMood("SAD");
        assertEquals("SAD",obj.analyseMood("sad"));     //Checking input value matches with given condition
    }
}