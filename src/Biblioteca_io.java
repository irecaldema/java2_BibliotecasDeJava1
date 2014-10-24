import java.util.*;
import java.io.*;
public class Biblioteca_io { 
    public static void main( String[] args )  throws IOException { 

        Scanner sc = new Scanner( System.in ); 
        //FileReader reader = new FileReader();

        int contador=0;
        //File archivo;
        String file;
        char terminar='n';

        while (terminar!='s')
        {
        	
        System.out.print("elije un archivo de texto:");
        //System.out.println(ls *.txt);
        //ls *.txt;
        file = sc.next();
        //file = "prueba.txt";

        System.out.println();
        
        //Creates a FileReader Object
        FileReader fr = new FileReader(file); 
        char [] a = new char[50];
        fr.read(a); // reads the content to the array
        for(char c : a)
        System.out.print(c); //prints the characters one by one
        fr.close();

        System.out.println();

        System.out.print("para salir escriba s");
        System.out.println();
        
        terminar = (char)System.in.read();

        }
    	System.out.println("Enorabuena!!"); 
    }
}