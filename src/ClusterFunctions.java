import java.util.Vector;

public class ClusterFunctions {

	public static double dist(Vector<Double> vecA, Vector<Double> vecB) {
		
		if(vecA.size() != vecB.size()) {
			return Double.NaN;
		}
		double result = 0.0;
		double diff;
		int size = vecA.size();
		
		for(int i = 0; i < size; ++i) {
			diff = vecB.get(i) - vecA.get(i);
			result += Math.pow(diff, 2);
		}
		return Math.sqrt(result);
	}
}