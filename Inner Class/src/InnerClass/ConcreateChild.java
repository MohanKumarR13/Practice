package InnerClass;

public class ConcreateChild {
public static void main(String args[]){
 
ConcreateParent parent=new ConcreateParent(){
	 public void work(){
		System.out.println("Salary");
	}
};
parent.study();
parent.degree();
parent.work();
}}