var inname = document.getElementById("name");
var pwd = document.getElementById("password");
var pwd_con = document.getElementById("password_confirm");
var email = document.getElementById("email");
var phone_number = document.getElementById("phone_number");
var name_p = document.getElementById("name_p");
var pwd_p = document.getElementById("password_p");
var pwd_con_p = document.getElementById("password_confirm_p");
var email_p = document.getElementById("email_p");
var phone_number_p = document.getElementById("phone_number_p");

var j = document.getElementsByTagName("input");

//合法性检验函数
for (var i=0; i<j.length; i++) {
    j[i].onblur = function(){
        valiDataName();
        valiDataPassword();
        valiDataPasswordConfirm();
        valiDataEmail();
        valiDataPhone();
    }
}

//验证名称
function valiDataName() {
    if (inname.value.length < 4 || inname.value.length >16) {
        name_p.innerHTML = "必填，长度为4~16个字符";
        name_p.style.color = "red";
        inname.style.border = "solid red";
        return false;
    } else if(inname.value.length >= 4 || inname.value.length <= 16) {
        name_p.innerHTML = "名称合法";
        name_p.style.color = "#888";
        inname.style.borderColor = "black";
        return true;
    }
}

function valiDataPassword() {
    if (pwd.value.length == "") {
        pwd_p.innerHTML = "密码不可为空";
        pwd.style.border = "solid red";
        pwd_p.style.color = "red";
        return false;
    } else{
        pwd_p.innerHTML = "密码合法";
        pwd_p.style.color = "#888";
        pwd.style.borderColor = "black";
        return true;
    }
}

function valiDataPasswordConfirm() {
    if (pwd.value != pwd_con.value) {
        pwd_con_p.innerHTML = "两次密码不一致";
        pwd_con_p.style.color = "red";
        pwd_con.style.border = "solid red";
        return false;
    } else {
        pwd_con_p.innerHTML = "密码合法";
        pwd_con_p.style.color = "#888";
        pwd_con.style.borderColor = "black";
        return true;
    }
}

function valiDataEmail() {
    var code = /^[a-z0-9]([a-z0-9]*[-_]?[a-z0-9]+)*@([a-z0-9]*[-_]?[a-z0-9]+)+[\.][a-z]{2,3}([\.][a-z]{2})?$/;
    if (email.value != "") {
        if (!code.test(email.value)) {
            email_p.innerHTML = "邮箱格式有误";
            email_p.style.color = "red";
            email.style.border = "solid red";
            return false;
        } else {
            email_p.innerHTML = "邮箱格式合法";
            email_p.style.color = "#888";
            email.style.border = " solid black";
            return true;
        }
    } else {
        email_p.innerHTML = "邮箱不可为空";
        email_p.style.color = "red";
        email.style.border = "solid red";
        return false;
    }
}

function valiDataPhone() {
    var check_code = /^1[3|4|5|7|8][0-9]\d{8}$/;
    if (phone_number.value != "") {
        if (!check_code.test(phone_number.value)) {
            phone_number_p.innerHTML = "手机号格式有误";
            phone_number_p.style.color = "red";
            phone_number.style.border = "solid red";
            return false;
        } else {
            phone_number_p.innerHTML = "手机号格式合法";
            phone_number_p.style.color = "#888";
            phone_number.style.border = "solid black";
            return true;
        }
    } else {
        phone_number_p.innerHTML = "手机号不可为空";
        phone_number_p.style.color = "red";
        phone_number.style.border = "solid red";
        return false;
    }
}

function checkIfValid() {
    if (valiDataName() && valiDataPassword() && valiDataPasswordConfirm() && valiDataEmail() && valiDataPhone()) {
        alert("提交成功");
    } else {
        alert("提交失败");
        return false;
    }
}

function check() {
    var name = document.getElementById("name").value;
    var pwd = document.getElementById("password").value;

    if (name == "admin" && pwd == "123456") {
        alert("登录成功！");
    } else {
        alert("密码错误，请重新输入");
        window.location.href = "index.jsp";
    }
}