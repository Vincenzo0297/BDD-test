package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.jetbrains.annotations.NotNull;
import starter.navigation.NavigateToActions;
import starter.fill.EnterCheckoutDetailsActions;

public class CheckoutStepDefinitions {

    // Navigate to the checkout page
    @Given("{actor} navigates to the checkout page")
    public void userNavigatesToTheCheckoutPage(@NotNull Actor actor) {
        actor.wasAbleTo(NavigateToActions.theCheckoutPage());
    }

    // Enter first name
    @And("{actor} enters first name {string}")
    public void userEntersFirstName(Actor actor, String inputValue) {
        actor.attemptsTo(
                EnterCheckoutDetailsActions.enterFirstName(inputValue)
        );
    }

    // Enter last name
    @And("{actor} enters last name {string}")
    public void userEntersLastName(Actor actor, String inputValue) {
        actor.attemptsTo(
                EnterCheckoutDetailsActions.enterLastName(inputValue)
        );
    }

    // Enter username
    @And("{actor} enters user name {string}")
    public void userEntersUserName(Actor actor, String inputValue) {
        actor.attemptsTo(
                EnterCheckoutDetailsActions.enterUserName(inputValue)
        );
    }

    // Enter email
    @And("{actor} enters email {string}")
    public void userEntersEmail(Actor actor, String inputValue) {
        actor.attemptsTo(
                EnterCheckoutDetailsActions.enterEmail(inputValue)
        );
    }

    // Enter address
    @And("{actor} enters address {string}")
    public void userEntersAddress(Actor actor, String inputValue) {
        actor.attemptsTo(
                EnterCheckoutDetailsActions.enterAddress(inputValue)
        );
    }

    // Select country
    @And("{actor} selects country {string}")
    public void userSelectsCountry(Actor actor, String inputValue) {
        actor.attemptsTo(
                EnterCheckoutDetailsActions.selectCountry(inputValue)
        );
    }

    // Select state
    @And("{actor} selects state {string}")
    public void userSelectsState(Actor actor, String inputValue) {
        actor.attemptsTo(
                EnterCheckoutDetailsActions.selectState(inputValue)
        );
    }

    // Enter ZIP code
    @And("{actor} enters zip code {string}")
    public void userEntersZipCode(Actor actor, String inputValue) {
        actor.attemptsTo(
                EnterCheckoutDetailsActions.enterZipCode(inputValue)
        );
    }

    @And("{actor} toggles the 'same address' checkbox")
    public void userTogglesTheSameAddressCheckbox(Actor actor) {
        actor.attemptsTo(
                EnterCheckoutDetailsActions.toggleSameAddressCheckbox()
        );
    }

    @And("{actor} toggles the 'save info' checkbox")
    public void userTogglesTheSaveInfoCheckbox(Actor actor) {
        actor.attemptsTo(
                EnterCheckoutDetailsActions.toggleSaveInfoCheckbox()
        );
    }

    // Select payment method
    @And("{actor} selects payment method {string}")
    public void userSelectsPaymentMethod(Actor actor, String inputValue) {
        actor.attemptsTo(
                EnterCheckoutDetailsActions.selectPaymentMethod(inputValue)
        );
    }

    // Enter card details
    @And("{actor} enters card name {string}")
    public void userEntersCardName(Actor actor, String inputValue) {
        actor.attemptsTo(
                EnterCheckoutDetailsActions.enterCardName(inputValue)
        );
    }

    @And("{actor} enters credit number {string}")
    public void userEntersCreditNumber(Actor actor, String inputValue) {
        actor.attemptsTo(
                EnterCheckoutDetailsActions.enterCreditNumber(inputValue)
        );
    }

    @And("{actor} enters expiration {string}")
    public void userEntersExpiration(Actor actor, String inputValue) {
        actor.attemptsTo(
                EnterCheckoutDetailsActions.enterExpiration(inputValue)
        );
    }

    @And("{actor} enters cvv {string}")
    public void userEntersCVV(Actor actor, String inputValue) {
        actor.attemptsTo(
                EnterCheckoutDetailsActions.enterCVV(inputValue)
        );
    }

    // Submit form
    @And("{actor} clicks the Submit button")
    public void userClicksTheSubmitButton(Actor actor) {
        actor.attemptsTo(
                EnterCheckoutDetailsActions.clickSubmitButton()
        );
    }

    // Verify no errors
    @Then("{actor} should see no errors")
    public void userShouldSeeNoErrors(Actor actor) {
        actor.attemptsTo(
                Ensure.that(TheWebPage.title()).containsIgnoringCase("Thank you for your purchase") // Example assertion
        );
    }
}
