$(function () {
    $(".head_nav").width($(window).width());
    $(".right_container").width($(window).width()-280);
    $(".left_nav").height($(window).height()-50);
    $(".right_container").height($(window).height()-80);
    $(".left_nav li a").click(function () {
        var val=this.text;
        $("#work_title").empty();
        $("#work_title").append(val);
    })

    var aOTable = new allOrderTable();
    aOTable.Init();

    $("#order_wait").click(function () {
        hide();
        $(".page_table").css('display','block');
    })
    $("#order_produce").click(function () {
        hide();
        $(".page_produce").css('display','block');
        var logTable=new orderLogTable();
        logTable.Init();
    })
    $("#malfunction").click(function () {
        hide();
        $(".malfunction").css('display','block');
        var table=new malTable();
        table.Init();
    })
    $("#employee").click(function () {
        hide();
        $(".employee").css('display','block');
        var table=new empTable();
        table.Init();
    })
    $("#quality").click(function () {
        hide();
        $(".quality").css('display','block');
        var table=new quaTable();
        table.Init();
    })
    $(".data_admin").click(function () {
        hide();
        $(".data").css('display','block');
        $("#work_title").empty();
        $("#work_title").append("数据统计");
        initDataPic();
    })




    $("#more_btn").click(function () {
        if ($("#more_span").hasClass("icon-caret-down")){
            $("#more_span").removeClass("icon-caret-down").addClass("icon-caret-up");
        }else {
            $("#more_span").removeClass("icon-caret-up").addClass("icon-caret-down");
        }
    })

})



window.onresize = function(){
    // $(".head_nav").width($(window).width());
    // $(".left_nav").height($(window).height()-50);
    // $(".right_container").height($(window).height()-50);
}

function hide() {
    $(".page_table").css('display','none');
    $(".page_produce").css('display','none');
    $(".malfunction").css('display','none');
    $(".employee").css('display','none');
    $(".quality").css('display','none');
    $(".data").css('display','none');
}

