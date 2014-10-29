import java.util.*;
import java.io.*;
public class Multitarea 
{ 
    public static void main( String[] args )  throws IOException 
    { 

        Scanner sc = new Scanner( System.in ); 

        int contador=0;
        String file;
        char opcion='n';
		
		
		System.out.print("crear archivo (c), leer archivo (l), salir (s)");
        System.out.println();
            
        opcion = (char)System.in.read();
		
		
        while (opcion!='s')
        {
        if (opcion=='l')
				{
            System.out.print("elije un archivo de texto:");
            file = sc.next();
            //file = "prueba.txt";
    
            System.out.println();
            
			// FileReader
            //Creates a FileReader Object
            FileReader fr = new FileReader(file); 
            
            //1
            /*char [] a = new char[50];
            fr.read(a); // reads the content to the array
            for(char c : a)
            System.out.print(c); //prints the characters one by one*/
            //1
            
            //2  BufferedReader
            /*BufferedReader br = new BufferedReader(fr); 
            String s; 
            while((s = br.readLine()) != null) 
            { 
                System.out.println(s);
            }*/
            //2                     
            //3
            char [] a = new char[50];
            fr.read(a);
            System.out.println(a);
            //3
            fr.close();
    
            System.out.println();
				}
			else if (opcion!='c')
				{
					
				}
			else
				{
				System.out.println("tiempo para pensar");
				//timer  http://docs.oracle.com/javase/7/docs/api/javax/swing/Timer.html
				Timer timer;
				timer = new Timer();

				TimerTask task = new TimerTask() {
					int tic=0;

					@Override
					public void run()
					{
						if (tic%2==0)
							System.out.println("TIC");
						else
							System.out.println("TOC");
						tic++;
					}
				};
				// Empezamos dentro de 10ms y luego lanzamos la tarea cada 1000ms
				timer.schedule(task, 10, 1000);
				}
					
            System.out.print("crear archivo (c), leer archivo (l), salir (s)");
            System.out.println();
            
            opcion = (char)System.in.read();

        } 
		//date
		Date gaur = new Date();
		System.out.println("Enorabuena!!");
		System.out.println(gaur);
		//random
		Random r = new Random(24);
		System.out.println("Tu hora de la suerte es: " + r);
		
    }
}
