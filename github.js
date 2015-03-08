var page = require('webpage').create();
page.open('https://github.com/fderakhshan/project/blob/master/index.jsp/', function() {
  page.render('github.png');
  phantom.exit();
});
