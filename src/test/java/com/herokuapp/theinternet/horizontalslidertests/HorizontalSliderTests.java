package com.herokuapp.theinternet.horizontalslidertests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.HorizontalSliderPage;

public class HorizontalSliderTests extends TestUtilities {
	@Test
	public void sliderTest() {
		log.info("Verify that slider can be moved");
		HorizontalSliderPage horizontalSliderPage = welcomePage.clickHorizontalLink();
		String value = "3.5";
		horizontalSliderPage.setSliderTo(value);
		String sliderValue = horizontalSliderPage.getSliderValue();
		Assert.assertTrue(sliderValue.equals(value), "Range is not correct. It is: " + sliderValue);
	}
}