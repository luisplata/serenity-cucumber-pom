Feature: : Inicio de sesion

  @InicioSesion
  Scenario: Iniciar sesion exitosamente
    Given que el usuario navega a la pagina de inicio de sesion
    When ingresa las credenciales de acceso correctas
    Then deberia ver la pagina principal