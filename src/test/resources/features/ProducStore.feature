Feature: Product-Store

  @testStore
  Scenario Outline: Validacion del precio del producto
    Given estoy en la pagina de la tienda
    And me logue con mi usuario <user> y clave <password>
    When nevego en a la categoria <cat> y la subcategoria <sub>
    And agrego dos unidades del primer producto al carrito
    Then valido que el popup la confirmacion del producto agregado
    And valido que el pupup que el monto total sea calculado correctamente
    When finalizo la compra
    Then valido que el titulo de la pagina del carrito
    And vuelvo a validar el calculo de precios en el carrito
    Examples:
      | user                       | password    | cat       | sub   |
      | "cristhianomar9@gmail.com" | "Pocoyo77!" | "CLOTHES" | "Men" |
      | "invalido@gmail.com" | "Invalida!" | "CLOTHES" | "Men" |
      | "cristhianomar9@gmail.com" | "Pocoyo77!" | "Autos" | "Men" |