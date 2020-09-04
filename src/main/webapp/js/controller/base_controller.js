app.controller("baseController",function ($scope) {
    $scope.searchEntity = {};
    $scope.entity = {};
    //页面刷新方法
    $scope.reloadList = function(){
        //$scope.findPage($scope.paginationConf.currentPage,$scope.paginationConf.itemsPerPage);
        $scope.search($scope.paginationConf.currentPage,$scope.paginationConf.itemsPerPage,$scope.searchEntity);
    }
    //获取要删除的id集合
    $scope.ids = [];
    $scope.updateSelection = function($event,id){
        if ($event.target.checked){
            $scope.ids.push(id);
        }else{
            var index = $scope.ids.indexOf(id);
            $scope.ids.splice(index,1);
        }
    }
    //分页控件配置
    $scope.paginationConf = {
        currentPage: 1,
        totalItems: 10,
        itemsPerPage: 5,
        perPageOptions: [5,10,20,30,40,50],
        onChange: function(){
            $scope.reloadList();//重新加载
        }
    };
});