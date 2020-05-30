<html>
<#include "../zujian/top.ftlh">
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="alert alert-dismissable alert-danger">
                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                <h4>
                    错误提示!
                </h4> <strong>${msg}</strong><a href="${url}" class="alert-link"><span id="time">3</span>s后自动跳转</a>
            </div>
        </div>
    </div>
</div>

</body>

<script>
    var second = 3;
    var time = document.getElementById("time");
    function showTime(){
        second--;
        if (second<=0) {
            location.href="${url}";
        }

        time.innerHTML = second+"";
    }
    setInterval(showTime, 1000);
</script>

</html>