import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {

    private Voetbalclub v;
    @BeforeEach
    public void init(){
        v = new Voetbalclub("Atletico");
        v.verwerkResultaat('w'); // correcte invoer
        v.verwerkResultaat('g');
        v.verwerkResultaat('v');

        v.verwerkResultaat('b'); //incorrecte invoer
        v.verwerkResultaat('a');
        v.verwerkResultaat('f');
    }

    @Test
    void Voetbalclubzondernaam(){
        System.out.println("Test Voetbalclubzondernaam");
        Voetbalclub B = new Voetbalclub(""); // nieuwe club zonder naam
        assertNotNull(B.getNaam());
    }

    @Test
    void verwerkResultaat() {
        System.out.println("test verwerk ressultaat");
        Voetbalclub A = new Voetbalclub("Barca");
        A.verwerkResultaat('w');
        assertEquals(3,A.aantalPunten()); //winnen is 3 punten?
        A.verwerkResultaat('g');
        assertEquals(4,A.aantalPunten()); //gelijkspelen is 1 punt
        A.verwerkResultaat('v');
        assertEquals(4,A.aantalPunten()); // verliezen is geen punt
    }

    @Test
    void aantalPunten() {
        System.out.println("test aantal punten");
        assertEquals(4, v.aantalPunten());
    }

    @Test
    void aantalGespeeld() {
        System.out.println("test aantal gespeeld");
        assertEquals(3, v.aantalGespeeld());
    }
}