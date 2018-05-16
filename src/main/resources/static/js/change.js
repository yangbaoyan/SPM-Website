function change(){
		var bt = document.getElementById("bt");
		var ctn1 = document.getElementById("ctn1");
		var ctn2 = document.getElementById("ctn2");
		var name = bt.innerHTML;
		if(name=="教师"){
			ctn1.style.display = "none";
			ctn2.style.display = "block";
			bt.innerHTML="学生";
		}else{
			ctn2.style.display = "none";
			ctn1.style.display = "block";
			bt.innerHTML="教师";
		}
			
	}