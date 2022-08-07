package day3_app;

import java.util.*;
public class day3 {
public String [][] str=new String [5][6];
public Scanner scanner=new Scanner(System.in);

public String takeinput(String input){

    System.out.printf("Enter %s:",input);
    return scanner.next();

}
public int total(String math,String science,String english){
    return Integer.parseInt(math)+Integer.parseInt(science)+Integer.parseInt(english);

}
public void display(){
    for (String[] row: str){
        for(String col :row){
            System.out.printf("%s\t",col);
        }
        System.out.println("\n");
    }
}
    public  void run(){
        for (int i=0;i<str.length;i++) {
            str[i][0] = takeinput("name");
            str[i][1] = takeinput("marks in math");
            str[i][2] = takeinput("marks in science");
            str[i][3] = takeinput("marks in english");
            int result = total(str[i][1], str[i][2], str[i][3]);
            int percentage = result * 100 / 150;
            str[i][4]=String.valueOf(result);
            str[i][5]=String.valueOf(percentage);
        }
display();
    }
}
