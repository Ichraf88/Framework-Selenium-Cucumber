
@radio
Feature: Check radio and checkbox
  

  @radio
  Scenario: Check radio and checkbox
    Given Authentification
    When je click sur le radio button1
    Then je vois le radio button1 selectionne
    When je click sr le radio button2 
    Then je vois le radio button2 selectionne
    When je clique sur le checkbox
    Then je vois le checkbox selectionne
