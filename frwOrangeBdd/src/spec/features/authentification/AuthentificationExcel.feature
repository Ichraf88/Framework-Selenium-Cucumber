@exl
Feature: Authentification Excel - Orange 
  Je souhaite me connecter via un fichier Excel

  @exl
  Scenario: Authentification Excel - Orange 
     Given ouvrir l application Orange 
     When se connecter sur l'application Orange
     Then redirection vers la page home
   
