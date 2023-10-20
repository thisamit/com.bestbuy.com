package bestbuytest;

import org.testng.annotations.Test;

import Page.AddtoCart;
import Page.SearchProduct;
import baselibrary.BaseLibrary;
import excelutility.getreaddata;

public class AddtoCartTest extends BaseLibrary{
	AddtoCart ac;
	SearchProduct sp;
	String excelpath="./testdata/testdata.xlsx";
	String data=getreaddata.getExcedata(excelpath,1,0);	
	@Test
	public void search_add_to_cart() throws InterruptedException {
		sp=new SearchProduct();
		ac=new AddtoCart();
		sp.searchfurnityure(data);	
		ac.addcart();
	}
}
