package ConvexHull;

import java.util.Stack;

public class JarvisMarchAlgo {
	public int direction(Coordinate a, Coordinate b, Coordinate c) {
		int area = (b.x-a.x)*(c.y-b.y)-(b.y-a.y)*(c.x-b.x);
		return area;
		
	}
	
	public void convexhall(Coordinate point[]) {
		Stack<Coordinate> stack = new Stack<Coordinate>();
		int left = 1 ; 
		int n = point.length;
		//finding leftmost point
		for(int i=1; i<n; i++) {
			
			if(point[i].x<point[left].x) {
				left = i;
			}
		}
		int a = left;
		//finding the convex hall points
		do {
			stack.add(point[a]);
			int b = (a+1)%n;
			for(int c=0; c<n; c++) {
				if(direction(point[a], point[b], point[c])>0){
					b=c;
				}
			}
			a=b;

		}
		while(a!=left); 
			stack.add(point[a]);
			
		for(Coordinate i: stack) {
			System.out.println("\nconvexhull point("+i.x+","+i.y+")");
		}
		
		
	}//convex hall method end

}


