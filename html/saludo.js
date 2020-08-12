function saludar(){
    var nombre = document
            .getElementById("usuario")
            .value
    var container = document
            .getElementById("mensaje")
    if(nombre){
        container.innerHTML =
                        "Hola "+nombre
    } else {
        container.innerHTML = "Agrega un nombre de usuario"
    }
}