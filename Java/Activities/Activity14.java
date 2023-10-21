package Activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("src/File/newFile");
            boolean fileStatus = file.createNewFile();
            if (fileStatus) {
                System.out.println("File created sucessfully");
            } else {
                System.out.println("File already exist");
            }
            //to get the fileobject
            File fileUtil = FileUtils.getFile("src/File/newFile");
            System.out.println("Data in file is:" + FileUtils.readFileToString(fileUtil, "UTF8"));
            //Create new directory
            File newDir = new File("src/main/resources");
            FileUtils.copyFileToDirectory(file,newDir);
            //read the data from new file
            File newfile = FileUtils.getFile(newDir, "newFile");
            System.out.println();
            System.out.println("Data in newfile(under resources folder) is: " + FileUtils.readFileToString(newfile, "UTF8"));

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
