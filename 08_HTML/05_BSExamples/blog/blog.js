(function () {
'use strict';

var doLoad = function ()
{
  var comment = document.getElementById('comment');
  var comments = document.getElementById('comments');
  var sub = document.getElementById('sub');
  var count = 0;

  sub.onclick = function ()
  {
    count += 1;
    if (count % 2 == 1)
    {
      comments.innerHTML +=
        '<li class="list-group-item">' +
          '<div class="media">' +
            '<div class="media-body">' +
              '<h4 class="media-heading">John Doe <small><i>Posted on February 19, 2016</i></small></h4>' +
              '<p>' + comment.value + '</p>' +
            '</div>' +
            '<div class="media-left">' +
              '<img src="img/img_avatar1.png" class="media-object" style="width:60px">' +
            '</div>' +
          '</div>' +
        '</li>';
    }
    else
    {
      comments.innerHTML +=
        '<li class="list-group-item">' +
          '<div class="media">' +
            '<div class="media-body">' +
              '<h4 class="media-heading">Jane Doe <small><i>Posted on February 19, 2016</i></small></h4>' +
              '<p>' + comment.value + '</p>' +
            '</div>' +
            '<div class="media-left">' +
              '<img src="img/img_avatar2.png" class="media-object" style="width:60px">' +
            '</div>' +
          '</div>' +
        '</li>';
    }

  };
};

window.onload = doLoad ();

}());
