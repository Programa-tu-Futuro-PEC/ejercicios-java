function validar(){
    var usuario = document.getElementById("user").value
    var pass = document.getElementById("password").value
    var mensaje = document.getElementById("mensaje")
    if(usuario=="admin" && pass=="123456"){
            mensaje.innerHTML="Datos Correctos"
    } else {
        mensaje.innerHTML="Datos incorrectos"
    }    
}