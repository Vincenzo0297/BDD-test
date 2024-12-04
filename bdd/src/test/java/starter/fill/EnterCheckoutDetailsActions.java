package starter.fill;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class EnterCheckoutDetailsActions {

    public static Performable enterFirstName(String firstName) {
        return Task.where("{0} enters first name '" + firstName + "'",
                Enter.theValue(firstName).into(CheckoutPageObjects.FIRSTNAME_FIELD),
                Hit.the(Keys.ENTER).into(CheckoutPageObjects.FIRSTNAME_FIELD)
        );
    }

    public static Performable enterLastName(String lastName) {
        return Task.where("{0} enters last name '" + lastName + "'",
                Enter.theValue(lastName).into(CheckoutPageObjects.LASTNAME_FIELD),
                Hit.the(Keys.ENTER).into(CheckoutPageObjects.LASTNAME_FIELD)
        );
    }

    public static Performable enterUserName(String userName) {
        return Task.where("{0} enters user name '" + userName + "'",
                Enter.theValue(userName).into(CheckoutPageObjects.USERNAME_FIELD),
                Hit.the(Keys.ENTER).into(CheckoutPageObjects.USERNAME_FIELD)
        );
    }

    public static Performable enterEmail(String email) {
        return Task.where("{0} enters email '" + email + "'",
                Enter.theValue(email).into(CheckoutPageObjects.EMAIL_FIELD),
                Hit.the(Keys.ENTER).into(CheckoutPageObjects.EMAIL_FIELD)
        );
    }

    public static Performable enterAddress(String address) {
        return Task.where("{0} enters address '" + address + "'",
                Enter.theValue(address).into(CheckoutPageObjects.ADDRESS_FIELD),
                Hit.the(Keys.ENTER).into(CheckoutPageObjects.ADDRESS_FIELD)
        );
    }

    public static Performable selectCountry(String country) {
        return Task.where("{0} selects country '" + country + "'",
                SelectFromOptions.byVisibleText(country).from(CheckoutPageObjects.COUNTRY_DROPDOWN)
        );
    }

    public static Performable selectState(String state) {
        return Task.where("{0} selects state '" + state + "'",
                SelectFromOptions.byVisibleText(state).from(CheckoutPageObjects.STATE_DROPDOWN)
        );
    }

    public static Performable enterZipCode(String zipCode) {
        return Task.where("{0} enters zip code '" + zipCode + "'",
                Enter.theValue(zipCode).into(CheckoutPageObjects.ZIP_FIELD),
                Hit.the(Keys.ENTER).into(CheckoutPageObjects.ZIP_FIELD)
        );
    }

    public static Performable toggleSameAddressCheckbox() {
        return Click.on(CheckoutPageObjects.SAME_ADDRESS_CHECKBOX);
    }

    public static Performable toggleSaveInfoCheckbox() {
        return Click.on(CheckoutPageObjects.SAVE_INFO_CHECKBOX);
    }

    public static Performable selectPaymentMethod(String paymentMethod) {
        System.out.println("paymentMethod: " + paymentMethod);
        if (paymentMethod.toLowerCase().contains("credit")) {
            return Task.where("{0} selects payment method 'credit'",
                    Click.on(CheckoutPageObjects.CREDIT_CARD_RADIO)
            );
        } else {
            return Task.where("{0} selects payment method 'debit'",
                    Click.on(CheckoutPageObjects.DEBIT_CARD_RADIO)
            );
        }
    }

    public static Performable enterCardName(String card) {
        return Task.where("{0} enters card name '" + card + "'",
                Enter.theValue(card).into(CheckoutPageObjects.CARD_NAME_FIELD),
                Hit.the(Keys.ENTER).into(CheckoutPageObjects.CARD_NAME_FIELD)
        );
    }

    public static Performable enterCreditNumber(String credit) {
        return Task.where("{0} enters credit number '" + credit + "'",
                Enter.theValue(credit).into(CheckoutPageObjects.CREDIT_NUMBER_FIELD),
                Hit.the(Keys.ENTER).into(CheckoutPageObjects.CREDIT_NUMBER_FIELD)
        );
    }

    public static Performable enterExpiration(String expiration) {
        return Task.where("{0} enters expiration '" + expiration + "'",
                Enter.theValue(expiration).into(CheckoutPageObjects.EXPIRATION_FIELD),
                Hit.the(Keys.ENTER).into(CheckoutPageObjects.EXPIRATION_FIELD)
        );
    }

    public static Performable enterCVV(String cvv) {
        return Task.where("{0} enters cvv '" + cvv + "'",
                Enter.theValue(cvv).into(CheckoutPageObjects.CVV_FIELD),
                Hit.the(Keys.ENTER).into(CheckoutPageObjects.CVV_FIELD)
        );
    }

    public static Performable clickSubmitButton() {
        return Task.where("{0} clicks the Submit button",
                Click.on(CheckoutPageObjects.SUBMIT_BUTTON)
        );
    }
}
//Action
//Step 4