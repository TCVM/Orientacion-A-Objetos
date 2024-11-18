package ObjetosSeptiembre2022;

public class Main {
	public static void main(String[] args) {
		System.out.println("Tell them. TELL THEM THE TRUTH");
		
		SubsidioEstadia se=new SubsidioEstadia("asd","huir","hoy","afuera",2,4,6);
		SubsidioBienes sb=new SubsidioBienes(3,"dsa","seguir huyendo","mañana"); //no me dejo hacer polimorfismo
		Bien a=new Bien("dA",1,1);
		Bien b=new Bien("dB",2,2);
		Bien c=new Bien("dC",3,3);
		sb.agregarBien(a);
		sb.agregarBien(b);
		sb.agregarBien(c);
		
		System.out.println(se.toString());
		System.out.println(sb.toString());
		
	}
}
