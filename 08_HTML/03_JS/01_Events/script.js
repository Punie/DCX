(function () {
'use strict';

  var title = window.document.getElementById('title');
  var input = window.document.getElementById ('input');

  input.oninput = function ()
  {
    title.innerHTML = input.value;
  };

}());
