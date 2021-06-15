import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    void testB1(){
        Bai1 b1 = new Bai1();
        String str = "You Only Live Once. But if You do it right. once is Enough";
        assertThat(b1.demTu(str)).isEqualTo(7)
                .isNotNull();
        assertThat(b1.chuyentuInhoa(str)).isEqualTo("You Only Live Once. But If You Do It Right. Once Is Enough")
                .isNotNull();
    }

}