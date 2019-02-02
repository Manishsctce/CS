var myApp = angular.module('myApp', ['json-tree']);
myApp.controller('myCtrl1', 
	function($scope, $http)
	{
		$scope.helloMessage = "Hello World from Angular Controller 1";
		
		$http.get("data1.json").success(
							function(response) {
								$scope.names = response;
							}
						);
		
		
		function funcData(){
			return {
				fullname: {
					first: 'json',
					last: 'tree'
				},
				version : "1.0.1"
			}
		};

		function parse(data,$http){
			$http.get("data1.json").success(
					function(response) {
						$scope.names = response;
						alert("Hello ");
						return response ? JSON.parse(response) : {};
						
					}
				);
			
		};

				//$scope.jsonData = $scope.names;
		
		$scope.set = function(data){
			alert("Hello ");
			console.log("Data : "+data);
			$scope.jsonData = parse(data);
			$scope.nodeOptions.refresh(); /* use directive internal refresh function */
		}

		$scope.default = function(){
			alert("Hello");
			$scope.jsonData = $scope.names;
			$scope.nodeOptions.refresh();
			$scope.inputdata = '';
		}
		
		
	}
)	