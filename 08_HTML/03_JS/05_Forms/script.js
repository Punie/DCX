(function () {
'use strict';

var doLoad = function ()
{
  var img = document.getElementById('val');
  var form1 = document.forms.form1;
  var elem1 = form1.elem1;

  img.style.visibility = 'hidden';
  elem1.style.backgroundColor = '#e06c75';

  elem1.oninput = function ()
  {
    var val = elem1.value.trim () !== '';

    img.src = val ? 'img/val.png' : 'img/cnl.png';
    img.style.visibility = 'visible';
    elem1.style.backgroundColor = val ? 'initial' : '#e06c75';
  };

  form1.onsubmit = function ()
  {
    return elem1.value.trim () !== '';
  };

  var text = document.getElementById('p1');
  var btn = document.getElementById('btn');

  text.style.visibility = 'visible';
  btn.value = 'Hide';

  btn.onclick = function ()
  {
    if (text.style.visibility == 'visible')
    {
      text.style.visibility = 'hidden';
      btn.value = 'Show';
    }
    else
    {
      text.style.visibility = 'visible';
      btn.value = 'Hide';
    }
  };
};

window.onload = doLoad ();

}());
