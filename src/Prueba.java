import java.util.*;
import java.io.*;
public class Prueba 
{ 
    public static void main( String[] args )  throws IOException 
    { 

        Scanner sc = new Scanner( System.in ); 

        int contador=0;
        String file;
        char terminar='n';

        while (terminar!='s')
        {
        	
            System.out.print("elije un archivo de texto:");
            file = sc.next();
            //file = "prueba.txt";
    
            System.out.println();
            
            //Creates a FileReader Object
            FileReader fr = new FileReader(file); 
            
            //1
            /*char [] a = new char[50];
            fr.read(a); // reads the content to the array
            for(char c : a)
            System.out.print(c); //prints the characters one by one*/
            //1
            
            //2
            BufferedReader br = new BufferedReader(fr); 
            String s; 
            while((s = br.readLine()) != null) 
            { 
                System.out.println(s);
            }
            //2
            
            fr.close();
    
            System.out.println();
    
            System.out.print("para salir escriba s");
            System.out.println();
            
            terminar = (char)System.in.read();

        }
    	System.out.println("Enorabuena!!"); 
    }
}