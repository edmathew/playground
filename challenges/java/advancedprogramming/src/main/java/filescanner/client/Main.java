package filescanner.client;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*D:\projects\playground\challenges\java\advancedprograming\testfolder */
        FileScanner scanner = new FileScanner("D:\\wrk_unloads");
        Collection<String> list = scanner.scan();

        for (String s : list) {
           // System.out.println(s);
        }

        System.out.println("Hello");
        //    Collection<String> paths = scanner.scan(new ExtensionFilter("info"));

        /* Just to give the current exec location */
//       URL location = Main.class.getProtectionDomain().getCodeSource().getLocation();
        //      System.out.println(location.getFile());
        /*for (String p : paths) {
         System.out.println(p);
         }*/
    }

}
