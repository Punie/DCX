(function () {
'use strict';

var doLoad = function ()
{
  var body = window.document.getElementById('body');
  var button = window.document.getElementById('button');

  button.onclick = function ()
  {
    var id = window.document.getElementById('id').value;
    var ref = window.document.getElementById('ref').value;
    var color = window.document.getElementById('color').value;
    var brand = window.document.getElementById('brand').value;
    var country = window.document.getElementById('country').value;
    var price = window.document.getElementById('price').value;

    var line = '<tr>' +
                '<td>' + id + '</td>' +
                '<td>' + ref + '</td>' +
                '<td>' + color + '</td>' +
                '<td>' + brand + '</td>' +
                '<td>' + country + '</td>' +
                '<td>' + price + '</td>' +
                '</tr>';

    body.innerHTML += line;
  };
};

window.onload = doLoad ();

}());
