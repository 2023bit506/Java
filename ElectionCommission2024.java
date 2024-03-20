interface Voter
{
	void castVote();
}
interface EC
{
	void checkValidityOfUser(int age) throws invalidUser;
}

class ECIndia implements Voter, EC
{
	final int minAge;
	public ECIndia(int minAge)
	{
		this.minAge = minAge;
	}
	public void castVote()
	{
		System.out.println("Election Commission Of India");
	}
	public void checkValidityOfUser(int age) throws invalidUser 
	{
		if(age<18)
		{
			throw new invalidUser("Invalid User");
		}
	}
}

class ECBrazil implements Voter, EC
{
	final int minAge;
	public ECBrazil(int minAge)
	{
		this.minAge = minAge;
	}
	public void castVote()
	{
		System.out.println("Election Commission Of Brazil");
	}
	public void checkValidityOfUser(int age) throws invalidUser
	{
		if(age<minAge)
		{
			throw new invalidUser("Invalid User");
		}
	}
}

class ElectionCommission2024
{
	public static void main(String ...args) throws invalidUser 
	{
		ECIndia e1 = new ECIndia(18);
		e1.checkValidityOfUser(19);
		ECBrazil b1 = new ECBrazil(20);
		b1.checkValidityOfUser(21);
	}
}

class invalidUser extends Exception
{
	invalidUser(String error)
	{
		super(error);
	}
}