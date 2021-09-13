import java.util.ArrayList;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args){
        var studentNames = new ArrayList<>();    //angle brackets are used for arrays(<>) we tell java what we want to store
        var reader = new Scanner(System.in);     //Scanner reads stuff from places like "System.in" could also read from a file
        var userResponse = "";
        while (!userResponse.equals("done")){    //"!" represents not
            System.out.print("Type in the next student name to or 'done' to exit");
            userResponse = reader.nextLine();    //reader.next will read things in
            if (userResponse.equals("done")){
                break;
            }
            studentNames.add(userResponse);
        }
        System.out.println("All of your students in the class are below:");
        for (var studentName : studentNames){
            System.out.println(studentName);
        }

    }

}
