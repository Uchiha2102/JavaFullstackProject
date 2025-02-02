import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {


    @BeforeEach
    void resetXY(){
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
    }


    @Test
    void X_return0WhenStart() {
        // Given
        int excepted =  0;
        //When
int actual = PlayerCharacter.getX();
        //Then
        assertEquals(excepted,actual);
    }

    @Test
    void Y_return0WhenStart()
    {
        //Given
        int excepted = 0;
        // When
        int actual = PlayerCharacter.getY();
        // Then
        assertEquals(excepted,actual);
    }

    @Test
    void


}
