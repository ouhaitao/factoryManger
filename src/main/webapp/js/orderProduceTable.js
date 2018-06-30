$(function () {
    getOrderModel();

})

function getProduces() {
    var oid;
    var process = "0";
    var url = "/api/process/" + process + "/ordermodel";
    $.ajax({
        url:url,
        type:"get",

    })
}

function getOrderModel() {
    var oid;
    var process = $.cookie("process");
    var url = "/api/process/" + process + "/ordermodel";
    $.ajax({
        url: url,
        type: "get",
        dataType: "text",
        success: function (data) {
            var order = JSON.parse(data);
            var orderId = $("#orderId");
            var orderSize = $("#orderSize");
            var needNum = $("#needNum");
            var produceNum = $("#produceNum");
            var ordeerState = $("#orderState");
            var orderRate = $("#orderRate");

            $.cookie("oid",order.id,{path:"/"});
            orderId.append(order.id);
            orderSize.append(order.osize);
            needNum.append(order.productNum);
            produceNum.append(order.producenum);
            ordeerState.append(order.state);
            orderRate.append(order.rate);

            var rTable = new rateTable(order.id);
            rTable.Init();
            $("#oid").append(order.id);
            $("#aid").append("1008610");
            $("#date").append(getNowFormatDate());
        },
        error: function () {

        }
    });
    return oid;
}

function submitRate() {
    var oid = $("#oid").text();
    var aid = $("#aid").text();
    var date = $("#date").text();
    var pnum=$("#pnum").val();
    var consume=$("#consume").val();
    var scrap=$("#scrap").val();
    var data=JSON.stringify({
        "date":date,
        "num":pnum,
        "uid":aid,
        "consume":consume,
        "scrap":scrap
    });
    var url="/api/order/"+oid+"/process/0/rate";
    $.ajax({
        url:url,
        type:"post",
        dataType:"text",
        contentType:"application/json",
        data:data,
        success:function (data) {
            alert(data);
        },
        error:function () {

        }

    })

}

function quality() {
    var oId=$("#orderId").text();
    var uid=$.cookie("username");
   $.ajax({
       url:"/api/order/"+oId+"/process/0/state",
       type:"put",
       dataType:"text",
       contentType:"application/json",
       data:JSON.stringify({
           "operate":"quality",
           "uid":"1008610"
       }),
       success:function (data) {
           alert(data);
       },
       error:function (data) {
           
       }
   })
}
function store() {
    var oId=$("#orderId").text();
    var uid=$.cookie("username");
    $.ajax({
        url:"/api/order/"+oId+"/process/0/state",
        type:"put",
        dataType:"text",
        contentType:"application/json",
        data:JSON.stringify({
            "operate":"store",
            "uid":"1008610"
        }),
        success:function (data) {
            alert(data);
        },
        error:function (data) {

        }
    })
}


var rateTable = function (oid) {
    var oTableInit = {};
    var url = "/api/order/" + oid + "/process/0/rates";
    //初始化Table
    oTableInit.Init = function () {
        $('#rateTable').bootstrapTable({
            url: url,         //请求后台的URL（*）
            method: 'get',                      //请求方式（*）
            toolbar: '#toolbar',                //工具按钮用哪个容器
            striped: true,                      //是否显示行间隔色
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true,                   //是否显示分页（*）
            sortable: true,                     //是否启用排序
            sortOrder: "asc",                   //排序方式
            queryParams: {"state": "all"},//传递参数（*）
            sidePagination: "client",           //分页方式：client客户端分页，server服务端分页（*）
            pageNumber: 1,                       //初始化加载第一页，默认第一页
            pageSize: 5,                       //每页的记录行数（*）
            pageList: [5, 10, 25, 50, 100],        //可供选择的每页的行数（*）
            search: false,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
            searchAlign: 'left',
            contentType: "application/x-www-form-urlencoded",
            strictSearch: true,
            showColumns: true,                  //是否显示所有的列
            minimumCountColumns: 2,             //最少允许的列数
            clickToSelect: true,                //是否启用点击选中行
            // width:400,
            //height: 800,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            // uniqueId: "id",                     //每一行的唯一标识，一般为主键列
            showToggle: false,                    //是否显示详细视图和列表视图的切换按钮
            showColumns: false,                          //是否显示内容列下拉框。
            showRefresh: false,                    //是否显示刷新按钮。
            cardView: false,                    //是否显示详细视图
            detailView: false,                   //是否显示父子表
            editable: true,
            columns: [
                {
                    field: 'id',
                    visible: true,
                    sortable: true,
                    title: '订单号'
                },
                {
                    field: 'date',
                    title: '时间',
                },
                {
                    field: 'produce',
                    title: '生产数量',
                    editable: true,
                    //formatter:blog_url

                },

            ],

        });

    };

    return oTableInit;
};
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