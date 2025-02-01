import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    void resetAllXY() {
        PlayerCharacter.x =0;
        PlayerCharacter.y =1;
    }


    @Test
    void getZeroWhenStart() {
        //Given
        int expected = 0;
        //When
        int actual = PlayerCharacter.getX();
        //Then
        assertEquals(expected, actual);
    }


}