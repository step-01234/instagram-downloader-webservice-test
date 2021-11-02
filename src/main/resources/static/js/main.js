$(function(){

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

    $(".userId").click(function(){
        var param2 = jQuery("#formname2").serialize();

        $.ajax({
            type:"POST",
            url:"/userIdApi",
            data: param2,
            dataType:"json",
        }).done(function(data){
            $("#profile").html("<span>"+ data.graphql.user.id + "</span>");
            $("#profileImage").html("<img src=\""+ data.graphql.user.profile_pic_url_hd + "\">");
            $("#downloadBtn").html("<a href=\""+ data.graphql.user.profile_pic_url_hd + "&dl=1\"> <input type=\"button\" value=\"download\"></a>");
        });
    });
/*             contentType: "application/json; charset=utf-8" */
});