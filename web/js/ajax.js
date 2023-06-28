function getData(url) {
      var req = new XMLHttpRequest();
      req.open("get", "http://localhost:8080/sys/" + url);
      req.onload=function () {
          var content = document.getElementById("content");
          content.innerHTML = this.responseText;
      }
      req.send();
}