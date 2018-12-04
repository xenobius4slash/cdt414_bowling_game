import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;

/**
 * 
 */

/**
 * @author sui18001
 *
 */
public class BowlingGameTest {

	BowlingGame bg;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test001() {
		bg = new BowlingGame("");
		bg.getScore();
		assertEquals(-1, bg.getScore() );
	}
	
	@Ignore
	@Test
	public void test002() {
		bg = new BowlingGame("[][][][][][][][][]");
		assertEquals(-1, bg.getScore() );
	}
	
	@Ignore
	@Test
	public void test003() {
		bg = new BowlingGame("[][][][][][][][][][][][]");
		assertEquals(-1, bg.getScore() );
	}

	@Ignore
	@Test
	public void test004() {
		bg = new BowlingGame("[3,4][5,2][3,2][,0][3,3][4,4][1,2][2,3][4,2][1,1]");
		assertEquals(-1, bg.getScore() );
	}
	
	@Ignore
	@Test
	public void test005() {
		bg = new BowlingGame("[3,4][5,2][3,2][0,][3,3][4,4][1,2][2,3][4,2][1,1]");
		assertEquals(-1, bg.getScore() );
	}
	
	@Test
	public void test006() {
		bg = new BowlingGame("[0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0]");
		assertEquals(0, bg.getScore() );
	}
	
	@Ignore
	@Test
	public void test007() {
		bg = new BowlingGame("[0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0]");
		assertEquals(-1, bg.getScore() );
	}
	
	@Test
	public void test008() {
		bg = new BowlingGame("[1,1][1,2][1,3][1,4][1,5][1,6][1,7][1,8][1,9][3,6]");
		assertEquals(66, bg.getScore() );
	}
	
	@Test
	public void test009() {
		bg = new BowlingGame("[0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][3,7][1]");
		assertEquals(11, bg.getScore() );
	}
	
	@Ignore
	@Test
	public void test010() {
		bg = new BowlingGame("[0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][3,7]");
		assertEquals(-1, bg.getScore() );
	}
	
	@Ignore
	@Test
	public void test011() {
		bg = new BowlingGame("[0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][3,7][1,2]");
		assertEquals(-1, bg.getScore() );
	}
	
	@Test
	public void test012() {
		bg = new BowlingGame("[0,0][0,0][0,0][3,7][7,1][0,0][0,0][0,0][0,0][0,0]");
		assertEquals(25, bg.getScore() );
	}
	
	@Test
	public void test013() {
		bg = new BowlingGame("[0,0][0,0][0,0][3,7][7,3][7,1][0,0][0,0][0,0][0,0]");
		assertEquals(42, bg.getScore() );
	}
	
	@Test
	public void test014() {
		bg = new BowlingGame("[9,1][8,2][7,3][6,4][5,5][4,6][3,7][2,8][1,9][9,1][1]");
		assertEquals(146, bg.getScore() );
	}
	
	@Test
	public void test015() {
		bg = new BowlingGame("[0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][10,0][7,1]");
		assertEquals(18, bg.getScore() );
	}
	
	
	@Test
	public void test016() {
		bg = new BowlingGame("[0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][10,0][10,0]");
		assertEquals(20, bg.getScore() );
	}
	
	@Ignore
	@Test
	public void test017() {
		bg = new BowlingGame("[0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][10,0][10]");
		assertEquals(-1, bg.getScore() );
	}
	
	
	@Test
	public void test018() {
		bg = new BowlingGame("[0,0][0,0][0,0][10,0][7,1][0,0][0,0][0,0][0,0][0,0]");
		assertEquals(26, bg.getScore() );
	}
	
	@Test
	public void test019() {
		bg = new BowlingGame("[0,0][0,0][0,0][10,0][10,0][7,1][0,0][0,0][0,0][0,0]");
		assertEquals(53, bg.getScore() );
	}
	
	
	@Test
	public void test020() {
		bg = new BowlingGame("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,10]");
		assertEquals(300, bg.getScore() );
	}
	
}
