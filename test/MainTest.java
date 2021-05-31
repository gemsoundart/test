import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main=new Main();
        int a=1;
        int b=2;
        System.out.println(main.solution(a,b));
        //assertEquals(4,main.solution(a,b));
    }
}