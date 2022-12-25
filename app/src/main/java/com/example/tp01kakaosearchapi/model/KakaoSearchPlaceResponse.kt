package com.example.tp01kakaosearchapi.model

data class KakaoSearchPlaceResponse(var meta:PlaceMeta , var documents:MutableList<Place>)

data class PlaceMeta(var total_count:Int, var pageable_count:Int, var is_end:Boolean)

data class Place(
    var id:String,
    var place_name:String,
    var category_name:String,
    var phone:String,
    var address_name:String,
    var road_address_name:String,
    var x:String,
    var y:String,
    var place_url:String,
    var distance:String //중심 좌표로부터 거리, 단위 meter [단, 요청파라미터로 x,y를 줬을때만 값이 존재함]

)
