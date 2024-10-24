public class Rhombus {
	Integer diagonalA;
	Integer diagonalB;

	public Rhombus() {
	}

	public Rhombus(Integer diagonalA, Integer diagonalB) {
		this.diagonalA = diagonalA;
		this.diagonalB = diagonalB;
	}

	public double side() {
		return Math.sqrt(Math.pow(diagonalA,2) + Math.pow(diagonalB)) / 2.0; 
	}

	public double area() { 
		return diagonalA * diagonalB / 2.0;
	}

	public double perimeter() {
		return 4 * side;
	}
}