package starter.fill;

import net.serenitybdd.screenplay.targets.Target;

class CheckoutPageObjects {

    // Personal Details Section
    static Target FIRSTNAME_FIELD = Target.the("First name").locatedBy("#firstName");
    static Target LASTNAME_FIELD = Target.the("Last name").locatedBy("#lastName");
    static Target USERNAME_FIELD = Target.the("User name").locatedBy("#username");
    static Target EMAIL_FIELD = Target.the("Email").locatedBy("#email");
    static Target ADDRESS_FIELD = Target.the("Address").locatedBy("#address");

    // Location Details Section
    static Target COUNTRY_DROPDOWN = Target.the("Country dropdown").locatedBy("#country");
    static Target STATE_DROPDOWN = Target.the("State dropdown").locatedBy("#state");
    static Target ZIP_FIELD = Target.the("ZIP code").locatedBy("#zip");

    static Target SAME_ADDRESS_CHECKBOX = Target.the("same address checkbox").locatedBy("#same-address");
    static Target SAVE_INFO_CHECKBOX = Target.the("save info checkbox").locatedBy("#save-info");

    // Payment Details Section
    static Target CREDIT_CARD_RADIO = Target.the("Credit card radio").locatedBy("#credit");
    static Target DEBIT_CARD_RADIO = Target.the("Debit card radio").locatedBy("#debit");
    static Target CARD_NAME_FIELD = Target.the("Card name").locatedBy("#cc-name");
    static Target CREDIT_NUMBER_FIELD = Target.the("Credit number").locatedBy("#cc-number");
    static Target EXPIRATION_FIELD = Target.the("Expiration date").locatedBy("#cc-expiration");
    static Target CVV_FIELD = Target.the("CVV").locatedBy("#cc-cvv");

    // Submit Button
    static Target SUBMIT_BUTTON = Target.the("Submit button").locatedBy("//button[@type='submit']");
}
