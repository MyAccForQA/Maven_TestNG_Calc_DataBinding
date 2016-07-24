package core;

import net.sf.testng.databinding.DataBinding;
import net.sf.testng.databinding.TestInput;
import net.sf.testng.databinding.TestOutput;
import org.testng.Assert;
import org.testng.annotations.Test;
import static java.lang.Integer.parseInt;
// import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;

public class CalcDataBindingTest {

    @DataBinding
    @Test(groups = "csv")
    public void testSumCSV(@TestInput(name = "x") int x, @TestInput(name = "y") int y, @TestOutput(name = "sum") int sum) {    
        // assertThat(Calc.sum(x, y), is(equalTo(sum)));
    	// OR
        Assert.assertEquals(Calc.sum(x, y), sum);
    }
    
    @DataBinding
    @Test(groups = "json")
    public void testSumJSON(@TestInput(name = "x") int x, @TestInput(name = "y") int y, @TestOutput(name = "sum") int sum) {
        // assertThat(Calc.sum(x, y), is(equalTo(sum)));
        // OR
    	Assert.assertEquals(Calc.sum(x, y), sum);
    }
    
    @DataBinding
    @Test(groups = "properties")
    public void testSumProperties1(@TestInput(name = "x1") int x, @TestInput(name = "y1") int y, @TestOutput(name = "sum1") int sum) {
        // assertThat(Calc.sum(x, y), is(equalTo(sum)));
    	// OR
    	Assert.assertEquals(Calc.sum(x, y), sum);
    }
    
    @DataBinding
    @Test(groups = "properties")
    public void testSumProperties2(@TestInput(name = "x2") int x, @TestInput(name = "y2") int y, @TestOutput(name = "sum2") int sum) {
        // assertThat(Calc.sum(x, y), is(equalTo(sum)));
    	// OR
    	Assert.assertEquals(Calc.sum(x, y), sum);
    }
    
    @DataBinding
    @Test(groups = "properties")
    public void testSumProperties3(@TestInput(name = "x3") int x, @TestInput(name = "y3") int y, @TestOutput(name = "sum3") int sum) {
        // assertThat(Calc.sum(x, y), is(equalTo(sum)));
    	// OR
    	Assert.assertEquals(Calc.sum(x, y), sum);
    }
    
    @DataBinding
    @Test(groups = "properties")
    public void testSumProperties4(@TestInput(name = "x4") int x, @TestInput(name = "y4") int y, @TestOutput(name = "sum4") int sum) {
        // assertThat(Calc.sum(x, y), is(equalTo(sum)));
    	// OR
    	Assert.assertEquals(Calc.sum(x, y), sum);
    }
    
    @DataBinding
    @Test(groups = "properties")
    public void testSumProperties5(@TestInput(name = "x5") int x, @TestInput(name = "y5") int y, @TestOutput(name = "sum5") int sum) {
        // assertThat(Calc.sum(x, y), is(equalTo(sum)));
    	// OR
    	Assert.assertEquals(Calc.sum(x, y), sum);
    }

    @DataBinding
    @Test(groups = "text")
    public void testSumText(@TestInput(name = "x") String x, @TestInput(name = "y") String y, @TestOutput(name = "sum") String sum) {
        // assertThat(Calc.sum(parseInt(x), parseInt(y)), is(equalTo(parseInt(sum))));
    	// OR
    	Assert.assertEquals(Calc.sum(parseInt(x), parseInt(y)), parseInt(sum));
    }
    
    @DataBinding
    @Test(groups = "xml")
    public void testSumXML(@TestInput(name = "x") int x, @TestInput(name = "y") int y, @TestOutput(name = "sum") int sum) {
        // assertThat(Calc.sum(x, y), is(equalTo(sum)));
    	// OR
    	Assert.assertEquals(Calc.sum(x, y), sum);
    }
}