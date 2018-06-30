$(function () {
    var table=new logTable();
    table.Init();
})

var logTable = function () {
    var oTableInit = {};
    var process=$.cookie("process");
    var oid=$.cookie("oid");
    var url = "/api/order/" + oid + "/process/"+process+"/logs";
    //初始化Table
    oTableInit.Init = function () {
        $('#logs_table').bootstrapTable({
            url: url,         //请求后台的URL（*）
            method: 'get',                      //请求方式（*）
            toolbar: '#toolbar',                //工具按钮用哪个容器
            striped: true,                      //是否显示行间隔色
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true,                   //是否显示分页（*）
            sortable: true,                     //是否启用排序
            sortOrder: "asc",                   //排序方式
            queryParams: {"type": "%"},//传递参数（*）
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
                    title: '日志'
                },
                {
                    field: 'date',
                    title: '时间',
                },
                {
                    field: 'type',
                    title: '日志类型',
                    editable: true,
                    formatter:log_type

                },
                {
                    field: 'information',
                    title: '内容'
                },{
                    field:'result',
                    title:'处理结果'
                }

            ],
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
function log_type(value,column,index) {
    switch (value){
        case 1:
            return "原料管理";
            break;
        case 2:
            return "生产进度更新";
            break;
        case 3:
            return "质检";
            break;
        case 4:
            return "维修";
            break;
        case 5:
            return "异常";
            break;
    }
}