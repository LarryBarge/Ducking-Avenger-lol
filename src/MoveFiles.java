/*
import java.io.File;
import java.util.regex.Pattern;

*/
/**
 * Created with IntelliJ IDEA.
 * User: $larry
 * Date: 10/13/13
 * Time: 12:55 AM
 *//*

public class CreateDirs {
    //regex expression to look at files with anything between [] \b[\w*] looking
    // for anything with "[]" at the beginning of the string.


    File OrganizedFilesDir = new File("OrganizedFiles"); //Create the File Object for reference to existing dir.



    // specify what current dir is for the user.
    System.out.println("The current working directory is: " + System.getProperty("user.dir"));
    //read current directory and print to console

    if (!OrganizedFilesDir.exists()){
        //Create File for Organized/moved content
        OrganizedFilesDir.mkdirs();
        System.out.println("The OrganizedFiles Dir was created.");

    }
    else {
        if (OrganizedFilesDir.exists()) {

            //MovingFiles();
            System.out.println("The Organized Files are in the process of being moved.");
            MovingFiles(files, regexPattern);

            for (String value : fileNames)
                System.out.println("FileName is : " + value);

            for (File value : files)
                System.out.println("Files include : " + value);

        } else
            System.out.println("TEH SYSTEM IS DOWN!");
    }


//moved files to OrganizedFiles under the appropriate folder
//Method to move files to OrganizedFolder
private static void MovingFiles(File[] dir, String regexPattern) {

        */
/*creating file objects from current dir to hold dir names*//*

    File tmpDir = new File(".");
    String[] fileNames = tmpDir.list(); //get the list of current dir files as strings
    File[] files = tmpDir.listFiles(); //get the list of current dir files as files

    File newFileName = new File("/OrganizedFiles/newFileName_dir"); //test directory to move files into
    System.out.println("The value of regexPattern = " + regexPattern );

    for(File value : dir){

        System.out.println("value.list = " + value.toString());

    }



}

}
*/
