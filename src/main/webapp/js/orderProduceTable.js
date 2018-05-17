$(function () {
    var a=new Date();
   // var b=new FormData("yyyy-MM--dd hh:mm:ss");
        var c=getNowFormatDate();
    //alert(c);
})

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
    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
        + " " + date.getHours() + seperator2 + date.getMinutes()
        + seperator2 + date.getSeconds();
    return currentdate;
}

var orderLogTable = function () {
    var oTableInit = {};
    //初始化Table
    oTableInit.Init = function () {
        $('#order_log_table').bootstrapTable({
            url: '/order/all',         //请求后台的URL（*）
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
            pageList: [5 ,10, 25, 50, 100],        //可供选择的每页的行数（*）
            search: false,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
            searchAlign: 'left',
            contentType: "application/x-www-form-urlencoded",
            strictSearch: true,
            showColumns: true,                  //是否显示所有的列
            minimumCountColumns: 2,             //最少允许的列数
            clickToSelect: true,                //是否启用点击选中行
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
                    field: 'oid',
                    visible: true,
                    sortable: true,
                    title: '订单号'
                },
                {
                    field: 'date',
                    title: '时间',
                },
                {
                    field: 'type',
                    title: '日志类型',
                    editable: true,
                    //formatter:blog_url

                }, {
                    field: 'information',
                    title: '内容'

                }, {
                    field: 'result',
                    title: '处理结果',

                },
                // {
                //     field: 'operate',
                //     title: '操作',
                //     events: 'operateEvents',
                //     formatter: edit_btn//自定义方法，添加编辑按钮
                //
                // }

            ],
            // rowStyle: function (row, index) {
            //     var classesArr = ['success', 'info'];
            //     var strclass = "";
            //     if (index % 2 === 0) {//偶数行
            //         strclass = classesArr[1];
            //     } else {//奇数行
            //         strclass = classesArr[1];
            //     }
            //     return { classes: strclass, height:'30px'};
            // },//隔行变色
        });

    };


    // //得到查询的参数
    // oTableInit.queryParams = function (params) {
    //     var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
    //         uId: "1008612"
    //     };
    //     return temp;
    // };
    return oTableInit;
};