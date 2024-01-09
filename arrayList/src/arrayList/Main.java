package arrayList;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<String> Nomi=new ArrayList<String>();
		
		System.out.println(Nomi);
		
		Nomi.add("Idk");
		Nomi.add("Subaru");
		Nomi.add("Aizen");
		
		System.out.println(Nomi);
		System.out.println("Dimensione dell'ArrayList: "+Nomi.size());
		
		Nomi.remove(1);
		System.out.println("Dimensione dell'ArrayList: "+Nomi.size());
		System.out.println(Nomi);
		
		System.out.println("Elemento all'indice 1: "+Nomi.get(1));
		
		System.out.println("L'ArrayList contiene 'Subaru'?: "+Nomi.contains("Subaru"));
	}

}
