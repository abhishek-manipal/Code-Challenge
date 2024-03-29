package encode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class EncoderTest {
    @Test
    void testOctalDecode1() {
        String input = "31646541";
        byte[] expected = {103, 77, 97};
        Assertions.assertArrayEquals(expected,Encoder.decode(input, Base8Encorder.getInstance()));
    }

    @Test
    void testOctalDecode2() {
        String input = "116311474231113516702134342400414143206126403671660545535070012425145143"
                + "3665154621070427104557201067171276700627170465777043334607301704736021762"
                + "6325467150763006577133541526554667660414027165423126701315057614760526500"
                + "0452421616177052165224543311447543654741617367042213645643631333465753306"
                + "2163564254163664432653550166600433332675642447003252221104064117622317044"
                + "717471253";
        byte[] expected = {19, -103, 51, -60, -55, 46, -99, -62, 46, 56, -96, 16, -61, 26, 24, -83, 3, -36, -20, 44, -75, -47, -64, 42, 42, 101, 49, -67, -87, -77, 34, 56, -117, -111, 45, -24, 17, -71, -27, 125, -64, -53, -98, 38, -65, -15, 27, 115, 14, -63, -30, 119, -126, 63, 44, -43, -101, -102, 62, 96, 107, -7, 110, -61, 86, -74, 109, -10, 16, -64, -71, -42, 38, 86, -32, -77, 69, -8, -49, -123, 90, -128, 37, 81, 28, 113, -4, 84, 117, 74, 88, -39, 50, 123, 30, -77, -61, -113, 123, -120, -111, 122, 93, 30, 101, -73, 53, -11, -79, -111, -50, -24, -84, 57, -19, 35, 90, -69, 65, -37, 1, 27, 109, 111, 116, 82, 112, 26, -87, 34, 68, 26, 19, -14, 76, -15, 39, 62, 114, -85};
        Assertions.assertArrayEquals(expected,Encoder.decode(input, Base8Encorder.getInstance()));
    }

    @Test
    void testOctalEncode1() {
        byte[] input = {103, 77, 97};
        String expected = "31646541";
        Assertions.assertEquals(expected,Encoder.encode(input, Base8Encorder.getInstance()));
    }

    @Test
    void testOctalEncode2() {
        byte[] input = {19, -103, 51, -60, -55, 46, -99, -62, 46, 56, -96, 16, -61, 26, 24, -83, 3, -36, -20, 44, -75, -47, -64, 42, 42, 101, 49, -67, -87, -77, 34, 56, -117, -111, 45, -24, 17, -71, -27, 125, -64, -53, -98, 38, -65, -15, 27, 115, 14, -63, -30, 119, -126, 63, 44, -43, -101, -102, 62, 96, 107, -7, 110, -61, 86, -74, 109, -10, 16, -64, -71, -42, 38, 86, -32, -77, 69, -8, -49, -123, 90, -128, 37, 81, 28, 113, -4, 84, 117, 74, 88, -39, 50, 123, 30, -77, -61, -113, 123, -120, -111, 122, 93, 30, 101, -73, 53, -11, -79, -111, -50, -24, -84, 57, -19, 35, 90, -69, 65, -37, 1, 27, 109, 111, 116, 82, 112, 26, -87, 34, 68, 26, 19, -14, 76, -15, 39, 62, 114, -85};
        String expected = "116311474231113516702134342400414143206126403671660545535070012425145143"
                + "3665154621070427104557201067171276700627170465777043334607301704736021762"
                + "6325467150763006577133541526554667660414027165423126701315057614760526500"
                + "0452421616177052165224543311447543654741617367042213645643631333465753306"
                + "2163564254163664432653550166600433332675642447003252221104064117622317044"
                + "717471253";
         Assertions.assertEquals(expected,Encoder.encode(input, Base8Encorder.getInstance()));
    }

    @Test
    void testHexDecode1() {
        String input = "31646541ABC";
        byte[] expected = {3, 22, 70, 84, 26, -68};
        Assertions.assertArrayEquals(expected,Encoder.decode(input, Base16Encorder.getInstance()));
    }

    @Test
    void testHexEncode1() {
        byte[] input = {3, 22, 70, 84, 26, -68};
        String expected = "31646541ABC";
        Assertions.assertEquals(expected,Encoder.encode(input, Base16Encorder.getInstance()));
    }
}
