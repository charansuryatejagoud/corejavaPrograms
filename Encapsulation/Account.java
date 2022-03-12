package Encapsulation;

public class Account {
	private static long acc_no;
	private String name,email;
	private static float amount;
	
	public long getAcc_no() {
	return acc_no;
	}
	public void setAcc_no(long number) {
	this.acc_no=number;
	}
	public String getName() {
		return name;
		}
		public void setname(String name) {
		this.name=name;
		}
	public String getEmail() {
	return email;
			}
			public void setemail(String email) {
			this.email=email;
			}
			public float getAmount() {
				return amount;
				}
				public void setamount(float amount) {
				this.amount=amount;
				}

	public static void main (String []args) {
		Account acc=new Account();
		acc.setAcc_no(1234506789);
		acc.setname("sury");
		acc.setemail("charansury@gmail.com");
		acc.setamount(75000f);
	
		System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
	}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	



