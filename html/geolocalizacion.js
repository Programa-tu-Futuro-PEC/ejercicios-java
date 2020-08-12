function obtenerUbicacion(){
    if(navigator.geolocation){
        navigator.geolocation.getCurrentPosition(
            function(position){
                var lat = document.getElementById("latitud");
                var long = document.getElementById("longitud");
                lat.innerHTML = position.coords.latitude;
                long.innerHTML = position.coords.longitude;
            }
        );
    }
    else{
        console.log("su navegador no soporta geolocalizacion");
    }
}