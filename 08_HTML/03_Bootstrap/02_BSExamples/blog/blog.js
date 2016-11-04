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

sub.onclick = function () { doPost (); };

doPost = function ()
{
  totCom += 1;
  curCom += 1;
  var date = new Date ();
  var idCom = 'com' + totCom;
  var idRem = 'btn' + totCom;
  var idEdit = 'edit' + totCom;

  var comStyle = 'com-';
  if (totCom % 2 == 1) comStyle += 'odd';
  else comStyle += 'even';

  numCom.innerHTML = curCom;

  comments.innerHTML +=
    '<li class="list-group-item ' + comStyle + '">' +
      '<div class="media" id="' + idCom + '">' +
        '<span type="button" class="glyphicon glyphicon-remove remove" id="' + idRem + '"></span>' +
        '<span type="button" class="glyphicon glyphicon-pencil edit" id="' + idEdit + '"></span>' +
        '<div class="media-left">' +
          '<img src="img/img_avatar1.png" class="media-object" style="width:60px">' +
        '</div>' +
        '<div class="media-body">' +
          '<h4 class="media-heading">' + user.value + ' <small><i>Posted on ' + date.toLocaleString () + '</i></small></h4>' +
          '<p class="pre-style">' + comment.value + '</p>' +
        '</div>' +
      '</div>' +
    '</li>';

  user.value = "";
  comment.value = "";

  var com = document.getElementById (idCom);
  var rem = document.getElementById (idRem);
  var edit = document.getElementById (idEdit);

  com.setAttribute ("onmouseover", "doShow(this)");
  com.setAttribute ("onmouseout", "doHide(this)");
  rem.setAttribute ("onclick", "doRemove(this)");
  edit.setAttribute ("onclick", "doEdit(this)");
};

doShow = function (elmt)
{
  var btns = elmt.getElementsByTagName ('span');
  for (var i = 0 ; i < btns.length ; ++i)
    btns[i].style.visibility = 'visible';
};

doHide = function (elmt)
{
  var btns = elmt.getElementsByTagName ('span');
  for (var i = 0 ; i < btns.length ; ++i)
    btns[i].style.visibility = 'hidden';
};

doRemove = function (elmt)
{
  curCom -= 1;
  var c = elmt.parentNode.parentNode;

  numCom.innerHTML = curCom;
  c.parentNode.removeChild (c);
};

doEdit = function (elmt)
{
  var comArea = elmt.parentNode.getElementsByTagName ('p')[0];
  var comContent = comArea.innerHTML;
  comArea.innerHTML =
    '<form>' +
      '<div class="form-group">' +
        '<textarea class="form-control">' + comContent + '</textarea>' +
      '</div>' +
      '<div class="form-group">' +
        '<button class="btn btn-primary" type="button" name="button" id="sub">Submit</button>' +
      '</div>' +
    '</form>';
};
