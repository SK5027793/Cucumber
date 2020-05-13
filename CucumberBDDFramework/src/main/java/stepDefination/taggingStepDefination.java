package stepDefination;

import cucumber.api.java.en.Given;

public class taggingStepDefination 
{
  @Given("^user login to application with valid credentials$")
  public void user_login(){}
  
  @Given("^user landed on account summary page$")
  public void accountsummary(){}
  
  @Given("^user check for invoice summary$")
  public void invoicesummary() {}
  
  @Given("^user check for tracking Id summary$")
  public void trackingIdSummary() {}
  
  @Given("^user is on search and download page$")
  public void searchAndDownload() {}
  
  @Given("^user checks for message on accountsummary page$")
  public void messageCentre() {}
  
  @Given("^user selects invoice$")
  public void redeemPromoCode() {}
  
  @Given("^user selects invoice to pay via paypal$")
  public void payPalOption() {}
  
  @Given("^user selects invoice to pay via credit card$")
  public void creditCardOption() {}
  
  @Given("^user selects invoice to pay via EFT$")
  public void eFTOption() {}
  
  @Given("^user selects invoice to pay via check payment$")
  public void checkPaymentOption() {}
  
  @Given("^user is on download centre page$")
  public void downloadCentre() {}
  
  @Given("^user selects invoice to perform dispute$")
  public void invoiceLevelDispute() {}
  
  @Given("^user selects invoice to perform tracking level dispute$")
  public void trackingLevelDispute() {}
  
  @Given("^user check emails for all region$")
  public void newInvoiceEmail() {}
  
  @Given("^user clicks on logout button$")
  public void logout() {}
}
