package MethodArgument2;

public class ThreadRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new  Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<5;i++){
					System.out.println("Ben 10 Omniverse");
				}
			}
		}).run();
	}

}    
