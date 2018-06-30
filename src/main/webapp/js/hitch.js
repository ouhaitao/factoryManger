$(function () {
    $("#date").append(getNowFormatDate());
})

function sub() {
    var uid=$.cookie("username");
    var submit=$.cookie("process");
    var uid=$("#admin").val();
    var phone=$("#phone").val();
    var date=$("#date").text();
    var type=$("#name").val();
    var summary=$("#summary").val();
    var info=$("#info").val();
    var mark=$("#mark").val();
    $.ajax({
        url:"/api/department/repairlist",
        type:"post",
        dataType:"text",
        data:{
            "submit":submit,
            "uid":uid,
            "phone":phone,
            "date":date,
            "type":type,
            "summary":summary,
            "info":info,
            "mark":mark
        },
        success:function (data) {
            alert(data)
        },
        error:function () {
            alert("服务器异常");
        }

    })

}

function getNowFormatDate() {
    var date = new Date();
    var seperator1 = "-";
    var seperator2 = ":";
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate;
    return currentdate;
}