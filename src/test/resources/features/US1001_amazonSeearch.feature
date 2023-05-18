Feature: US1001 Kullanıcı Amazon Sayfasında Arama Yapar

  Scenario: TC01 kullanici amazonda Nutella aratır

    Given kullanıcı amazon sayfasına gider
    Then kullanıcı Nutella için arama yapar
    And Sonuçların Nutella içerdiğini test eder
    And sayfayı kapatır