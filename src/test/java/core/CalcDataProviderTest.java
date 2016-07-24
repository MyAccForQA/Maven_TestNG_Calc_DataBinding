package core;

import java.io.FileInputStream;
import java.util.Properties;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcDataProviderTest {

	@BeforeMethod
	public void initialize() {
	} // public void initialize() {

	@DataProvider(name = "test")
	public static String[][] prNumber() {

		String[][] res = null; // out
		String[] arr = { "in_x", "in_y", "out_sum" };
		String propertiesFile = "./src/test/resources/sum-DataProvider.properties";
		Properties properties = new Properties();

		try {
			properties.load(new FileInputStream(propertiesFile));
			int n = properties.stringPropertyNames().size() / arr.length;
			res = new String[n][arr.length]; // out
			for (int i = 0; i < n; i++) {
				System.out.println(i);
				res[i][0] = properties.getProperty(arr[0] + (i + 1));
				res[i][1] = properties.getProperty(arr[1] + (i + 1));
				res[i][2] = properties.getProperty(arr[2] + (i + 1));
			} // for (int i = 0; i < n; i++) {

		} catch (Exception e) {
			properties = null;
			System.out.println("asdasd " + e);
		} // try {

		return res;
	} // public static String[][] prNumber() {

	@Test(dataProvider = "test")
	public void TestSum(String x, String y, String expResult) {
		Assert.assertEquals(Long.parseLong(expResult), (Long.parseLong(x) + Long.parseLong(y)));
	} // public void TestSum(String x, String y, String expResult) {
}