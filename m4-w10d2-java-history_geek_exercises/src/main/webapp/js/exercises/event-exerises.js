/// <reference path="../jquery-3.1.1.js" />
$(document).ready(function () {

	$('#SameShipping').on('click', function() {
		$('#ShippingAddress1').val($('#BillingAddress1').val());
		$('#ShippingAddress2').val($('#BillingAddress2').val());
		$('#ShippingCity').val($('#BillingCity').val());
		$('#ShippingState').val($('#BillingState').val());
		$('#ShippingPostalCode').val($('#BillingPostalCode').val());
	});
	
	$('input[name="ShippingType"]').on('click', function() {
		$('#shipping > .price').text('$' + $(this).attr('data-cost'));
		var subtotal = $('#subtotal > .price').text().substring(1);
		$('#grandtotal > .price').text('$' + (parseFloat($(this).attr('data-cost'))+parseFloat(subtotal)));
	});

});