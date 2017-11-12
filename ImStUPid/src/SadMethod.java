import javax.swing.JOptionPane;

public class SadMethod {
	
	 SadMethod chingy = new SadMethod();
	public static void main(String[] args) {
	String cool = JOptionPane.showInputDialog("What Is Your Favorite Singer");
	poptart(cool);
	superPoptart("Lemon", 5);
	superDuperPoptart(3);
	}
	
	public static void poptart(String name) {
		if(name.equals("coolguy111@gmail.com")){
			System.out.println("yes");
		}
		else if(name.equals("PoopyDiaperRash")) {
			System.out.println("succ");
		}
		else {
			System.out.println(name + " Doesn't Exists");
		}
	}
	public static void superPoptart(String vode, int stupi) {
		for(int i = 0;  i < stupi; i++) {
			System.out.println(vode);
		}
		
	}
	public static void superDuperPoptart(int poptart) {
		boolean jesus;
		if(poptart%2==0) {
			jesus = true;
			System.out.println(jesus);
		}
		else if(poptart%2==1) {
			jesus = false;
			System.out.println(jesus);
		}
	}

	
	
	
	
	
	
	
	
	
	

}
