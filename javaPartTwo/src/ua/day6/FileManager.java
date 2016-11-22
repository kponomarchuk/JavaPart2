package ua.day6;
// 1) написать класс FileManager и тесты на него, со следующими методами:
//- public static int calculateFiles(String path) - принимает путь к папке, возвращает количество файлов в папке и всех подпапках по пути

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilePermission;
import java.io.IOException;

/**
 * Created by Ksu on 22.11.2016.
 */


public class FileManager {
    public static void main(String[] args) throws IOException {

        String fileOrDir1 = "D:\\JavaPractice\\Projects\\javaPartTwo\\src\\ua\\day6\\";
        String fileOrDir2 = "C:\\Windows";//present not accessible files
        String fileOrDir3 = "D:\\JavaPractice\\Projects\\javaPartTwo\\src\\ua\\day6\\testFile\\emptyFolder";//empty folder

        int numOfFiles = calculateFilesOld(fileOrDir1);
        System.out.println("Number of files in dir(file)-easy case -" + fileOrDir1 + " = " + numOfFiles);
        int numOfFiles2 = calculateFilesOld(fileOrDir2);
        System.out.println("Number of files in dir(file)-with notaccessible files -" + fileOrDir2 + " = " + numOfFiles2);
        int numOfFiles3 = calculateFilesOld(fileOrDir3);
        System.out.println("Number of files in dir(file)-with empty folder -" + fileOrDir3 + " = " + numOfFiles3);
       // int numOfDirs = calculateDirs(fileOrDir1);
        //System.out.println("Number of dirs in dir(file) -" + fileOrDir1 + " = " + numOfDirs);
    }

    public static int calculateFilesOld(String path) throws IOException {
        int fileCount = 0;
        try {
            File file = new File(path);


            if (file.isDirectory()) {


                for (File list : file.listFiles()) {
                    if (list.isFile()) {
                        fileCount++;

                    } else {

                        fileCount = fileCount + calculateFilesOld(list.getCanonicalPath());
                    }
                }

            } else {

                fileCount++;
            }
            return fileCount;
        } catch (FileNotFoundException e) {
            return 0;
        } catch (Exception e) {

            return 1;

        }
    }

    public static int calculateFiles(String path) throws IOException {
        int countFiles = calculateItems(path,"File");
        return countFiles;
    }


    public static int calculateDirs(String path) throws IOException {
        int countFiles = calculateItems(path,"Dir");
        return countFiles;
    }



    public static int calculateItems(String path, String fileOrDir) throws IOException {
        int itemCount = 0;
        try {
            File file = new File(path);


            if (file.isDirectory()) {


                for (File list : file.listFiles()) {
                    if (list.isFile()) {
                        itemCount++;

                    } else {

                        itemCount = itemCount + calculateItems(list.getCanonicalPath(),fileOrDir);
                    }
                }

            } else {

                itemCount++;
            }
            return itemCount;
        } catch (FileNotFoundException e) {
            return 0;
        } catch (Exception e) {

            return 1;

        }



    }


}






