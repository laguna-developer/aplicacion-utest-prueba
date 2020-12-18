Feature: Registro de usuario utest
  Yo como usuario de la pagina utest
  Ncesito registrarme en dicha pagina
  Para pertenecer a la comunidad de probadores


  Scenario: Registro de usuario en la comunidad de probadores utest
    Given que Nicolas Alvarino se encuentra en el Home de la pagina
    When el se registra con sus datos
      | firsName | lastName | emailAddress       | month  | day | year | languages | password   |
      | Katya    | Alvarino | isabel@hotmail.com | August | 3   | 2000 | spanish   | Katya@2011 |
    Then el deberia ver el Mensaje: Welcome to the world's largest community of freelance software testers!