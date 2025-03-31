package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv12 {

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 10, 1841);
	    assertEquals("11/11/1841", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive10() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive9() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 31, 1868);
	    assertEquals("1/1/1869", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive13() throws Throwable {
	    NextDate nextDate0 = new NextDate((-112), (-112), (-112));
	    String string0 = nextDate0.run(6, 30, 2021);
	    assertEquals("7/1/2021", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive8() throws Throwable {
	    NextDate nextDate0 = new NextDate(7, 7, 7);
	    String string0 = nextDate0.run(7, 7, 2020);
	    assertEquals("7/7/2020", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive14() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run(10, 31, 1871);
	    assertEquals("11/1/1871", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive11() throws Throwable {
	    NextDate nextDate0 = new NextDate((-4416), 0, (-4416));
	    String string0 = nextDate0.run(2, 12, 1801);
	    assertEquals("2/13/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive12() throws Throwable {
	    NextDate nextDate0 = new NextDate(83, 2021, 214);
	    String string0 = nextDate0.run(9, 31, 2021);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive17() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run(10, 10, 2131);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive18() throws Throwable {
	    NextDate nextDate0 = new NextDate(251, (-29), (-29));
	    String string0 = nextDate0.run(12, 5, 1828);
	    assertEquals("12/6/1828", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive15() throws Throwable {
	    NextDate nextDate0 = new NextDate((-112), (-112), (-112));
	    String string0 = nextDate0.run(8, 9, 1840);
	    assertEquals("8/10/1840", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive16() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 1801, 1801);
	    String string0 = nextDate0.run(12, 1801, 1801);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate((-112), (-112), (-112));
	    String string0 = nextDate0.run(4, 30, 2021);
	    assertEquals("5/1/2021", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 10, 1841);
	    assertEquals("11/11/1841", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive3() throws Throwable {
	    NextDate nextDate0 = new NextDate(251, (-29), (-29));
	    String string0 = nextDate0.run(3, 5, 1828);
	    assertEquals("3/6/1828", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, 5, 5);
	    String string0 = nextDate0.run(5, 5, 1808);
	    assertEquals("5/6/1808", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndRunWithPositiveAndRunWithPositive() throws Throwable {
	    NextDate nextDate0 = new NextDate(251, (-29), (-29));
	    String string0 = nextDate0.run(251, (-737), 2518);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive5() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 31, 2);
	    String string0 = nextDate0.run(2, 31, 1837);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndRunWithPositiveAndRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(251, (-29), (-29));
	    String string0 = nextDate0.run((-29), 1, (-29));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive4() throws Throwable {
	    NextDate nextDate0 = new NextDate((-4390), (-4390), (-4390));
	    String string0 = nextDate0.run(1, 30, 2021);
	    assertEquals("1/31/2021", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive7() throws Throwable {
	    NextDate nextDate0 = new NextDate(1827, 1827, 1827);
	    String string0 = nextDate0.run(2, 29, 1827);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive6() throws Throwable {
	    NextDate nextDate0 = new NextDate(28, 28, 28);
	    String string0 = nextDate0.run(2, 28, 2020);
	    assertEquals("3/1/2020", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative1() throws Throwable {
	    NextDate nextDate0 = new NextDate(251, (-29), (-29));
	    String string0 = nextDate0.run(251, 3457, (-1167));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative0() throws Throwable {
	    NextDate nextDate0 = new NextDate(251, (-29), (-29));
	    String string0 = nextDate0.run(1, 1, (-2800));
	    assertEquals("invalid Input Date", string0);
	}

}