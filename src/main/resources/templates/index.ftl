<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>软件项目管理在线学习网站首页</title>

    <link href="dist/css/bootstrap.min.css" rel="stylesheet">

   
    <link href="css/navbar.css" rel="stylesheet">
	<link href="css/body.css" rel="stylesheet">
  </head>

  <body>
	<!--顶部-->
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="index.ftl">在线学习网站</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="index.ftl">首页</a></li>
            <li><a href="stu-course.html">选课管理</a></li>
            <li><a href="grade.html">成绩查询</a></li>
			<li><a href="tea-course.html">教师课程管理</a></li>
			<li><a href="test.html">测试题</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">信息管理<span class="caret"></span></a>
              <ul class="dropdown-menu">
			  <li class="dropdown-header">信息管理</li>
                <li><a href="userInfo.html">个人信息修改</a></li>
                <li><a href="searchCourse.html">学生课程查询</a></li>
                <li role="separator" class="divider"></li>
				
                <li class="dropdown-header">练习</li>
                <li><a href="inputGrade.html">成绩录入</a></li>
                <li><a href="inputTest.html">测试题录入</a></li>
				
				 <li role="separator" class="divider"></li>
				<li class="dropdown-header">视频</li>
                <li><a href="uploadVideo.html">视频上传</a></li>
                <li><a href="watchVideo.html">观看视频</a></li>
              </ul>
            </li>
          </ul>
		  <div class="dropdown-grids">
					<a href="#" class="btn btn-primary" ><span>退出</span></a>
				</div>
		<div class="dropdown-grids">
					<a class="btn btn-primary" href="#" data-toggle="modal" data-target="#register"><span>注册</span></a>
				</div>
		  <div class="dropdown-grids">
					<a  class="btn btn-primary" href="#" data-toggle="modal" data-target="#login"><span>登陆</span></a>
				</div>
				
      </div>
	  
        </div>
	  <div class="container" style="margin-top:30px;">
		  <div id="login" class="modal fade" data-backdrop="false">
          <div class="modal-dialog">
              <div class="modal-content">
                  <div class="modal-body">
                      <button class="close" data-dismiss="modal">
                          <span>&times;</span>
                      </button>
                  </div>
                  <div class="modal-title">
                      <h1 class="text-center">登录</h1>
                  </div>
                  <div class="modal-body">
                      <form class="form-group" action="127.0.0.1:8181/login">
                              <div class="form-group">
                                  <label for="">学号/工号</label>
                                  <input class="form-control" name="id" type="text" placeholder="请输入学号/工号">
                              </div>
                              <div class="form-group">
                                  <label for="">密码</label>
                                  <input class="form-control" name="pw" type="password" placeholder="请输入密码">
                              </div>
                              <div class="form-group">
								  <label for="">类型</label>
								  <label class="radio-inline">
									<input type="radio" name="type-login" value="stu" checked>学生
								  </label>
								  <label class="radio-inline">
									<input type="radio" name="type-login" value="tea">教师
								  </label>
								</div>
                              <div class="text-right">
                                  <button class="btn btn-primary" type="submit">登录</button>
                                  <button class="btn btn-danger" data-dismiss="modal">取消</button>
                             </div>
                             <a href="" data-toggle="modal" data-dismiss="modal" data-target="#register">还没有账号？点我注册</a>
                     </form>
                 </div>
             </div>
         </div>
     </div>
