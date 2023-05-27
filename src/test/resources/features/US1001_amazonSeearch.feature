Feature: US1001 Kullanıcı Amazon Sayfasında Arama Yapar

  @Deneme
  Scenario: TC01 kullanici amazonda Nutella aratır

    Given kullanici amazon sayfasina gider
    Then kullanici Nutella icin arama yapar
    And Sonuclarin Nutella içerdigini test eder
    And sayfayi kapatir