import http from "@/common/http";

class PlanoService{
    getAll() {
        return http.get('/AllPlano')
    }
    update(data){
        return http.get("/UpdatePlano",data)
    }
    create(data){
        return http.post('/CreatePlano', data)
    }
    deleteById(id){
        return http.delete(`/DeletePlano/${id}`)
    }
    findById(id){
        return http.get(`/FindPlano/${id}`)
    }

}

export default new PlanoService();