import java.util.Scanner;
public class reverse {

    public static void  main(String[] args){
        Scanner r= new Scanner(System.in);
        System.out.println("Enter the name of a string:");
        String reverse=r.nextLine();
        String reversed="";
        for(int i=0;i<reverse.length();i++){
            reversed=reverse.charAt(i)+reversed;
        }
        System.out.println("Reversed string is:"+reversedD);

    }
        
    }
    
