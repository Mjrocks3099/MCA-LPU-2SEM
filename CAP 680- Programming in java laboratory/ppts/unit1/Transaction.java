class Transaction
{
	double balanceAmount=1000;
	public double deposit(double amt)
	{
		balanceAmount=balanceAmount+amt;
	return balanceAmount;
	}
	public double withdrawal(double amt)
	{	
		if(amt<balanceAmount)
		{
			balanceAmount=balanceAmount-amt;
		}
		
	return balanceAmount;
	}
	public double checkBalance()
	{
		return balanceAmount;
	}





}
