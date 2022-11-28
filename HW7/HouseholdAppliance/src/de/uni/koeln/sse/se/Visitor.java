package de.uni.koeln.sse.se;

public interface Visitor {
	double visit(Glass glass);

	double visit(Furniture furniture);

	double visit(Electronic electronic);

}
