let index = {
		init : function() {
			let _this = this;
			$('#test').on('click', function() {
				_this.save();
			});
		},
		save : function() {
			let data = {
					extension: $('#exe').val()
			};
			
			$.ajax({
				type: 'POST',
				url: '/api/v1/extension/fixed',
				contentType: 'application/json; charset=utf-8',
				data: JSON.stringify(data)
			}).done(function() {
				alert('요청 성공');
			}).fail(function(error) {
				alert('요청 실패');
			});
		}
};

index.init();