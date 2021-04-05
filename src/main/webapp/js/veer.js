var url_login = "web/visitor/toLogin"; //去登录
var url_sign = "web/visitor/toRegister"; //去注册
var url_fw = "/guarantee.html"; //去服务页面


//赋予登录事件
var list_login = document.getElementsByClassName('qsub-login');
for (var i = 0; i < list_login.length; i++) {
    console.log(i)
    list_login[i].onclick = function() {
        console.log("登录事件")
        window.location.href = url_login;
    }
}




//赋予注册事件
var list_sign = document.getElementsByClassName('qsub-sign');
for (var i = 0; i < list_sign.length; i++) {
    console.log(i)
    list_sign[i].onclick = function() {
        console.log("注册事件")
        window.location.href = url_sign;
    }
}

//赋予跳转服务事件
var list_fw = document.getElementsByClassName('qsub-fw');
for (var i = 0; i < list_fw.length; i++) {
    console.log(i)
    list_fw[i].onclick = function() {
        window.location.href = url_fw;
    }
}