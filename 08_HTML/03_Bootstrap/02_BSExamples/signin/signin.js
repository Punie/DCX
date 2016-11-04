(function () {

var doLoad = function ()
{
  var inputEmail = document.getElementById('inputEmail');
  var ok = document.getElementById('ok');
  var ko = document.getElementById('ko');

  inputEmail.onchange = function ()
  {
    if (inputEmail.checkValidity())
    {
      ko.style.visibility = 'hidden';
      ok.style.visibility = 'visible';
    }
    else
    {
      ok.style.visibility = 'hidden';
      ko.style.visibility = 'visible';
    }
  };
};

window.onload = doLoad ();

}());
