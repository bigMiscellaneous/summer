import com.interfacedemo.Electronic_equipment.Keyboard;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainDemo {
    @Before
    public void init(){
        System.out.println("init...");
    }
    @Test
    public void testOpen(){
        Keyboard keyboard = new Keyboard();
        keyboard.open();
    }
    @After
    public void close(){
        System.out.println("close...");
    }
}
