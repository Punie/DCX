(function () {
'use strict';

  var input = window.document.getElementById ('input');
  input.oninput = function ()
  {
    window.document.getElementById('title').innerHTML = input.value;
  };

}());
