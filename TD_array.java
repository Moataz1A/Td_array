package td_array;
import java.util.Scanner;
public class TD_array {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String[][] myarray = new String[2][3];
        String nm = String.valueOf(myarray[0][0]);
          myarray[0][0] = "Nma";
          myarray[0][1] = "ID";
          myarray[0][2] = "Name";
        for (int i = 1; i < myarray.length; i++) 
        {
            String s = String.valueOf(i);
             myarray[i][0] = s;
            for (int j = 1; j < myarray.length; j++)
            { 
                System.out.println("Enter the Name :");
                 String name = in.next();
                System.out.println("Enter the ID :");
                 String id = in.next();
                  myarray[i][2] = name;
                  myarray[i][1] = id;
            }
        }
          System.out.println("*******");
          System.out.println(myarray[0][0] + "\t" + myarray[0][1] + "\t" + myarray[0][2]);
          System.out.println(myarray[1][0] + "\t" + myarray[1][1] + "\t" + myarray[1][2]);
    }
}
     /*
        *** output ***
        
 Enter the Name :
  M3taz
 Enter the ID :
  1179
    *******
  Nma      ID      Name
  1      1179      M3taz
        
     */
