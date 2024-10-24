public class Rhombus {
	Integer diagonalA;
	Integer diagonalB;

	public Rhombus(Integer diagonalA, Integer diagonalB) {
		this.diagonalA = diagonalA;
		this.diagonalB = diagonalB;
	}

	public double side() {
		return Math.sqrt(Math.pow(diagonalA,2) + Math.pow(diagonalB, 2)) / 2.0; 
	}

	public double perimeter() {
		return 4 * this.side();
	}

	public boolean isSquare() {
		if (diagonalA == diagonalB) 
			return true;
		return false; 
	}
}