package arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EncodeDecodeTest {
EncodeDecode ed = new EncodeDecode();
    @Test
    void encodeDecodeTest1() {
        List<String> list = List.of("neet","code","love","you");
        String encode = ed.encode(list);
        assertEquals(list, ed.decode(encode));
    }

    @Test
    void encodeDecodeTest2() {
        List<String> list = List.of("we","say",":","yes");
        String encode = ed.encode(list);
        assertEquals(list, ed.decode(encode));
    }

    @Test
    void integerTEst(){
        System.out.print('2'-'1');
    }
}