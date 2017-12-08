package com.gmail.dmytropolishchuk2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {

		Map<String, String> myMap = new HashMap<>();

		myMap.put("White", "Білий");
		myMap.put("Black", "Чорний");
		myMap.put("Red", "Червоний");
		try (PrintWriter a = new PrintWriter("a.txt")) {
			for (int i = 0; i < 1; i++) {

				a.println(myMap);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ERROR FILE WRITE");
		}

		try (BufferedReader reader = new BufferedReader(new FileReader("a.txt"))) {
			String s;
			while ((s = reader.readLine()) != null) {

				System.out.println(s);
			}
			try (PrintWriter a = new PrintWriter("b.txt")) {
				for (int i = 0; i < 1; i++) {

					a.println(myMap.get("White"));
				}
			} catch (FileNotFoundException e) {
				System.out.println("ERROR FILE WRITE");
			}

		} catch (IOException e) {

			System.out.println(e.getMessage());
		}
	}
}
