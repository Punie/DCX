/*jshint esversion: 6 */

(function () {
'use strict';

var doLoad = function ()
{
  var imgs = document.getElementsByTagName('img');
  var form1 = document.forms.form1;
  var elems = form1.elem;

  var checkval = function ()
  {
    var empty = this.value === '';
    var val = this.value.trim () !== '';
    var img = this.parentNode.childNodes[3]; // OR var img = this.nextSibling.nextSibling

    if (empty)
    {
      img.style.visibility = 'hidden';
      this.style.backgroundColor = 'initial';
    }
    else
    {
      img.src = val ? 'img/val.png' : 'img/cnl.png';
      img.style.visibility = 'visible';
      this.style.backgroundColor = val ? 'initial' : '#e06c75';
    }
  };

  for (var img of imgs)
  {
    img.style.visibility = 'hidden';
  }

  for (var elem of elems)
  {
    elem.oninput = checkval;
  }

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
