package com.test;

public class Question2 {
	public static void main(String[] args) {
		
		int red = 68;
		int green = 58;
		int blue =197;
		
		
		convertToHex(red,green,blue);

	}

	public static String convertToHex(int red, int green, int blue) {

		StringBuilder hexCode = new StringBuilder("#");
		
		try {

				
			String redHex = Integer.toHexString(red);
			String greenHex = Integer.toHexString(green);
			String blueHex = Integer.toHexString(blue);

			hexCode.append(redHex);
			hexCode.append(greenHex);
			hexCode.append(blueHex);
			System.out.println(hexCode);
		} catch (Exception e) {
			System.out.print("Error" + e.getMessage());
		}
		return hexCode.toString();
	}

}
