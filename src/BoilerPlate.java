import java.util.*;
/**
 * Created by James on 4/2/2017.
 */
public class BoilerPlate {

	//---------------------------------------------------------------------------------------
	//  Code borrowed from Dr. Simari
	//---------------------------------------------------------------------------------------
	/**
	 * Random number generator.
	 */
	static final Random random = new Random(System.currentTimeMillis());

	/**
	 * A random value uniformly distributed in the interval [lower, upper).
	 *
	 * @param lower A float.
	 * @param upper A float.
	 * @return A float.
	 */
	static float random(float lower, float upper) {

		return random.nextFloat()*(upper - lower) + lower;

	}
}
