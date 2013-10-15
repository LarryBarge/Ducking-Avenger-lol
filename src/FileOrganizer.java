/**
 * Created with IntelliJ IDEA.
 * User: larry
 * Date: 10/11/13
 * Time: 11:54 PM
 * This program is so beta it hurts. Will be broken into separate classes/methods later.
 */
public class FileOrganizer {

    public static void main(String[] args){

        CreateFilesDirs directory = new CreateFilesDirs();

        directory.CreateDirs(); //Parses through current Dir to find [NAME] and then create a file based off of the file name.

    }

}
