package InterfaceInnerClass;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IParent iparent =new IParent() {
			
			//@Override
			public void findPartner() {
				// TODO Auto-generated method stub
				System.out.println("Ben");
			}
		};
		iparent.findPartner();
	}

}
