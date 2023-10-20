package bestbuytest;

import org.testng.annotations.Test;

import Page.SearchByCategory_Page;
import baselibrary.BaseLibrary;

public class TestCategory extends BaseLibrary {
	SearchByCategory_Page sc;
	@Test()
	public void search_by_category() throws InterruptedException {
		sc=new SearchByCategory_Page();
		sc.clickoncategories();
	}

}
