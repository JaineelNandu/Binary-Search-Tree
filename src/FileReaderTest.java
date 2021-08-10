import student.TestCase;

/**
 * Class for tests of FileReader
 * 
 * @author Jaineel Nandu
 * @version 20201011
 *
 */
public class FileReaderTest extends TestCase {
    private FileReader fread = new FileReader();

    /**
     * Tests if there is no such file.
     */
    public void testFakeFile() {
        assertFalse(fread.beginParsing("FakeFileName"));
        System.out.flush();
    }


    /**
     * Tests if there is no such file.
     */
    public void testNoFile() {
        assertFalse(fread.beginParsing("FakeFileName"));
        System.out.flush();
    }


    /**
     * Tests if the switch case is working properly.
     */
    public void testSwitchCases() {
        assertTrue(fread.beginParsing("TestingSwitchFR.txt"));
    }


    /**
     * Tests if the line is empty and the parser
     * must move to next one
     */
    public void testEmptyFile() {
        assertTrue(fread.beginParsing("OnlyNewLine.txt"));
    }
}
