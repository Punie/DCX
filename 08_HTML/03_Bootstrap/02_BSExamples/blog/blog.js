(function () {
'use strict';

var doLoad = function ()
{
  var user = document.getElementById('user');
  var comment = document.getElementById('comment');
  var comments = document.getElementById('comments');
  var sub = document.getElementById('sub');
  var count = 0;

  sub.onclick = function ()
  {
    count += 1;
    var date = new Date();

    if (count % 2 == 1)
    {
      comments.innerHTML =
        '<li class="list-group-item list-group-item-info">' +
          '<div class="media" onmouseover="mouseover(this)" onmouseout="mouseout(this)">' +
          '<span type="button" class="glyphicon glyphicon-remove remove" onclick="clicked(this)"></span>' +
            '<div class="media-left">' +
              '<img src="img/img_avatar1.png" class="media-object" style="width:60px">' +
            '</div>' +
            '<div class="media-body">' +
              '<h4 class="media-heading">' + user.value + ' <small><i>Posted on ' + date.toLocaleString() + '</i></small></h4>' +
              '<p>' + comment.value + '</p>' +
            '</div>' +
          '</div>' +
        '</li>' + comments.innerHTML;
    }
    else
    {
      comments.innerHTML =
        '<li class="list-group-item list-group-item-success">' +
          '<div class="media" onmouseover="mouseover(this)" onmouseout="mouseout(this)">' +
            '<span type="button" class="glyphicon glyphicon-remove remove" onclick="clicked(this)"></span>' +
            '<div class="media-body">' +
              '<h4 class="media-heading">' + user.value + ' <small><i>Posted on ' + date.toLocaleString() + '</i></small></h4>' +
              '<p>' + comment.value + '</p>' +
            '</div>' +
            '<div class="media-left">' +
              '<img src="img/img_avatar2.png" class="media-object" style="width:60px">' +
            '</div>' +
          '</div>' +
        '</li>' + comments.innerHTML;
    }

    user.value = "";
    comment.value = "";
  };

};

window.onload = doLoad ();

}());
