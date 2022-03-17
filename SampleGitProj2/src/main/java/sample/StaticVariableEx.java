package sample;

public class StaticVariableEx {
	static int a=1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariableEx obj=new StaticVariableEx();
		StaticVariableEx obj1=new StaticVariableEx();
		StaticVariableEx obj2=new StaticVariableEx();
		

	}
	public StaticVariableEx()
	{
		a++;
		System.out.println(a);
	}

}
