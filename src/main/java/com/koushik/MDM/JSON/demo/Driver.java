package com.koushik.MDM.JSON.demo;



import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Student theStudent = mapper.readValue(
					new File("data/student.json"), Student.class);
			System.out.println("First Name: "+theStudent.getFirstName());
			System.out.println("Last Name: "+theStudent.getLastName());
			System.out.println("ID: "+theStudent.getId());
			System.out.println("Addres: "+theStudent.getAddress());
	
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}