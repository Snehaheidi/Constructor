
class Box   //Box -> Constrctor class name 
{
	int length; 
	int height;
	Box()
	{
		System.out.println("The Class -  Box -> Constructor method - Box");
	}
	Box(int l,int h)   // Box -> Constrctor method// overriding... 
	{
		length = l;
		height = h;
	}
	int setbox(int a,int b)
	{
		return a+b;
	}
	int volume()
	{
		return length*height;	
	}
}

public class Constrct {

	public static void main(String[] args) 
	{
		Box box = new Box(); // Class Box -> new object -> method of Box -> value assign...
		Box box1 = new Box(20,40);
		int value = box.setbox(10, 20);
		System.out.println("The Volume = "+box1.volume());
		System.out.println("The Volume = "+value);
		//System.out.println("The Volume = "+box.setbox(10, 20)); 
	}
}
