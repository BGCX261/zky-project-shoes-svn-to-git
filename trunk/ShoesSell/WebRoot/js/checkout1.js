function check(input,id){				
				var num = input.value ;	
				//isNaN判断num是否为数值，不是返回true，是返回false
				//indexOf('.')查找字符中是否带有‘.’符号，带有就返回‘.’所在的位置，没带有返回-1
				//如2.2这种也算是数值，但我们数量应该是整型数据，因此也不允许不是整型的数据输入
				if(isNaN(num) || num.indexOf('.')!=-1){
					alert("请不要输入非法字符，数量必须是整型数值");
					input.value = "" ;
					input.focus();
					return ;
				}else if(num==""){
					alert("请输入要修改的数量");
					input.focus();
					return ;
				}
				var url = "updateShopCart.action?id="+id+"&num="+num ;
				document.carform.action = url ;
				document.carform.submit();
			}