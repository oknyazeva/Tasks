import org.testng.annotations.*;

import static org.testng.Assert.*;

/**
 * Created by nikikuzi on 3/7/17.
 */
public class FileTest {

    File file;
    String fileName;
    String content;

    @DataProvider(name = "files")
    public Object[][] getFiles() {
        return new Object[][] {
                {new File("test.exe", "123456789"), "exe"},
                {new File("test.exe", "12345678"), "exe"},
                {new File("test.exe", "12345   6789"), "rrr"},
        };
    }

    @Parameters({"fileName", "content"})
    @BeforeTest
    public void setUp(String fileName, String content) {
        file = new File(fileName, content);
        this.fileName = fileName;
        this.content = content;
    }

    @Test(dataProvider = "files", enabled = true)
    public void getAxtensionTest(File file, String rez) {
        assertEquals(file.getExtension(), rez);
    }

    @Test
    public void getSizeTest() {
        assertEquals(file.getSize(), content.length());
    }

    @Test
    public void getContentTest() {
        assertEquals(file.getContent(), content);
    }

    @Test
    public void getFilename() {
        assertEquals(file.getFilename(), fileName);
    }
}
