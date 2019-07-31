var loginBox = new Vue({
    el: "#login-box",
    data: {
        userIcon: "../img/icon.jpg",
        loginDisplay: true,
        loginUsername: "",
        loginPassword: "",
        message:""
    },
    computed: {
        title: {
            get: function() {
                if (this.loginDisplay) {
                    this.message="立即登录";
                    return "登录";
                } else {
                    this.message="立即注册";
                    return "注册";
                }
            },
            set:function(val){
                this.message=val;
            }
        },
        subTitle: function() {
            if (this.loginDisplay) {
                return "立即注册";
            } else {
                return "立即登录";
            }
        }
    },
    methods: {
        switchLoginRegister: function() {
            this.loginDisplay = !this.loginDisplay
        },
        doLogin: function() {
            loginByUsername(this.loginUsername, this.loginPassword);
        }
    }
})


function loginByUsername(param1, param2) {

    console.log("登录")
    var url="/login";
    var param={
        username:param1,
        password:param2
    }

    $.ajax({
        url:url,
        data:param,
        type:"post",
        dataType:"json",
        success:function (result) {
            console.log(result)
            loginBox.message=result.data;
            setTimeout(function () {
                window.location.href="http://www.baidu.com";
            },1000)
        }
    })

    console.log(param1 + "  " + param2);
    setTimeout(function(){
        loginBox.message="欢迎登录";
    },2000)
}

$(function() {
    document.oncopy = function() {
        return false;
    }
    document.onselectstart = function() {
        return false;
    }
})
