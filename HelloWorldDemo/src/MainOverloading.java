
public class MainOverloading {
	
	// yes, a main function/method can be overloaded in java by passing different arguments for main function.
	// cannot use main (string args) again and again as it violates overloading rule.
	//jvm: (java virtual machine ) will look for [public static void main(String[] args)] : public satic void main; if t does noy find then it won;t execute, try commenting the initial main method f0r example

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method1");
		main("testing");// since below main method are static it can be called directly
		main(10);
		main(10,20);
	}


public static void main(String args)   //the other should be called inside [public static void main(String[] args)]- method
{
	                                    // it is because jvm will only look for fist string array and oly look for others
	System.out.println("main method2");
}
	
public static void main(int a)
{
		
		System.out.println("main method3");
}


public static void main(int a, int b) 
{
	
	System.out.println("main method4");
}

}

//create class a with systotprint main1 and here write b.main(it willit will exceute class a & b  ---cause it will check [public static void main(String[] args)] and excute other class.eh  )
//create class b with syout print(b.main)..(it will exceute class b &a a ---cause it will check [public static void main(String[] args)] and excute other class.eh  )
//result will be ab,ba,ab continuously which is called stack overflow;