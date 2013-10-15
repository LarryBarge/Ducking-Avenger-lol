import java.io.File;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: Larry
 * Date: 10/14/13
 * Time: 11:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateFilesDirs {

    public void CreateDirs(){
        File currentSearchDir = new File("."); //current Search Dir as implied by name
        File[] currentSearchDirArray = currentSearchDir.listFiles(); //array of all files in dir.

        //String[] currentSearchDirString = currentSearchDir.list();

        Pattern pattern = Pattern.compile("\\[(\\w*)\\].*"); //damn reg expression isn't correct:(

        for (File fileValue : currentSearchDirArray) {
            Matcher m = pattern.matcher(fileValue.toString());
            Path source = fileValue.toPath();
            String fileType = fileValue.isFile() ? "File" : "Directory";

            //if the current directory is file or directory
            if (fileType == "File"){
                System.out.println("It was a file!" + fileValue);
                if(m.find()){    //if the pattern is found in the filename
                    File FoundFileName = new File(m.group(1));    //Naming the dir with the Name caught between brackets.
                    //FoundFileName.mkdir();  //creating the dir
                    //System.out.println("SUCCESS!!!" + fileValue );
                    //System.out.println(FoundFileName.toString());
                    if (FoundFileName.exists()){
                        //move the folder to the CapturedBrackets / Group 1_dir
                        File FileNameMoved = new File(FoundFileName + "/"+ m.group(1) +"_dir");
                        //fileValue.renameTo(FileNameMoved);
                        System.out.println("Path for source: " + source.toString());
                        //Move files to created Destination dir.
                        //Files.move();
                        System.out.println(fileValue + " has been moved to " + FileNameMoved);
                    }
                    else  {
                        FoundFileName.mkdir(); //make the dir with the first string value in the array
                        if (FoundFileName.exists()){   //move the folder to the subdir.
                            //move the folder to the CapturedBrackets / Group 1_dir
                            File FileNameMoved = new File(FoundFileName + "/"+ m.group(1) +"_dir");
                            //fileValue.renameTo(FileNameMoved);
                            System.out.println(fileValue + " has been moved to " + FoundFileName);
                        }
                    }
                }

            }
            else if (fileType == "Directory") {
                System.out.println("Parsing Directory Nothing to do.");
                //System.out.println("FileValue.ToString = " + fileValue.toString() );
            }

        }

    }
}


