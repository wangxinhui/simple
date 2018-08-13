<html>

<link href="layui/css/layui.css" rel="stylesheet" media="all">
<script src="js/jquery-1.11.2.min.js" type="text/javascript"></script>
<script src="layui/layui.js" type="text/javascript"></script>
<body>
<h2>Hello World!</h2>
<input name="date" class="layui-input" id="date" type="text" placeholder="yyyy-MM-dd" autocomplete="on"
       lay-verify="date">
<h2>Hello World!</h2>
<h2>Hello World!</h2>
<h2>Hello World!</h2>
<h2>Hello World!</h2>
<h2>Hello World!</h2>
<h2>Hello World!</h2>
<h2>Hello World!</h2>
<h2>Hello World!</h2>
<h2>Hello World!</h2>
<h2>Hello World!</h2>
<h2>Hello World!</h2>
<h2>Hello World!</h2>
<h2>Hello World!</h2>
<h2>Hello World!</h2>
<h2>Hello World!</h2>
<h2>Hello World!</h2>
<h2>Hello World!</h2>
<h2>Hello World!</h2>
<h2>Hello World!</h2>
<h2>Hello World!</h2>
</body>
<script>

    layui.use('laydate', function () {
        var laydate = layui.laydate;
        //执行一个laydate实例
        laydate.render({
            elem: '#date' //指定元素
            , type: 'month'
            , theme: '#337ab7'
            , format: 'yyyy年MM月'
            , change: function (value, date, endDate) {
                console.log(date);
                console.log(laydate.render);
            }
        });
    });
</script>
</html>
