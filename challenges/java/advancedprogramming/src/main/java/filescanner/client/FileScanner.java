package filescanner.client;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XPTA455
 */
public class FileScanner {

    private final String folder;

    public FileScanner(final String folder) {
        if (!(new File(folder).isDirectory())) {
            throw new IllegalArgumentException(folder + " is not a folder");

        }
        this.folder = folder;
    }

    Collection<String> scan(ExtensionFilter extensionFilter) {
        return null;
    }

    public Collection<String> scan() {
        final File current_location = new File(folder);
        final ArrayList<String> list = new ArrayList<>();

        System.out.println("begin" + current_location.getPath());

        for (File neDir : current_location.listFiles()) {
            System.out.println("dir - " + neDir.getName());
            if (neDir.isDirectory()) {
                list.addAll(new FileScanner(current_location.getPath() + File.separator + neDir.getName()).scan());
            } else {
                list.add(current_location.getPath() + neDir.getName());
            }
        }

        return list;
    }

}
