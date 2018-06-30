window.operateEvents = {

};

var empTable = function () {
    var oTableInit = {};
    //初始化Table
    oTableInit.Init = function () {
        $('#emp_table').bootstrapTable({
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
                    field: 'id',
                    visible: true,
                    sortable: true,
                    title: '报告单号'
                },
                {
                    field: 'declare',
                    title: '申报部门',
                },
                {
                    field: 'date',
                    title: '申报时间',
                    editable: true,
                    //formatter:blog_url

                }, {
                    field: 'empname',
                    title: '员工姓名'

                }, {
                    field: 'empid',
                    title: '员工工号',

                },{
                    field: 'type',
                    title: '事务类型',

                },{
                    field: 'stop',
                    title: '是否停工',

                },{
                    field: 'summary',
                    title: '问题描述',

                },{
                    field: 'result',
                    title: '处理结果',

                }
            ],
        });
    };

    return oTableInit;
};

function edit_btn(value, row, index) {
    return '<button class="btn btn-default" id="produce"><a href="javascript:;" class=""  data-toggle="modal" data-target="#myModal">生产</a></button>';
}

function delete_btn() {
    return '<a  href="javascript:;" class="delete">删除</a>';
}

function blog_url(value, row, index) {
    return '<a href="' + '/u/' + row.uid + '/p/' + row.bid + '" style="color: #0f0f0f">' + row.btitle + '</a>';
}