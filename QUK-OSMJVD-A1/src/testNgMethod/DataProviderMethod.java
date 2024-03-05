package testNgMethod;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviderMethod {
	
	@DataProvider(name="testdata")
	public String[][] getData(){
	String[][] data=new String[2][5];
			data[0][0]="bindu";
			data[0][1]="UK";
			data[0][2]="9876543568";
			data[0][3]="A+";
			data[0][4]="bindu@gmail.com";
			
			data[1][0]="rekha";
			data[1][1]="UK";
			data[1][2]="87653468568";
			data[1][3]="o+";
			data[1][4]="rekha@gmail.com";
				return data;
	}
	
	@DataProvider(name="testdata1")
	public String[][] getData1(){
	String[][] data=new String[2][5];
			data[0][0]="bindu";
			data[0][1]="UK";
			data[0][2]="9876543568";
			data[0][3]="A+";
			data[0][4]="bindu@gmail.com";
			
			data[1][0]="rekha";
			data[1][1]="UK";
			data[1][2]="87653468568";
			data[1][3]="o+";
			data[1][4]="rekha@gmail.com";
				return data;
	}

	@Test(dataProvider = "testdata1")
	public void demo(String name,String state, String number, String bloodgroup, String gmail) {
		{
		Reporter.log(name,true);
		Reporter.log(state, true);
		Reporter.log(number, true);
		Reporter.log(bloodgroup, true);
		Reporter.log(gmail, true);
		}
	}
}