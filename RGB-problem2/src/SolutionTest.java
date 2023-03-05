import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testSort() {
		BallString bs1 = new BallString("RR");
		BallString bs2 = new BallString("G");
		BallString bs3 = new BallString("BBBB");
		List<BallString> bsList = new ArrayList<>(Arrays.asList(bs1, bs2, bs3));
		bsList.sort(null);
		System.out.println(bsList.toString());
	}

}
