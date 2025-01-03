package com.advSelenium.parallelExecution;

import org.testng.annotations.Test;

public class OrgTest extends BaseClass{
	@Test(groups="smokeTest")
	public void createOrg()
	{
		System.out.println("Org is created");
	}
	@Test(groups="regressionTest")
	public void verifyOrg()
	{
		System.out.println("Org is verified");
	}
	@Test(groups="smokeTest")
	public void createOrgWithIndustry()
	{
		System.out.println("Org is created with industry");
	}


}
