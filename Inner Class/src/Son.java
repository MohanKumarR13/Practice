
public class Son implements IFather,IMother{

	public void joinCollege() {
		System.out.println("Theni");
		IFather.super.joinCollege();
		IMother.super.joinCollege();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFather father=new Son();
		father.joinCollege();
	}

}
