@cnx
Feature: Authentification-Orange
  Entant que utilisateur je souhaite m'enthentifier

  @cnx
  Scenario: Authentification-Orange
    Given ouvrir l application Orange
    When saisir non utilisateur
    And saisir mot de passe
    And cliquer sur bouton login
    Then redirection vers la page home
