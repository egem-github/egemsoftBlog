package com.egemsoft.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StreamApiEx7 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Rogue", "Magneto", "Logan", "Storme");
		//herhangi e ile biten deger
		String f1 = list.stream().filter(s -> s.endsWith("e")).findAny().get();
		System.out.println(f1);
		// ilk a iceren deger
		String f2 = list.stream().filter(s -> s.contains("a")).findFirst().get();
		System.out.println(f2);
		try (Scanner scanner = new Scanner(new File("test.txt"))) {
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}

	}
}
