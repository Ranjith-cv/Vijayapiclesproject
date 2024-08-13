package testvj;

import org.testng.annotations.Test;


import basevj.Vpbaseclass;
import pagevj.Vppageclass;
import utilityvj.Vputilityclass;

public class Vptestclass extends Vpbaseclass {
	@Test

	public void verifyLoginwithValidCred() throws Exception
	{
		Vppageclass p1=new Vppageclass(driver);
		String xl="C:\\Users\\DELL\\OneDrive\\Documents\\vijayapickles.login.xlsx";
		String sheet1="Sheet1";
		int rowcount=Vputilityclass.getRowCount(xl, sheet1);
		
		for (int i=1;i<=rowcount;i++)
		{
			String username=Vputilityclass.getCellValue(xl, sheet1, i,0);
			System.out.println("username----"+username);
			String Pwd=Vputilityclass.getCellValue(xl, sheet1, i, 1);
            System.out.println("password---"+Pwd);
            p1.setvalues(username, Pwd);
            p1.login();
            p1.hometocart();
            p1.setvalues1("5");
            p1.cartprocedure();
            p1.setvalues2("abhi","pc", "seedcalicut", "lukmastreet", "townhall", "kozhikode", "671546", "9876456767");
            p1.setvalues3("sambar powder");
            p1.gettitle();
            
}
	}
}
