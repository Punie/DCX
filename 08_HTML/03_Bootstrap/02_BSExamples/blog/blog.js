var numCom = document.getElementById ('com-number');   // Badge displaying comment number
var user = document.getElementById ('user');          // User field in form
var comment = document.getElementById ('comment');    // Comment field in form
var comments = document.getElementById ('comments');  // Comment block in document
var sub = document.getElementById ('sub');            // Submit button
var totCom = 0;
var curCom = 0;

var doPost;                                           // Post comment method
var doShow;                                           // Show remove button
var doHide;                                           // Hide remove button
var doRemove;                                         // Remove comment method

sub.onclick = function () { doPost(); };

doPost = function ()
{
  totCom += 1;
  curCom += 1;
  var date = new Date ();
  var idCom = 'com' + totCom;
  var idBtn = 'btn' + totCom;

  var comStyle = 'com-';
  if (totCom % 2 == 1) comStyle += 'odd';
  else comStyle += 'even';

  numCom.innerHTML = curCom;

  comments.innerHTML +=
    '<li class="list-group-item ' + comStyle + '">' +
      '<div class="media" id="' + idCom + '">' +
        '<span type="button" class="glyphicon glyphicon-remove remove" id="' + idBtn + '"></span>' +
        '<div class="media-left">' +
          '<img src="img/img_avatar1.png" class="media-object" style="width:60px">' +
        '</div>' +
        '<div class="media-body">' +
          '<h4 class="media-heading">' + user.value + ' <small><i>Posted on ' + date.toLocaleString() + '</i></small></h4>' +
          '<p>' + comment.value + '</p>' +
        '</div>' +
      '</div>' +
    '</li>';

  user.value = "";
  comment.value = "";

  var com = document.getElementById(idCom);
  var btn = document.getElementById(idBtn);

  com.setAttribute("onmouseover", "doShow(this)");
  com.setAttribute("onmouseout", "doHide(this)");
  btn.setAttribute("onclick", "doRemove(this)");
};

doShow = function (elmt)
{
  var b = elmt.getElementsByTagName('span');
  b[0].style.visibility = 'visible';
};

doHide = function (elmt)
{
  var b = elmt.getElementsByTagName('span');
  b[0].style.visibility = 'hidden';
};

doRemove = function (elmt)
{
  curCom -= 1;
  var c = elmt.parentNode.parentNode;

  numCom.innerHTML = curCom;
  c.parentNode.removeChild(c);
};
