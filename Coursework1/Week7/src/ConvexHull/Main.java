package ConvexHull;

import java.util.*;

import java.util.Random;
import java.util.Scanner;


@SuppressWarnings("unused")

public class Main {
	public static void main(String[] args) {
		//creating class type array
		long startTime = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("how many coordinate do you want to insert: ");
		int maxCoordinate = sc.nextInt();
		
	
		
		Coordinate point[] = new Coordinate[maxCoordinate];
		
		Random rand = new Random();
		
		for( int i=0;i<maxCoordinate; i++) {
			int x = rand.nextInt(10);
			int y = rand.nextInt(10);
			
			point[i] = new Coordinate(x,y);
		}
		
		

		
		JarvisMarchAlgo gfw = new JarvisMarchAlgo();
		gfw.convexhall(point);
		
		long endTime = System.currentTimeMillis();
		System.out.println("Total time::" +(endTime-startTime)+ " ms");
	}

}

