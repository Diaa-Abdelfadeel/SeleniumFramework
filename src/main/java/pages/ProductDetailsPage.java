package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase
{
	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="strong.current-item")
	public WebElement productNamebreadCrumb; 

	@FindBy(css="div.email-a-friend button.button-2.email-a-friend-button")
	WebElement emailFriendBtn ; 

	@FindBy(css="span.price-value-4")
	public WebElement productPricelbl ;

	@FindBy(id="add-to-wishlist-button-4")
	WebElement addToWishlistBtn ; 

	@FindBy(linkText="Add your review")
	WebElement addReviewLink; 

	@FindBy(css ="#product-details-form > div:nth-child(2) > div.product-essential > div.overview > div.overview-buttons > div.compare-products > button")
//	//*[@id="product-details-form"]/div[2]/div[1]/div[2]/div[9]/div[2]/button
//	//*[@id="product-details-form"]/div[2]/div[1]/div[2]/div[10]/div[2]/button
//	#product-details-form > div:nth-child(2) > div.product-essential > div.overview > div.overview-buttons > div.compare-products > button
//	#product-details-form > div:nth-child(2) > div.product-essential > div.overview > div.overview-buttons > div.compare-products > button
	WebElement addToCompareBtn ; 
	
	@FindBy(id="add-to-cart-button-4")
	WebElement addToCartBtn ; 

	public void openSendEmail() 
	{
		clickButton(emailFriendBtn);
	}

	public void openAddReviewPage() 
	{
		clickButton(addReviewLink);
	}

	public void AddProductToWishlist() 
	{
		clickButton(addToWishlistBtn);
	}

	public void AddProductToCompare() 
	{
		clickButton(addToCompareBtn);
	}

	public void AddToCart() 
	{
		clickButton(addToCartBtn);
	}

}
