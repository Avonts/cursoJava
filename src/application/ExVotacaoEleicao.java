package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ExVotacaoEleicao {

	public static void main(String[] args) {

		Map<String, Integer> votes = new TreeMap<>();
		String path = "C:\\temp\\eleicao.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while (line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);

				if (votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, count + votesSoFar);
				}
				else {
					votes.put(name, count);
				}
				
				line = br.readLine();
			}
			
			for(String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
