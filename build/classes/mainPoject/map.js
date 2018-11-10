var myLatlng = new google.maps.LatLng( "","" );
var marker = new google.maps.Marker({ position: myLatlng, map: map, title: 'Hello World!'});
map.setCenter(myLatlng);
