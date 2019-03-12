package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.Base;

public class NpvPage extends Base {

	JavascriptExecutor js = ((JavascriptExecutor) driver);

	public NpvPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "lbl_val_1")
	public WebElement value1;

	@FindBy(id = "lbl_val_2")
	public WebElement value2;

	@FindBy(id = "lbl_val_3")
	public WebElement value3;

	@FindBy(id = "lbl_val_4")
	public WebElement value4;

	@FindBy(id = "lbl_val_5")
	public WebElement value5;

	@FindBy(id = "lbl_nl_val")
	public WebElement totalBalance;

	@FindBy(id = "txt_val_1")
	public WebElement numValue1;

	@FindBy(id = "txt_val_2")
	public WebElement numValue2;

	@FindBy(id = "txt_val_4")
	public WebElement numValue3;

	@FindBy(id = "txt_val_5")
	public WebElement numValue4;

	@FindBy(id = "txt_val_6")
	public WebElement numValue5;

	@FindBy(id = "txt_nl_val")
	public WebElement totalValue;

	public void click(WebElement ele) {
		ele.click();
	}

	public void clickElement(WebElement element) {
		js.executeScript("arguments[0].click();", element);

	}

	public void input_text(WebElement value, String input) {
		value.sendKeys(input);
	}

	public void enterText(WebElement element, String txt) {
		js.executeScript("arguments[0].value='" + txt + "'", element);
	}

	public void countElements(String id, int expectedCount) {
		List<WebElement> values = driver.findElements(By.xpath("//*[starts-with(@id, '" + id + "')]"));
		int count = values.size();
//		return count == expectedCount;
		Assert.assertEquals(count, expectedCount);
	}

	public void verifyTitle(String Ac) {
		String Ex = driver.getTitle();
		Assert.assertEquals(Ex, Ac);
	}

	public boolean checkValues() {

		List<WebElement> val = driver.findElements(By.xpath("//*[starts-with(@id, 'txt_')]"));
		ArrayList<Double> items = new ArrayList<>();
		for (WebElement value : val) {
			String actual = value.getAttribute("innerHTML").replaceAll("[^0-9+\\.]", "");
			double num = Double.parseDouble(actual);
			if (num > 0) {
				items.add(num);
			} else
				System.out.println("Improper values found");
		}
		if (val.size() == items.size()) {
			return true;
		}
		return false;
	}

	public void verifyTotal() {
		double total = Double.parseDouble(totalValue.getAttribute("value"));
		double sum = 0;
		List<WebElement> val = driver.findElements(By.xpath("//*[starts-with(@id, 'txt_')]"));
		for (WebElement value : val) {
			String actual = value.getAttribute("value").replaceAll("[^0-9+\\.]", "");
			double num = Double.parseDouble(actual);
			sum = sum + num;
		}
		Assert.assertEquals(total, sum);
	}

	public boolean isCurrency() {
		List<WebElement> val = driver.findElements(By.xpath("//*[starts-with(@id, 'txt_')]"));
		for (WebElement value : val) {
			String actual = value.getAttribute("value");

			return actual.contains("$");
		}
		return false;
	}

	public void isCurrencyFormat() {
		List<WebElement> val = driver.findElements(By.xpath("//*[starts-with(@id, 'txt_')]"));
		for (WebElement value : val) {
			String actual = value.getAttribute("value");

			Pattern pattern = Pattern.compile(
					"^(?:[$]|)[+-]?[0-9]{1,3}(?:[0-9]*(?:[.,][0-9]{1})?|(?:,[0-9]{3})*(?:\\\\.[0-9]{1,2})?|(?:\\\\.[0-9]{3})*(?:,[0-9]{1,2})?)$");
			if (pattern.matcher(actual).matches()) {
				return;
			} else
				throw new IllegalArgumentException("Invalid formate");
		}
	}
}
