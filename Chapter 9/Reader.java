import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Reader {
    public static void main(String[] args) throws FileNotFoundException {
        final int size=100;
        double myList[][] = new double[size][size];
        StringTokenizer token;

        File f=new File("Users/CAMT/Downloads/t2.csv");

        Scanner myScan=new Scanner(f);

        while(myScan.hasNext()){
            String dataLine=myScan.nextLine();

            token=new StringTokenizer(dataLine,",");

            double a=Double.parseDouble(token.nextToken());
            double b=Double.parseDouble(token.nextToken());

            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    myList[i][j]=a;
                }
            }
        }

        System.out.println("end of program");
        myScan.close();
    }
}
