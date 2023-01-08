import javax.swing.JOptionPane;

public class Guis {
	
	public static void main(String args[]){
		Guis.requestDataFromTheUser();
	}
	
	//JoptionPanel is a class with statics methods
	
	/**
	 * This program obtain a username and if is not correct, the user 
	 * could try up five times. 
	 */
	public static void requestDataFromTheUser() {
		String nameUser;
		int intentos = 5;
		boolean haveAccess= false;
		int result;
		int finished = 0;

		nameUser = JOptionPane.showInputDialog("Enter your name");
		
		if(nameUser.equals("Alexander")) {
			haveAccess = true;
			
		}
		
		while(!nameUser.equals("Alexander") && finished == 0)
		{

			result = JOptionPane.showConfirmDialog(null, "You don't access, do you wish try again?");
			
			if(result == 0) {
				nameUser = JOptionPane.showInputDialog("Enter your name, you have "+intentos +" attempts");
				intentos--;
				if(nameUser.equals("Alexander")) { 
					haveAccess = true;
					finished = 1;
				}
			}else{
				finished = 1;
			}
			if(intentos < 1) {
				JOptionPane.showMessageDialog(null, "Your attempts are over");
				finished = 1;
			}
		}
		
		if(haveAccess) {
			JOptionPane.showMessageDialog(null, "Welcome Admin: "+nameUser);
		}else {
			JOptionPane.showMessageDialog(null, "Good bay");
		}
		
	}
	
}