</div>
		<div class="container">
		<div id="register" class="modal fade" data-backdrop="false" tabindex="-1">
				  <div class="modal-dialog">
					  <div class="modal-content">
						  <div class="modal-body">
							  <button class="close" data-dismiss="modal">
								<span>&times;</span>
							 </button>
						 </div>
						 <div class="modal-title">
							 <h1 class="text-center">注册</h1>
						 </div>
						 <div class="modal-body">
							 <form class="form-group" action="127.0.0.1:8181:register">
									 <div class="form-group">
										 <label for="">学号/工号</label>
										 <input class="form-control" name="id" type="text" required="required" placeholder="请输入学号">
									 </div>
									 <div class="form-group">
										 <label for="">密码</label>
										 <input class="form-control" id="pw1" type="password" required="required" placeholder="至少6位字母或数字">
									 </div>
									 <div class="form-group">
										 <label for="">再次输入密码</label>
										 <input class="form-control" name="pw2" type="password" required="required" placeholder="至少6位字母或数字">
									 </div>
									 <div class="form-group">
								  <label for="">类型</label>
								  <label class="radio-inline">
									<input type="radio" name="type-register" value="stu" required="required" checked>学生
								  </label>
								  <label class="radio-inline">
									<input type="radio" name="type-register" required="required" value="tea">教师
								  </label>
								</div>
									 <div class="form-group">
										 <label for="">姓名</label>
										 <input class="form-control" name="name" type="email" required="required" placeholder="请输入姓名">
									 </div>
									 <div class="form-group">
										 <label for="">邮箱</label>
										 <input class="form-control" name="email" type="text" placeholder="例如:123@123.com">
									 </div>
									 <div class="form-group">
										 <label for="">电话</label>
										 <input class="form-control" name="tel" type="tel" placeholder="请输入电话号码">
									 </div>
									 <div class="form-group">
										 <label for="">出生日期</label>
										 <input class="form-control" name="birth" type="date" placeholder="出生日期">
									 </div>
									 <div class="text-right">
										 <button class="btn btn-primary" type="submit">提交</button>
										 <button class="btn btn-danger" data-dismiss="modal">取消</button>
									 </div>
									 <a href="" data-toggle="modal" data-dismiss="modal" data-target="#login">已有账号？点我登录</a>
							 </form>
						 </div>
					 </div>
				 </div>
			 </div>
	      </div>
    </nav>
	<!--顶部结束-->
	<div class="jumbotron">
      <div class="container">
        <h1>软件项目管理在线学习网站</h1>
        <p>"软件项目管理在线学习网站"为想要需无锡软件项目管理课程的学习者提供在线学习平台，提供便捷的在线教育服务</p>
      </div>
    </div>
	<!--body开始-->
    <div class="container">
		
		<span style="color:#337ab7;font-weight:bold;display:block;padding:20px;font-size:20px;">开放课程</span>
		<div class="row">
			<div  class="col-md-3">
				<a href="video.ftl"><div><img src="images/slide1.png" /><p>讲师1</p></div></a>
			</div>
			<div  class="col-md-3">
				<a href="video.ftl"><div><img src="images/slide1.png"/><p>讲师1</p></div></a>
			</div>
			<div  class="col-md-3">
				<a href="video.ftl"><div><img src="images/slide1.png"/><p>讲师1</p></div></a>
			</div>
			<div  class="col-md-3">
				<a href="video.ftl"><div><img src="images/slide1.png"/><p>讲师1</p></div></a>
			</div>
			<div  class="col-md-3">
				<a href="video.ftl"><div><img src="images/slide1.png"/><p>讲师1</p></div></a>
			</div>
			<div  class="col-md-3">
				<a href="video.ftl"><div><img src="images/slide1.png"/><p>讲师1</p></div></a>
			</div>
		</div>
		
		<nav style="text-align: center"> 
		<ul class="pagination pagination-lg">
			<li><a href="#">&laquo;</a></li>
			<li><a href="#">1</a></li>
			<li><a href="#">2</a></li>
			<li><a href="#">3</a></li>
			<li><a href="#">4</a></li>
			<li><a href="#">5</a></li>
			<li><a href="#">&raquo;</a></li>
		</ul>
		</nav>
    </div>
	
	<div class="container">
	<span style="color:#337ab7;font-weight:bold;display:block;padding:20px;font-size:20px;">任课讲师</span>
	<div class="row">
        <div class="col-lg-4">
          <img class="img-circle" src="images/slide1.png" alt="Generic placeholder image" width="140" height="140">
          <h2>name1</h2>
          <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.</p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="images/slide1.png" alt="Generic placeholder image" width="140" height="140">
          <h2>name2</h2>
          <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh.</p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="images/slide1.png" alt="Generic placeholder image" width="140" height="140">
          <h2>name3</h2>
          <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
        </div><!-- /.col-lg-4 -->
      </div>
	</div>
	<!--body结束-->

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="dist/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
	<script src="js/lightbox.js"></script>
  </body>
</html>
