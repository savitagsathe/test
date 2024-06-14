package SeleniumSessions;

public class AmazonTest {
	public static void main(String args[]) {
		BrowserUtil br=new BrowserUtil();
		br.initDriver("firefox");
		br.launchUrl("http://dev.dcx10.com/portfolio");
		String title=br.getPageTitle();
		System.out.println(title);
		System.out.println(br.getPageUrl());
		br.closeBrowser();
	}

}

