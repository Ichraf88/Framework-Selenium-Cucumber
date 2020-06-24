@atl
Feature: Authentification - Orange - Outline
  Je souhaite m'identifier

  @atl
  Scenario Outline: Authentification - Orange - Outline
    Given Lancer l'application Orange
    When je saisie mon identifiant "<identifiants>"
    When je saisie mon Mot de passe "<password>"
    When je clique sur login
   

    Examples: 
      | identifiants  | password  | 
      | Admin         | admin123  | 
      | Ichraf        | Ichraf123 | 
