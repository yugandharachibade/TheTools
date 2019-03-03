package homePractice;

class Emp
{
    int id;
    String name;
    float sal;
    String position;
    private void getdata(int a,String b,float c)
    {
    		id=a;
    		name=b;
    		sal=c;
    }
    void get(int a,String b,int c)
    {
    	getdata(a,b,c);
    }
    void show()
    {
    	System.out.println("Emp Id:"+id);
    	System.out.println("Emp Name:"+name);
    	System.out.println("Emp Sal:"+sal);
    }
    void getwork(String pos)
    {
      position=pos;
    }
    void showwork()
    {
    	System.out.println("Emp Work:"+position);
    }
}

class QA extends Emp
{
	void W_Testcase()
	{
		System.out.println("Write Test cases");
	}
	void E_TestCase()
	{
		System.out.println("Execute Test cases");
	}
}
class Auto extends QA
{
	
	void W_Testscript()
	{
		System.out.println("Write Test Script");
	}
	void E_Testscript()
	{
		System.out.println("Execute Test Script");
	}
}
class Dev extends Emp
{
	void W_Code()
	{
		System.out.println("Write Code");
	}
	void fix_Bug()
	{
		System.out.println("Bug Fixed");
	}
}
public class InheritanceEmp {

	public static void main(String[] args) {
		
		Auto a=new Auto();
		Dev d=new Dev();
		a.get(2,"pqr",30000);
		a.show();
		System.out.println();
		a.getwork("QA");
		a.showwork();
		System.out.println();
		a.W_Testcase();
		a.E_TestCase();
		System.out.println();
		a.W_Testscript();
		a.E_Testscript();
		
		System.out.println();
		d.get(1, "Prajakta", 50000);
		d.show();
		d.W_Code();
		d.fix_Bug();
	}

}
