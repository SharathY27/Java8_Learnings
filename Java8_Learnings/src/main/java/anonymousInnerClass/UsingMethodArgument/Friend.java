package anonymousInnerClass.UsingMethodArgument;

public class Friend {

	public void canManage(IManageable manageable) {
		manageable.manage();
	}

	public static void main(String[] args) {

		Friend friend = new Friend();
		friend.canManage(new IManageable() {

			@Override
			public void manage() {
				System.out.println("Yes i will manage");

			}
		});

	}

}
