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
            System.out.println("elije un archivo de texto: ejemplo.txt");
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
            BufferedReader br = new BufferedReader(fr); 
            String s; 
            while((s = br.readLine()) != null) 
            { 
                System.out.println(s);
            }
            //2                     
            //3
		/*	
            char [] a = new char[50];
            fr.read(a);
            System.out.println(a);
		*/
            //3
            fr.close();
    
            System.out.println();
				}
			else if (opcion=='c')
				{
					//printwriter
				        PrintWriter escritor = null;
					try 
					{						
						String nombrazo, cadena;
						System.out.println("Introduce nombre archivo de texto");
						nombrazo = sc.next();
						nombrazo=nombrazo+".txt";
						//escritor = new PrintWriter("ejemplo.txt");
						escritor = new PrintWriter(nombrazo);
						System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
						cadena = sc.nextLine();
						while (!cadena.equalsIgnoreCase("FIN")) 
						{
							escritor.println(cadena);
							cadena = sc.nextLine();
						}
						escritor.flush();
					} 
					catch (FileNotFoundException e) 
					{
						System.out.println(e.getMessage());
					} 
					finally 
					{
						escritor.close();
					}	
				}
			else
				{
				System.out.println("tiempo para pensar");
				//timer  http://docs.oracle.com/javase/7/docs/api/javax/swing/Timer.html
				
				Timer timer;
				timer = new Timer();
				TimerTask task = new TimerTask() {
					@Override
					public void run()
					{
						Random x = new Random();
						int tempo=x.nextInt(110);
						if (tempo>=100) 
						{
							timer.cancel();
							timer.purge();
							System.out.println("control + c");
							return;
						}
						int x1 =x.nextInt(2);
						if (x1%2==0)
							System.out.println("TIC");
						else
							System.out.println("TOC");
					}
				};
				// Empezamos dentro de 10ms y luego lanzamos la tarea cada 1000ms
				timer.schedule(task, 10, 1000);	
				}
					
            System.out.println("crear archivo (c), leer archivo (l), salir (s)");
            opcion = (char)System.in.read();

        } 
		System.out.println();
		System.out.println("Enorabuena!!");
		//random
		Random r = new Random();
		int suerte=0;
		suerte=r.nextInt(10);
		//arrays
		int[] numeros = {1, 3, 5, 7, 9, 0, 2, 4, 6, 8};
		//System.out.println(suerte); //si es 0 saldra 1 etc. 
		int suerte2=numeros[suerte];
		System.out.println("Tu numero de la suerte ahora cambio a: " + suerte2);
		//date
		Date gaur = new Date();
		System.out.println();
		System.out.println("fecha:  "+gaur);
		
    }
}
