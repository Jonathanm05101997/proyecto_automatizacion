#autor: Jonathan Montaño
@stories
Feature: Academy Choucair
As a user,  i want to learn hot to automate in screamplay at the Choucair Academy with the automation course
@scenario1
Scenario: Search for a automation course
  Given Than brandon wnats tolearn automation at the academy Choucair
  | strUser   | strPassword |
  | TuUsuario | TuClave     |
  When He search for the course recursos automation Bancolombia on the Choucair academy platform
  | strCourse              |
  |metodologia Bancolombia |
  Then He finds the course called resources recursos automation Bancolombia