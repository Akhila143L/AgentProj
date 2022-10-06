package com.exam.agent;

import java.sql.SQLException;
import java.util.Scanner;

public class AgentDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int Agentid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Agent id  ");
		Agentid= sc.nextInt();

			AgentDAO dao = new AgentDAO();
			try {
				System.out.println(dao.deleteAgent(Agentid));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		
	}
}
