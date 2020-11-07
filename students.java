package students_info;

class students implements Comparable<students>
{
	private int roll;
	private String name;
	private double marks;
	public static int a;
	public students(int roll, String name, double marks) {
		//super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public students(int a)
	{
		this.a=a;
	}
	

	@Override
	public String toString() {
		return "students [roll=" + roll + ", name=" + name + ", marks=" + marks
				+ "]\n";
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public double getMarks() {
		return marks;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(students arg0) {
		System.out.println(a);
		if(a==2)
		{
			System.out.println("marks");
		if((marks-arg0.marks)==0.00000)
		{
			return 0;
		}
		else if((marks-arg0.marks)<0.00001)
		{
			return -1;
		}
		else
		{
			return 1;
		}
		}
		else if(a==1)
		{
			System.out.println("roll");
		if(roll==arg0.roll)
		{
			return 0; 
		}
		else if(roll>arg0.roll)
		{
			return 1;
		}
		else
		{
			return -1;
		}	
		}
		else
		{
			System.out.println("name");
			return name.compareTo(arg0.name);
		}
	}
}
