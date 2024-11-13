package chai;

public class PuneriChai{
 public static void main(String[] args)
 {
	makeChai();
	makeChai(5);
}
 static void makeChai()
{
	System.out.println("The masala chai=10");
}
static void makeChai(int quatity)
{
System.out.println("The masala chaifor=" +quatity+ " cost="+(quatity*10));
}
}
