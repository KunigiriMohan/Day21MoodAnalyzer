import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {

    @org.junit.jupiter.api.Test
    void analyseMood() {
        MoodAnalyser obj1= new MoodAnalyser(null);                          //Sending Null inorder handle Exception
        assertEquals("SAD",obj1.analyseMood());     //Checking input value matches with given condition
    }
}