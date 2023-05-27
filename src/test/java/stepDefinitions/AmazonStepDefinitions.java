package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get("amazonUrl");
    }
    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {

        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }
    @Then("Sonuclarin Nutella içerdigini test eder")
    public void sonucların_nutella_içerdiğini_test_eder() {

        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("Nutella"));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

        Driver.closeDriver();

    }




}
