package ua.day7;

import java.io.File;
import java.io.IOException;

/**
 * Created by Ksu on 22.11.2016.
 */
//- public static boolean copy(String from, String to) - метод по копированию папок и файлов.
// Параметр from - путь к файлу или папке, параметр to - путь к папке куда будет производиться копирование.


public class IOTest {
    public static void main(String[] args) throws IOException {
        String fromDir="D:\\JavaPractice\\Projects\\javaPartTwo\\src\\ua\\day7\\fromDir";
        String toDir="D:\\JavaPractice\\Projects\\javaPartTwo\\src\\ua\\day7\\toDir";
        copy(fromDir,toDir);
    }
    public static  void/*boolean*/ copy(String from, String to) throws IOException {
        File fileFrom =new File(from);
        File fileTo = new File(to);

        for(File fileTemp:fileFrom.listFiles()){
            System.out.println(fileTemp.getCanonicalPath());
        }


    }
}
