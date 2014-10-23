import java.util.*;
import java.io.*;
public class Biblioteca_io { 
    public static void main( String[] args )  throws IOException { 

        Scanner sc = new Scanner( System.in ); 
        //FileReader reader = new FileReader();

        int contador=0;
        //File archivo;
        String archivo;
        char terminar='n';



        while (terminar!='s')
        {
        	
        System.out.print("elije un archivo de texto:");
        //System.out.println(ls *.txt);
        //ls *.txt;
        //archivo = sc.next();
        archivo = "prueba.txt";

        //System.out.print(reader(archivo));
        //File file = new File(archivo);
        //FileReader reader = new FileReader(file);
        //reader.toString();
        //System.out.println(reader);

        FileReader reader = new FileReader("prueba.txt");

        String texto = reader.toString();

        System.out.println(texto);


        System.out.println();

        System.out.print("para salir escriba s");
        System.out.println();
        
        terminar = (char)System.in.read();

        }
        	
    	System.out.println("Enorabuena!!"); 
        

        
    }
}