const base = {
    get() {
        return {
            url : "http://localhost:8080/minzuhunshayudingxitong/",
            name: "minzuhunshayudingxitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/minzuhunshayudingxitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "民族婚纱预定系统"
        } 
    }
}
export default base
