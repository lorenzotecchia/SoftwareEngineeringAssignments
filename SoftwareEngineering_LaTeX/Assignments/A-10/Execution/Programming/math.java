clas Math{

enum TriangleType {
    Rectangular, Isosceles, Equilateral, Normal}

    public TriangleType classifyTriangle(int side1, int side2, int side3) {
        int quad1 = side1 * side1;
        int quad2 = side2 * side2;
        int quad3 = side3 * side3;

        if ((side1 == side2) || (side2 == side3) || (side3 == side1)) {
            return TriangleType.Isosceles;
        } else if ((side1 == side2) && (side2 == side3)) {
            return TriangleType.Equilateral;
        } else if ((quad1 + quad2 == quad3) || (quad1 + quad3 == quad2) || (quad3 + quad2 == quad1)) {
            return TriangleType.Rectangular
        } else {
            return TriangleType.Normal;
        }

    }
}