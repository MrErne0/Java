package ejemploBoolean;

public class ejemplo2 {
	public static void main(String[] args)
    {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;
 
String s1 = new String("GEEKS");
String s2 = new String("GEEKS");
 
System.out.println(t1 == t2); //(==)iguala la ubicaci�n en la memora
System.out.println(t1 == t3);
System.out.println(s1 == s2);
 
        System.out.println(t1.equals(t2));//.equal iguala el contenido 
        System.out.println(s1.equals(s2));
    }


}
