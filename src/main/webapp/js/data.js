$(function () {
initDataPic();
})

function initDataPic() {
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));

// 指定图表的配置项和数据
    var option = {
        title: {
            text: '最近七天生产记录'
        },
        tooltip: {},
        legend: {
            data:['产量']
        },
        xAxis: {
            data: ["5.9","5.10","5.11","5.12","5.13","5.14","5.15"]
        },
        yAxis: {},
        series: [{
            name: '产量',
            type: 'bar',
            data: [5, 20, 36, 10, 10, 20,30]
        }]
    };
    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);


    var produce_line=echarts.init(document.getElementById('produce_line'));
    option = {
        xAxis: {
            type: 'category',
            data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
        },
        yAxis: {
            type: 'value'
        },
        series: [{
            data: [820, 932, 901, 934, 1290, 1330, 1320],
            type: 'line'
        }]
    };
    produce_line.setOption(option);




    var myChart2 = echarts.init(document.getElementById('exception'));
    option = {
        title: {
            text: '最近一月异常信息统计'
        },
        series : [
            {
                name: '异常类型',
                type: 'pie',
                radius: '55%',
                data:[
                    {value:235, name:'视频广告'},
                    {value:274, name:'联盟广告'},
                    {value:310, name:'邮件营销'},
                    {value:335, name:'直接访问'},
                    {value:400, name:'搜索引擎'}
                ]
            }
        ]
    };
    myChart2.setOption(option);


}