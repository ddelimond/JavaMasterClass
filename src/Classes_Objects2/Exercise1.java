package Classes_Objects2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise1 {

    public static String data = """
            id,first_name,last_name,email,gender
            1,Fanchette,Williamson,fwilliamson0@github.com,F
            2,Aleksandr,Matts,amatts1@webs.com,M
            3,Maurie,Cordero,mcordero2@google.co.jp,M
            4,Donnajean,Crowson,dcrowson3@google.com.hk,F
            5,Ricardo,Gofton,rgofton4@nytimes.com,M
            6,Gabie,Tregenna,gtregenna5@guardian.co.uk,F
            7,Marjorie,Blumsom,mblumsom6@joomla.org,F
            8,Lester,Huyghe,lhuyghe7@jugem.jp,M
            9,Merrily,Stangoe,mstangoe8@tiny.cc,F
            10,Reider,Karel,rkarel9@github.io,M
            11,Dory,Jolliff,djolliffa@wufoo.com,F
            12,Homerus,Averay,haverayb@skyrock.com,M
            13,Alyda,Muglestone,amuglestonec@is.gd,F
            14,Pinchas,Louca,ploucad@google.es,M
            15,Cherin,Eltringham,celtringhame@parallels.com,F
            16,Mufi,Rothert,mrothertf@dropbox.com,F
            17,Jordana,Everex,jeverexg@ucla.edu,F
            18,Belle,Rother,brotherh@auda.org.au,F
            19,Clevie,Sifflett,csiffletti@furl.net,M
            20,Gretchen,Abell,gabellj@1688.com,F """;


    public  static void main(String args []) throws IOException {

        File file = new File("src/Classes_Objects2/data.csv");
        Scanner scanner = new Scanner(file);
        int index =0;
        String[] people = new String[21];

        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(writer);
        printWriter.println(data);
        printWriter.flush();
        printWriter.close();

        if(scanner.hasNextLine()){
            scanner.nextLine();
        }
        while(scanner.hasNextLine()){

            people[index] = scanner.nextLine() + "\n";
            index++;
        }

        System.out.println(Arrays.toString(people));

    }

}
