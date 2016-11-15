
/**
 * Write a description of class ListRunner here.
 * 
 * @Laurel Woods 
 * @10/28
 */
import java.util.Scanner;
public class ListRunner
{
    public static void main(String[] args){
        StudentList studList = new StudentList();
        Scanner scr = new Scanner(System.in);
        ListRunner obj = new ListRunner();
        int ans = 0;
        String ansStr = "";
        while(ans == 0 || !ansStr.equals("quit")){
            obj.menu();
            ans = scr.nextInt();
            if(ans == 4){
                
                ansStr = "quit";
            }else{
                if(ans == 1){
                    studList.addStu();
                }else if(ans == 2){
                    studList.printList();
                }else if(ans == 3){
                    studList.deleteStudent();
                }else if (ans == 4){
                    ansStr = "quit";
                }
                System.out.println("\n" + "Press 1 to complete another action or press 4 to quit");
                ans = scr.nextInt();
                if (ans == 4)
                    ansStr = "quit";
                else{
                    ans = 0;
                    System.out.println("******************");
                }
            }
        }

    }

    public void menu(){

        System.out.println("Type a number to choose from the options below:"); 
        System.out.println("1. Add Student to List");
        System.out.println("2. Print Student List");
        System.out.println("3. Delete Sudent from List");
        System.out.println("4. Quit Program");

    }

}

