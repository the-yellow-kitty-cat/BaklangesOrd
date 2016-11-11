package itello;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cof on 2016-11-11.
 */
public class MainTest {
    @Test
    public void sentence() {
        String o = "This is a sentence!";
        String sentenceEncryption = Main.getSentenceEncryption(o);
        assertEquals("Siht si a ecnetnes!", sentenceEncryption);
    }

    @Test
    public void trakigt() {
        String o = "Jag har lite tråkigt.";
        String sentenceEncryption = Main.getSentenceEncryption(o);
        assertEquals("Gaj rah etil tgikårt.", sentenceEncryption);
    }
    @Test
    public void cOfver() {
        String o = "C Öfver SENIOR PRAKTIKANT itello";
        String sentenceEncryption = Main.getSentenceEncryption(o);
        assertEquals("C Revfö ROINES TNAKITKARP olleti", sentenceEncryption);
    }
    @Test
    public void rebecka() {
        String o = "Rebecka Öfver är duktig!";
        String sentenceEncryption = Main.getSentenceEncryption(o);
        assertEquals("Akceber Revfö rä gitkud!", sentenceEncryption);
    }
    @Test
    public void dattamtu() {
        String o = "Jag har praktiserat på itello i 5 dagar och är nu helt utmattad.";
        String sentenceEncryption = Main.getSentenceEncryption(o);
        assertEquals("Gaj rah taresitkarp åp olleti i 5 ragad hco rä un tleh dattamtu.", sentenceEncryption);
    }
    @Test
    public void c() {
        String o = "C!";
        String sentenceEncryption = Main.getSentenceEncryption(o);
        assertEquals("C!", sentenceEncryption);
    }

}