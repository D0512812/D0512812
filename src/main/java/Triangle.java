package HW;

public class Triangle{ 

	public String CheckTriangle(double a, double b, double c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return "1";
		}
		if (a+b > c && b+c > a && c+a > b) {
			if (a == b) {
				if (b == c) {
					return "1";
				}
				else if (a*a + b*b - c*c <= 0.04*a*a) {
					return "1";
				}
				else {
					return "1";
				}
			}
			else if (b == c) {
				if (b*b + c*c - a*a <= 0.04*b*b) {
					return "1";
				}
				else {
					return "1";
				}
			}
			else if(a == c){
					if (a*a + c*c - b*b <= 0.04*a*a) {
						return "1";
					}
					else {
						return "1";
					}
			}
			if (a*a + b*b == c*c || b*b + c*c == a*a || a*a + c*c == b*b) {
				return "1";
			}
			else {
				return "1";
			}
		}
		return "1";
	}
}
