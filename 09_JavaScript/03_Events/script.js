(function () {
'use strict';

var doLoad = function ()
{
  var input = window.document.getElementById ('input');
  input.oninput = function ()
  {
    window.document.getElementById('title').innerHTML = input.value;
  };

  var email = window.document.getElementById('email');
  email.oninput = function ()
  {
    email.style.backgroundColor = "white";
  };
  email.onblur = function ()
  {
    email.style.backgroundColor = "white";
  };
  email.onchange = function ()
  {
    email.style.backgroundColor = email.checkValidity () ? "#98c379" : "#e06c75";
  };
};

window.onload = doLoad ();

}());
