package AbstractInnerClass;

public class AbstractRunner {
	public static void main(String args) {
		AbstractParent obj=new AbstractParent() {
			@Override
			public void work(){
				System.out.println("Salary");
			}
		};
	
	obj.work();
	}
	}
