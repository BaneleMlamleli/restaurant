$(document).ready(function(){
	$('.btnNewOrder, .table .btnUpdateOrder').on('click', function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		var option = $(this).text();
		var d = new Date();
		var strDate =  d.getDate() + "/" + (d.getMonth()+1) + "/" + d.getFullYear();
		if(option == 'Update'){
			$.get(href,function(order, status){
				$('.myForm #orderID').val(order.order_id);
				$('.myForm #orderName').val(order.order_name);
				$('.myForm #tableName').val(order.table_name);
				$('.myForm #waiterName').val(order.waiter_name);
				$('.myForm #orderStatus').val(order.order_status);
				$('.myForm #orderDate').val(strDate);
				$('.myForm #orderBill').val(order.order_bill);
				$('.myForm #comment').val(order.comment);
			});
			$('.myForm #exampleModal').modal();
		}else{
			$('.myForm #orderID').val('');
			$('.myForm #orderName').val('');
			$('.myForm #tableName').val('');
			$('.myForm #waiterName').val('');
			$('.myForm #orderStatus').val('');
			$('.myForm #orderDate').val(strDate);
			$('.myForm #orderBill').val('');
			$('.myForm #comment').val('');
			$('.myForm #exampleModal').modal();
		}
	});
	
	$('.table .btnDeleteOrder').on('click', function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		$('#exampleModalCenter #delRef').attr('href', href);
		$('#myModal').modal();
	});
});