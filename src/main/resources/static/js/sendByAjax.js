function loadXMLDoc(arg1,arg2)
{
var xmlhttp;
var t1 = document.getElementById(arg1).value;
var t2 = document.getElementById(arg2).value;
if (window.XMLHttpRequest)
  {// code for IE7+, Firefox, Chrome, Opera, Safari
  xmlhttp=new XMLHttpRequest();
  }
else
  {// code for IE6, IE5
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
xmlhttp.onreadystatechange=function()
  {
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
		var text = xmlhttp.responseText;
        if(success==text)
			alert("添加成功");
		else
			alert("添加失败");
    }
  }
xmlhttp.open("GET","",true);
xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
xmlhttp.send("grade1="+t1+"&grade2="+t2);
}