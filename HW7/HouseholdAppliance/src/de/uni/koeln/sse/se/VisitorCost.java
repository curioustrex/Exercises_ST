package de.uni.koeln.sse.se;

public class VisitorCost implements Visitor {

//	@Override
	public double visit(Glass glass) {
		// TODO Auto-generated method stub

		double cost = 0;
		int t = glass.getTickness();
		double length = glass.getLenght();

		switch (t) {
		case 1:
			cost = (length/100) * 2;
			break;
		case 2:
			cost = (length/100) * 1.2;
			break;
		case 3:
			cost = (length/100) * 0.7;
			break;

		}
		
		System.out.println("Total Cost for " + glass.getName() + " is: " + cost + " Euros");

		return cost;
	}

//	@Override
	public double visit(Furniture furniture) {
		// TODO Auto-generated method stub
		double cost = 0;
		double weight = furniture.getWeight();
		
		cost = (weight/20)*5;
		
		System.out.println("Total Cost for " + furniture.getName() + " is: " + cost + " Euros");

		return cost;
	}

//	@Override
	public double visit(Electronic electronic) {
		// TODO Auto-generated method stub
		double cost = 0;
		double weight = electronic.getWeight();
		
		if(electronic.getFragile() == true) {
			cost = (weight/10)*5;
		} else {
			cost = (weight/15)*5;
		}

		System.out.println("Total Cost for " + electronic.getName() + " is: " + cost + " Euros");
		return cost;
	}

}
