$(document).ready(
		function() {

			// SUBMIT FORM
			$("#bookForm").submit(function(event) {
				// Prevent the form from submitting via the browser.
				event.preventDefault();
				ajaxPost();
			});

			function ajaxPost() {

				// PREPARE FORM DATA
				let formData = {
					"bookId" : $("#bookId").val(),
					"bookName" : $("#bookName").val(),
					"author" : $("#author").val()
				}

				// DO GET
				$.ajax({
					type : "GET",
					url : "saveBook",
					data : JSON.stringify(formData),
					contentType : "application/json",
					dataType : "json",
					success : function(result) {
						if (result.status == "success") {
							$("#postResultDiv").html(
									"" + result.data.bookName
											+ "Post Successfully! <br>"
											+ "---> Congrats !!" + "</p>");
						} else {
							$("#postResultDiv").html("<strong>Error</strong>");
						}
						console.log(result);
					},
					error : function(e) {
						alert("Error!")
						console.log("ERROR: ", e);
					}
				});

			}

		})