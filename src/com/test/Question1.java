package com.test;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
	public static void main(String[] args) {
		
		List<Point> points = new ArrayList<Point>();
		points.add(new Point(-1,0));
		points.add(new Point(2,2));
		points.add(new Point(1,3));
		
		printBounds(points);
		
	}
	
	public static void printBounds(List<Point> points) {
		
		int smallestX = points.get(0).x;
		int largestY = points.get(0).y;
		int[] smallestXs = new int[2];
		int[] largestYs = new int[2];
		
		smallestXs[0] = smallestX;
		largestYs[0] = largestY;
		
		  for(int i=0; i< points.size(); i++)
          {
			 
                  if(points.get(i).x < smallestX) {
                          smallestXs[0] = points.get(i).x;
                          smallestXs[1] = smallestXs[0];
                  }
                  if(points.get(i).y > largestY) {
                	  largestYs[1] = largestYs[0];
                      largestYs[0] = points.get(i).y;
                      
                  }
                  System.out.println(""+largestYs[0] +","+ largestYs[1]  );
          }
		
		System.out.println("Bottom -left"+smallestXs[0] +","+ smallestXs[1] );
		System.out.println("Top-right"+largestYs[0] +","+ largestYs[1]  );
	}
	
	
}

class Point {
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}