package examenfinal;
import java.util.*;
public class EXAMENFINAL {
    public static ArrayList <String> nombre = new ArrayList(); 
    public static ArrayList <Float> velocidad = new ArrayList();
    public static ArrayList <Float> tiempo = new ArrayList();
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int t=1, x=0, posf = 0;
        float promedioaux=0, fast = 0, promediot=0, essp=0;
        while(t!=0)
        {
            System.out.println("ingrese el nombre del estudiante "+(x+1));
            nombre.add(leer.next());
            System.out.println("ingrese la velocidad del estudiante "+(x+1));
            velocidad.add(leer.nextFloat());
            tiempo.add(100/velocidad.get(x));
            promedioaux = promedioaux + tiempo.get(x);
            if(velocidad.get(x) > fast)
            {
                fast = velocidad.get(x);
                posf = x;
            }
            System.out.println("ingrese 0 para salir o 1 para continuar");
            t = leer.nextInt();
            x=x+1;
        }
        promediot = promedioaux/tiempo.size();
        System.out.println("Lista de estudiantes");
        System.out.println("Nombre___Velocidad_____tiempo");
        for(int i=0; i<nombre.size(); i++)
        {
            System.out.println(nombre.get(i)+"_______"+velocidad.get(i)+"________"+tiempo.get(i));
            if(tiempo.get(i) > promediot)
            {
                essp++;
            }
        }        
        System.out.println("el estudiante mas veloz fue "+nombre.get(posf));
        System.out.println("el promedio de tiempo fue "+promediot);
        System.out.println("la cantidad estudiantes sobre del promedio son "+essp);
    }
    
}
