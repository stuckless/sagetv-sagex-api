package test;

import java.util.Vector;

import sagex.SageAPI;
import sagex.api.Database;
import sagex.api.Global;
import sagex.remote.rmi.RMISageAPI;

public class TestSageTVReturningIncorrecType {

	public static void main(String[] args) {
		SageAPI.setProvider(new RMISageAPI("192.168.1.176"));
		System.out.println(Global.GetServerAddress());
		Vector results = Database.SearchSelectedFields("aliens", false, true, true, true, true, true, true, true, true, true, "TV");
		System.out.println("results: " + results);
	}

}
