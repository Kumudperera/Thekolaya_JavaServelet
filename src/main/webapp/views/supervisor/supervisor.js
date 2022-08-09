$(document).ready(function() {
	$("#update-tea-measure").click(function(event) {
		event.preventDefault();
		console.log("hello world js");
		$.ajax({
			type: "GET",
			url: "/thekolaya/updateTeaMeasure",
			success: function(responseText) {
				// console.log(responseText);
				/*var parser = new DOMParser();
						var xmlDoc = parser.parseFromString(responseText, "text/html");
						var myHtml = xmlDoc.getElementById("previous_details").innerHTML;*/
				// var myHtml = $(responseText).find('#previous_details').html();
				$("#supervisor-root").html(responseText);
				/*console.log(json.length);*/
				// console.log(myHtml);
				/*myHtml = xmlDoc.getElementById("get_tea_rate").innerHTML;
						$('#tea-rate').html(myHtml);*/
				// console.log(myHtml);supervisor-dashboard
			},
		});
	});

	$("#supervisor-dashboard").click(function(event) {
		event.preventDefault();
		console.log("hello world js");
		$.ajax({
			type: "GET",
			url: "/thekolaya/supervisor-dashboard",
			success: function(responseText) {
				// console.log(responseText);
				/*var parser = new DOMParser();
						var xmlDoc = parser.parseFromString(responseText, "text/html");
						var myHtml = xmlDoc.getElementById("previous_details").innerHTML;*/
				// var myHtml = $(responseText).find('#previous_details').html();
				$("#supervisor-root").html(responseText);
				// console.log(myHtml);
				/*myHtml = xmlDoc.getElementById("get_tea_rate").innerHTML;
						$('#tea-rate').html(myHtml);*/
				// console.log(myHtml);supervisor-dashboardsupervisor-manage-fertilzer-requests
			},
		});
	});

	$("#supervisor-manage-fertilzer-requests").click(function(event) {
		event.preventDefault();
		console.log("hello world js");

		$.ajax({
			type: "GET",
			url: "/thekolaya/manageFertilizerRequests",
			success: function(responseText) {
				/*console.log(responseText);*/
				$("#supervisor-root").html(responseText);
			},
			error: function() {
				console.log("hey");
			},
		});

		
	});
});
