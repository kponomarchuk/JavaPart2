package ua.day6;

/**
 * Created by Ksu on 21.11.2016.
 */


        import java.io.File;
        import java.io.IOException;


/**
 * Created by Red15 on 21.11.2016.
 */
public class IOSample {
    public static void main(String[] args) throws IOException {
//        File dirPath = new File("./newDir");
//        dirPath.mkdir();
//
//        System.out.println(file.exists());
//        file.createNewFile();
        File file = new File("./newDir/newFile.txt");
        System.out.println(file.getCanonicalPath());


        for (File s : new File("C:/Windows").listFiles()) {
            System.out.println(s.getCanonicalPath());
        }
    }
}





