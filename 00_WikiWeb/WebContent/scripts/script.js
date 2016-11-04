(function () {
'use strict';

  var pwd = window.document.getElementById('pwd');
  var meter = window.document.getElementById ('meter');
  var pwdlvl = window.document.getElementById('pwdlvl');

  pwd.oninput = function ()
  {
    var l = pwd.value.length;

    if (l < 3) {
      meter.value = 0;
      pwdlvl.innerHTML = "Very Bad";
    } else if (l < 5) {
      meter.value = 1;
      pwdlvl.innerHTML = "Bad";
    } else if (l < 7) {
      meter.value = 2;
      pwdlvl.innerHTML = "Medium";
    } else if (l < 12) {
      meter.value = 3;
      pwdlvl.innerHTML = "Good";
    } else {
      meter.value = 4;
      pwdlvl.innerHTML = "Very Good";
    }
  };

}());
