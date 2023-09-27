class Account {
	public String Name;
	protected String email;
	private String Password;
	
	public String getPassword() {
		return this.Password;
	}
	
	public void setPassword(String pass) {
		this.Password = pass;
	}
	public void getID (String Name,String Email){
		System.out.println("Your name is " + Name +"  and Email is "+  Email);
	}
}

public class Bank {
	public static void main (String[] args) {
		Account Account1 = new Account();
		Account1.Name = "Pranay";
		Account1.email= "pranaybisan45@gmail.com";
		Account1.getID(Account1.Name, Account1.email);
		Account1.setPassword ("Pran@1234");
		System.out.println("And your Password is "+Account1.getPassword());
	}
}