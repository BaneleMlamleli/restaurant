/**
 *
 * */
$(document).ready(function () {
	$('.btnNewOrder, .table .btnUpdateOrder').on('click', function (event) {
		event.preventDefault();
		var href = $(this).attr('href');
		var option = $(this).text();
		var d = new Date();
		var strDate =  d.getDate() + "/" + (d.getMonth()+1) + "/" + d.getFullYear();
		if(option === "Update") {
			$.get(href, function (order, status) {
				$('.myForm #order_id').val(order.order_id);
				$('.myForm #order_name').val(order.order_name);
				$('.myForm #table_name').val(order.table_name);
				$('.myForm #waiter_name').val(order.waiter_name);
				$('.myForm #order_status').val(order.order_status);
				$('.myForm #order_date').val(strDate);
				$('.myForm #order_bill').val(order.order_bill);
				$('.myForm #comment').val(order.comment);
			});
			$('.myForm #exampleModal').modal();
		}else{
			$('.myForm #order_id').val("");
			$('.myForm #order_name').val("");
			$('.myForm #table_name').val("");
			$('.myForm #waiter_name').val("");
			$('.myForm #order_status').val("");
			$('.myForm #order_date').val(strDate);
			$('.myForm #order_bill').val("");
			$('.myForm #comment').val("");
			$('.myForm #exampleModal').modal();
		}
	});

	$('.table .btnDeleteOrder').on('click', function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		$('#exampleModalCenter #delRef').attr('href', href);
		$('#exampleModalCenter').modal();
	});
});