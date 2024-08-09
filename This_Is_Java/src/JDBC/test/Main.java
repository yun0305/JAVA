package JDBC.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {
		
	
	public static void main(String[] args) throws SQLException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {	
			System.out.println("정지할거면 0 눌러 시작할거면 1누르던가");
			int selec = Integer.parseInt(br.readLine());
			if(selec == 0) {
				break;
			}
			else {
				JDBC_TEST dbTest = new JDBC_TEST();
				dbTest.DataBase();
			}
			}
		System.out.println("종료");
		
	}

}
