package _06_lottery_numbers;

import java.util.Random;

public class lottery {
public static void main(String[] args) {
	Random ran = new Random();
	int rnum = ran.nextInt(100);
	
	int dibs = ran.nextInt(100);
	
	int gibs = ran.nextInt(100);
	
	int bibs = ran.nextInt(100);
	
	int jibs = ran.nextInt(100);
	System.out.println(rnum +"     "+dibs +"      "+gibs +"      "+bibs +"      "+jibs  );
}
}
