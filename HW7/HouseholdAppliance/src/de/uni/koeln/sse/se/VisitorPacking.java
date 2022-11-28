package de.uni.koeln.sse.se;

public class VisitorPacking implements Visitor {

//	@Override
	public double visit(Glass glass) {
		// TODO Auto-generated method stub

		System.out.println(
				glass.getName() + "\n >should be wrapped with Bubble Wraps and packed in a box with dimension: "
						+ (glass.getHeight() + 1) + "x" + (glass.getLenght() + 1) + "x" + (glass.getWidth() + 1));

		return 0;

	}

//	@Override
	public double visit(Furniture furniture) {
		// TODO Auto-generated method stub

		System.out.println(furniture.getName() + "\n >should be covered with waterproof covers with area of: "
				+ furniture.getLenght() + "x" + furniture.getWidth());
		return 0;
	}

//	@Override
	public double visit(Electronic electronic) {
		// TODO Auto-generated method stub

		System.out.println(electronic.getName()
				+ "\n >should be covered with Polyethylene foam film and packed in a box with dimension: "
				+ (electronic.getHeight() + 1) + "x" + (electronic.getLenght() + 1) + "x"
				+ (electronic.getWidth() + 1));

		return 0;
	}

}
