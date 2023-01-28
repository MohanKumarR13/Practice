package MethodArgument;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend friend=new Friend();
		friend.canManage(new IManagable() {
			
			@Override
			public void manage() {
				// TODO Auto-generated method stub
				System.out.println("Ben 10");
				
			}
		});
	}
	}


