app.service("playerService",function ($http) {
    this.findAll = function () {
        return $http.get("../player/query.do");
    }
    this.delete = function (ids) {
        return $http.post("../player/delete.do",ids);
    }
    this.findSchool = function () {
        return $http.get("../player/findSchool.do");
    }
    this.findTeam = function () {
        return $http.get("../player/findTeam.do");
    }
    this.save = function (entity) {
        return $http.post("../player/save.do",entity);
    }
})