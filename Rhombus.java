public class Rhombus {
	Integer diagonalA;
	Integer diagonalB;
	Integer side;

	public Rhombus(Integer diagonalA, Integer diagonalB, Integer side) {
		this.diagonalA = diagonalA;
		this.diagonalB = diagonalB;
		this.side = side; 
	}

	public double area() { 
		return diagonalA * diagonalB / 2
	}

	public double perimeter() {
		return 4 * side;
	}
}