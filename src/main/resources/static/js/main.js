$(function(){
/*
    $(".userProfile").click(function(){
        var param1 = jQuery("#formname1").serialize();

        $.ajax({
            type:"POST",
            url:"/userNameApi",
            data: param1,
            dataType:"json",
        }).done(function(data){
            var obj = JSON.parse(data);
            $("#profile").html("<img src=" + obj.graphql.user.profile_pic_url_hd + ">");
        });
    });
*/
    $(".userProfile").click(function(){
        var param1 = jQuery("#formname1").serialize();

        $.ajax({
            type:"GET",
            url:"/userIdApi",
            data: param1,
            dataType:"json",
        }).done(function(data){

            $("#profile").html("<div class=\"vv\"><b>DOWNLOAD !</b></div><a href=\""+ data.graphql.user.profile_pic_url_hd + "&dl=1\"> <input type=\"button\" class=\"nn\" value=\"Profile Image\"></a>");

       //     $("#profile").html("<img src=\"/images/1.jpeg\">");
       //     $("#downloadBtn").html("<a href=\""+ data.graphql.user.profile_pic_url_hd + "&dl=1\"> <input type=\"button\" value=\"download\"></a>");
        });
    });


    $(".userId").click(function(){
        var param2 = jQuery("#formname2").serialize();

        $.ajax({
            type:"GET",
            url:"/userIdApi",
            data: param2,
            dataType:"json",
        }).done(function(data){

            $("#profile").html("<div class=\"vv\"><b>HERE !</b></div><span>"+ data.graphql.user.id + "</span>");

        });
    });
/*             contentType: "application/json; charset=utf-8" */
});