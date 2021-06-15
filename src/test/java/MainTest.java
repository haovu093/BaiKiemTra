import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    void testB1(){
        Main main = new Main();
        String str = "You Only Live Once. But if You do it right. once is Enough";
        assertThat(str).isNotNull()
                .isEqualTo(7);
    }

}