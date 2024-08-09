#language: es
@testfeature
Característica: ProductStore

  @testProductStore
  # Feature: ProductStore
  Escenario: Validación del Precio de un Producto

    Dado estoy en la página de la tienda
    Y me logueo con mi usuario "cristophermiguellp@gmail.com" y clave "AutoWeb123"
    Cuando navego a la categoria "Clothes" y subcategoria "Men"
    Y agrego 2 unidades del primer producto al carrito
    Entonces valido en el popup la confirmación del producto agregado
    Y valido en el popup que el monto total sea calculado correctamente
    Cuando finalizo la compra
    Entonces valido el titulo de la pagina del carrito
    Y vuelvo a validar el calculo de precios en el carrito