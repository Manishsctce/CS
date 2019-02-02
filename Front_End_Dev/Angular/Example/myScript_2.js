(
	function(){
        var myApp = angular.module('myApp', ['json-tree']);
        myApp.controller('myCtrl', 
			function($scope, $http)
			{
				function defaultData() {				
						
					$http.get('data.json').success(
											function(res){
												$scope.todos = res;                
											}
										);
							
				//return $scope.todos; 
				   return {
						key1: 'str',
						key2: 12.34,
						key3: null,
						array: [3, 1, 2,"Mnanis",['a','b','c']],
						object: {
							anotheObject: {
								key1: 1,
								bool: true
							}
						},
						arrayOfObjects: [{
								dataFromFunction: new funcData(),
								key1: 'Hello World!',
								key2: "Hello Manish"
						},{
							bool: true,
							someFunction: function(){
								
								return 'some function'
							}
						}],
						key4: 'Manish Agrawal',
						key5: 'Samir'
					};
				}

				function funcData(){
					return {
						fullname: {
							first: 'json',
							last: 'tree'
						},
						version : "1.0.1"
					}
				};

				function parse(data){
					return data ? JSON.parse(data) : {};
				};

				$scope.jsonData = defaultData();

				$scope.set = function(data){
					$scope.jsonData = parse(data);
					$scope.nodeOptions.refresh(); /* use directive internal refresh function */
				}

				$scope.default = function(){
				$scope.jsonData = defaultData();
				$scope.nodeOptions.refresh();
				$scope.inputdata = '';
				}
			}
		)
	}
)()
	