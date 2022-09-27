import http from "@/common/http";

class MatriculaService{
    getAll() {
        return http.get('/AllMatricula')
    }
    update(data){
        return http.get("/UpdateMatricula",data)
    }
    create(data){
        return http.post('/CreateMatricula', data)
    }
    deleteById(id){
        return http.delete(`/eleteMatricula/${id}`)
    }
    findById(id){
        return http.get(`/FindMatricula/${id}`)
    }

}

export default new MatriculaService();