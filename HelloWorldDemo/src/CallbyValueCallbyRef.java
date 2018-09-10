
public class CallbyValueCallbyRef {
	// in java calling by reference is possible
	int p;
	int q; // these are global variables as they are written before main - done to show callbyref

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		CallbyValueCallbyRef obj = new CallbyValueCallbyRef(); // creating an object as it a non-static class
		
		int x = 10;
		int y = 20;
		obj.testsum(x,y);// call by value or pass by value as the value of x and y; we get a copy(not original) of x and y is given to  a and b

		obj.p =50; // it is to be called as it is a non-static function
		obj.q = 60;
		
		
		obj.swap(obj);
		//after swap 
		System.out.println(obj.p);
		System.out.println(obj.q);//passing by reference, calling and printing swap here 
		
	}

	public int testsum(int a, int b) {
	 a= 30; // here, since the value is changes here, it will not take x and y value but it will take the new value  so c= 70
	 b=40;
	int c = a+b;
	return c;
	
}
	
	public void swap(CallbyValueCallbyRef t) { //CallbyValueCallbyRef class ko reference pass garne (like how you write string,int) and t is the variable for class reference
		 int temp;                             //[it means now this class has two references "t"and obj; its like doing CallbyValueCallbyRef t = new CallbyValueCallbyRef();
		temp= t.p;//temp = 50
		t.p = t.q;//p=60
		t.q = temp; // q=50
	}

}
