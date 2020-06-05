package triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TriangleTest { 
	
	@Test
	public void testCheckTriangle3() {
		Triangle a = new Triangle();
		assertEquals("tri"   , a.CheckTriangle(2, 3, 4));
	}	
}