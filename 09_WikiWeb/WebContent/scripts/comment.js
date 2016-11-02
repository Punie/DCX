/*jshint esversion: 6 */

(function () {
'use strict';

var doLoad = function ()
{
  var comArea = document.getElementById('comments');
  var form = document.forms.form;
  var txtArea = form.comment;
  var subBtn = document.getElementById('sub');

  subBtn.onclick = function ()
  {
    comArea.innerHTML += "<p class=\"comments\">" + txtArea.value + "</p>";
  };

};

window.onload = doLoad ();

}());
