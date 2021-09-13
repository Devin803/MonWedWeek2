import java.io.IOException; //Tells the program that you dont want to handle text errors
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExampleWeek3 {
    public static void main(String[] args) throws IOException{
        var filename = "students.txt"; //Create a variable to name your text file
        var studentFile = Paths.get(filename); //Paths.get is used to obtain the text file
        var allStudents = Files.readString(studentFile); //This is used to read a string and open it
        String [] seperatedNames = allStudents.split("\n"); //This is used to seperate the names in order
        //Now we show the user
        System.out.println("Here are the students in your class");
        for(var studentName: seperatedNames){
            System.out.println(studentName);
        }
    }
}
