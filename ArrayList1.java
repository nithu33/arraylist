import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String>obj=new ArrayList<String>();
		ArrayList<String>obj1=new ArrayList<String>();
		System.out.println("DISPLAY ONLY THE CSE STUDENTS IN CEG");
		obj.add("kaviya");
		obj.add("roshini");
		obj.add("sivapreethi");
		obj.add("subhashini");
		obj.add("raina");
		System.out.println("\n the display string is\t" +obj);
		obj.add(0,"jesika");
		obj.add(1,"srinithi");
		
		obj.remove("raina");
		System.out.println("\n current present names is:\t" +obj);	
		obj.remove(0);
		System.out.println("\n current names is:\t" +obj);
		obj.add("jesika");
		System.out.println("\n the final namelist is:\t" +obj);
		System.out.println("THE STUDENT WENT TO HOTEL AND ORDER THE FOOD:\t");
		obj1.add("pizza");
		obj1.add("burger");
		obj1.add("barbeque");
		obj1.add("non");
		System.out.println("the display items is:\t" +obj1);
		obj1.add(0,"panipoori ");
		obj1.add(1,"grill chicken");
		System.out.println("\t the  current display items is:\t" +obj1);
		obj1.remove(0);
		obj1.remove(1);
		System.out.println("\t the  current display items is:\t" +obj1);
		obj1.add("thandoori");
		obj1.add("butter chicken");
		obj1.add("fried chicken");
		System.out.println("\t the  current display items is:\t" +obj1);
		// TODO Auto-generated method stub

	}

}
