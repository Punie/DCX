function mouseover(el)
{
  var btn = el.getElementsByTagName('span');
  btn[0].style.visibility = 'visible';
}

function mouseout(el)
{
  var btn = el.getElementsByTagName('span');
  btn[0].style.visibility = 'hidden';
}

function clicked(el)
{
  var comment = el.parentNode.parentNode;
  comment.parentNode.removeChild(comment);
}
