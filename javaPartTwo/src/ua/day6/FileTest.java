package ua.day6;

import java.io.File;
import java.io.IOException;

/**
 * Created by Ksu on 22.11.2016.
 */
public class FileTest {


    public static void main(String[] args) throws IOException {


        int countFiles ;
//        File dirPath = new File("./newDir");
//        dirPath.mkdir();
//
//        System.out.println(file.exists());
//        file.createNewFile();
        File file = new File("D:\\JavaPractice\\Projects\\javaPartTwo\\src\\ua\\day6\\testFile");
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.listFiles());


        File file1 = new File("D:\\JavaPractice\\Projects\\javaPartTwo\\src\\ua\\day6\\");
        System.out.println(file1.length());




        //Test method
        countFiles =0;
        FileTest fileTest =new FileTest();
        String fileDir="D:\\JavaPractice\\Projects\\javaPartTwo\\src\\ua\\day6\\";
        for(File fileList: new File(fileDir).listFiles()) {
           // if ( fileList.isDirectory()) {
                countFiles = fileTest.getNumOfFilesInDir(countFiles,fileList );
                System.out.println(countFiles);
           // }
        }
    }


public int getNumOfFilesInDir(int curCount,File fileOrDir) throws IOException {

    for (File s : fileOrDir.listFiles()) {

        System.out.println(s.getCanonicalPath());
        curCount++;
       // System.out.println(curCount);

    }
    return curCount;
    }

    //from Inet

    public void searchFile(File dir) throws IOException {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory())
                    searchFile(file);
            }
            for (File file : files) {
                int n = 0;
                if (file.isFile()) {   //проверяем, файл ли это
                    n++;
                    System.out.println("Файл номер " + n + " найден в " + file.getAbsolutePath());

                }
            }
        }
    }


}



