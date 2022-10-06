package com.exam.agent;

import java.sql.SQLException;
import java.util.Scanner;

public class AgentSearch {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		int Agentid;
	System.out.println("Enter agent id");
	Agentid = sc.nextInt();
	AgentDAO dao = new AgentDAO();
		
	
	try {
		Agent agent = dao.searchAgent(Agentid);
		if (agent!=null) {
			System.out.println(agent);
		} else {
			System.out.println("*** Record Not Found ***");
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
}
