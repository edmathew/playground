package filescanner.client;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class TestFileScanner {

    //TODO: Refractor to use Gradle test resources
    private static final String TEST_DIR = "testfolder\\";

    private static final String[] SUB_SET_ALL = {
        "A.txt",
        "C.info",
        path("subfolder1", "B.txt"),
        path("subfolder1", "D.txt"),
        path("subfolder1", "subsubfolder", "E.info"),
        path("subfolder2", "F.info")
    };

    private static String path(String... parts) {
        String path = "";
        for (String p : parts) {
            if (!path.isEmpty()) {
                path += File.separator;
            }

            path += p;
        }
        return path;
    }

    private static final String[] INFO = {
        SUB_SET_ALL[1], SUB_SET_ALL[4], SUB_SET_ALL[5]
    };

    private static final String[] A_OR_INFO = {
        SUB_SET_ALL[0], SUB_SET_ALL[1], SUB_SET_ALL[4], SUB_SET_ALL[5]
    };

    private String rootPath;
    private FileScanner filter;

    @Before
    public void setup() {
        rootPath = new File(TEST_DIR + "all").getAbsolutePath();
        filter = new FileScanner(rootPath);
    }

    /**
     * if FileScanner is constructed with a path that is not a directory, an
     * exception should be thrown
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor() {
        new FileScanner("other");
    }

    @Test
    public void testScanAll() {
        assertThat(filter.scan(), is(Arrays.asList(SUB_SET_ALL)));
    }

    @Test
    public void testNameFilter() {

    }

    @Test
    public void testExtensionFilter() {

    }

    @Test
    public void scanAnEmptyFolderShouldReturnAnEmptyList() {
        assertEquals(new ArrayList<>(), new FileScanner(TEST_DIR + "emptyFolder").scan());
    }

    @Test
    public void scanAFolderWithOneFileShouldReturnAListWithOneElement() {
        assertEquals(1, new FileScanner(TEST_DIR + "oneElement").scan().size());
    }

    @Test
    public void scanSubSetAllShouldReturnAListWithSixElements() {
        assertEquals(6, new FileScanner(TEST_DIR + "all").scan().size());
    }
}
