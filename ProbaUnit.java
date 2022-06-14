package ProbaUnit;

public class ProbaUnit {
	
	public String order(int f1, int f2, int f3) {
		
		if (f2>f1 && f3>f1) {
			System.out.println("yes");
			return "yes";
		}else {
			System.out.println("no");

			return "no";
		}
	}

}
