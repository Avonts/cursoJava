package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.LogEntry;

public class ExLogsSet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("Enter file full path:"); String path = sc.nextLine();
		 */
		String path = "C:\\temp\\logs.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Set<LogEntry> set = new HashSet<>();

			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(" ");
				String userName = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));

				set.add(new LogEntry(userName, moment));

				line = br.readLine();

			}

			System.out.println("Total de usu�rios: " + set.size());

			for (LogEntry log : set) {
				System.out.println(log);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}
