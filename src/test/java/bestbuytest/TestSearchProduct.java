package bestbuytest;

import org.testng.annotations.Test;

import Page.SearchProduct;
import baselibrary.BaseLibrary;
import excelutility.getreaddata;

public class TestSearchProduct extends BaseLibrary{
	SearchProduct sp;
	String excelpath="./testdata/testdata.xlsx";
	String data1=getreaddata.getExcedata(excelpath,1,0);	
	@Test(priority=1)
	public void Perform_a_search_for_a_specificproduct() throws InterruptedException {
		sp=new SearchProduct();
		sp.searchfurnityure(data1);
	}
	
	
	
	

}
