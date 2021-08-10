import student.TestCase;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Class to test with different test cases.
 * 
 * @author Jaineel Nandu
 * @version 20201012
 */
public class RectangleDBTest extends TestCase {
    /**
     * Encodes the file into string
     * 
     * @param path
     *            path of the file
     * @return
     *         string
     * @throws IOException
     */
    static String readFile(String path) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded);
    }


    /**
     * Sets up the tests that follow. In general, used for initialization
     */
    public void setUp() {
        // Nothing Here
    }


    /**
     * Get code coverage of the class declaration.
     */

    public void testRInit() {
        RectangleDB manager = new RectangleDB();
        assertNotNull(manager);
        // RectangleDB.main(null);
    }


    /**
     * Tests if system properly checks for appropriate command line
     * argument
     * 
     * @throws Exception
     */
    public void testNoFile() throws Exception {
        String[] args = new String[2];
        args[0] = "abc";
        args[1] = "bcd";
        RectangleDB.main(args);
        assertFuzzyEquals("Usage: java RectangleDB" + "<command-file>",
            systemOut().getHistory());
    }


    /**
     * Tests SimpleInsertionTest file.
     * 
     * @throws Exception
     */
    public void testInsertionAndDump() throws Exception {
        String[] args = new String[1];
        args[0] = "SimpleInsertionTest.txt";
        RectangleDB.main(args);
        assertFuzzyEquals(readFile("SimpleInsertion_Output.txt"), systemOut()
            .getHistory());
        System.out.flush();
    }


    /**
     * Tests the RectRejectTest file
     * 
     * @throws Exception
     */
    public void testInsertionReject() throws Exception {
        // RectangleDB manager = new RectangleDB();
        String[] args = new String[1];
        args[0] = "RectRejectTest.txt";
        RectangleDB.main(args);
        assertFuzzyEquals(readFile("RectReject_Out.txt"), systemOut()
            .getHistory());
        System.out.flush();
    }


    /**
     * Tests the InsertionRemainingTests file.
     * 
     * @throws Exception
     */
    public void testInsertionRemaining() throws Exception {
        // RectangleDB manager = new RectangleDB();
        String[] args = new String[1];
        args[0] = "InsertRemainingTests.txt";
        RectangleDB.main(args);
        assertFuzzyEquals(readFile("InsertRemaining_Out.txt"), systemOut()
            .getHistory());
        System.out.flush();
    }


    /**
     * Tests the MonthsTestFile
     * 
     * @throws Exception
     */
    public void testInsertionMonthTest() throws Exception {
        // RectangleDB manager = new RectangleDB();
        String[] args = new String[1];
        args[0] = "MonthTest.txt";
        RectangleDB.main(args);
        assertFuzzyEquals(readFile("MonthTest_Out.txt"), systemOut()
            .getHistory());
        System.out.flush();
    }


    /**
     * Tests the RSTest file
     * 
     * @throws Exception
     */
    public void testRegionSearchTest() throws Exception {
        // RectangleDB manager = new RectangleDB();
        String[] args = new String[1];
        args[0] = "RSTest.txt";
        RectangleDB.main(args);
        assertFuzzyEquals(readFile("RS_Out.txt"), systemOut().getHistory());
        System.out.flush();
    }


    /**
     * Tests the MRemovalTest file
     * 
     * @throws Exception
     */
    public void testMRemoval() throws Exception {
        // RectangleDB manager = new RectangleDB();
        String[] args = new String[1];
        args[0] = "MRemovalTest.txt";
        RectangleDB.main(args);
        assertFuzzyEquals(readFile("MRemoval_Out.txt"), systemOut()
            .getHistory());
        System.out.flush();
    }

}
