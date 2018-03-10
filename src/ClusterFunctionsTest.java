import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

public class ClusterFunctionsTest {

	@Test
	public void test() {
		Vector<Double> vecA = new Vector<>();
		Vector<Double> vecB = new Vector<>();
		
		vecA.add(2.0);
		vecA.add(2.0);
		
		vecB.add(6.0);
		vecB.add(5.0);
		
		assertEquals(ClusterFunctions.dist(vecA, vecB), 5.0, 0.001);
		
		vecB.add(3.0);
		
		assertEquals(ClusterFunctions.dist(vecA, vecB), Double.NaN, 0.001);
		
		vecA.add(3.0);
		
		assertEquals(ClusterFunctions.dist(vecA, vecB), 5.0, 0.001);
	}
}
