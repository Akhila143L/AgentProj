package com.exam.agent;

import java.sql.SQLException;

import java.util.Scanner;

public class AgentUpdate {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Agent agent = new Agent();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Agent Id  ");
		agent.setAgentid(sc.nextInt());
		System.out.println("Enter Agent Name  ");
		agent.setName(sc.next());
		System.out.println("Enter City  ");
		agent.setCity(sc.next());
		System.out.println("Enter Gender  ");
		agent.setGender(sc.next());
		System.out.println("Enter Maritalstatus  ");
		agent.setMaritalStatus(sc.nextInt());
		System.out.println("Enter Premium  ");
		agent.setPremium(sc.nextDouble());
		try {
			System.out.println(new AgentDAO().updateAgent(agent));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
