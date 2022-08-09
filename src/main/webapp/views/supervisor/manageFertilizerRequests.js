$(document).ready(function() {
	$.ajax({
		type: "POST",
		url: "/thekolaya/manageFertilizerRequests",
		success: function(fertilzerRequests) {
			console.log(fertilzerRequests);
			var html = "";
			var newHtml = "";
			var preHtml = `<div class="row tabel-header">
								<div class="cell">Date</div>
								<div class="cell">Landowner ID</div>
								<div class="cell">Name</div>
								<div class="cell">Amount(kg)</div>
								</div>`;
			if (fertilzerRequests.length === 0) {
				newHtml = "There is no Request to update";
				$("#not_display_request_yet").html(newHtml);
			} else {
				for (var i = 0; i < fertilzerRequests.length; i++) {
					html = `<div class="row table_row" id="${fertilzerRequests[i].request_id}">
					  <div class="cell" data-title="Request_date">${fertilzerRequests[i].request_date}</div>
					  <hr class="horizontal-line">
					  <div class="cell lid" data-title="Landowner_id">${fertilzerRequests[i].landowner_id}</div>
					  <hr class="horizontal-line">
					  <div class="cell" data-title="Name">${fertilzerRequests[i].landowner_name}</div>
					  <hr class="horizontal-line">
					  <div class="cell" data-title="Amount">${fertilzerRequests[i].requested_amount}</div>
				  </div>`;
					newHtml = newHtml + html;
				}
				newHtml = preHtml + newHtml;
				$("#fertilzer-request-table").html(newHtml);
			}
		},
		error: function() {
			console.log("hey");
		},
	});
});