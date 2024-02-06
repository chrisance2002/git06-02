import java.util.Scanner;
public class reverse {

    public static void  main(String[] args){
        Scanner r= new Scanner(System.in);
        System.out.println("Enter the name of a string:");
        String rev=r.nextLine();
        
        String reverse="";
        for(int i=0;i<rev.length();i++){
            reverse=rev.charAt(i)+reverse;
        }
        System.out.println("Reversed string is:"+reverse);

    }


        
    }
    
