package test;

import sagex.api.Global;
import sagex.api.MediaFileAPI;

public class TestMisc {
	public static void main(String args[]) {
		System.out.println(Global.GetServerAddress());

		Global.IsClient();
		Global.IsServerUI();
		
		System.out.println("done");
	}
}


