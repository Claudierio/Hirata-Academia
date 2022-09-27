import http from "@/common/http";

class SalaService{
    getAll() {
        return http.get('/AllSala')
    }
    update(data){
        return http.get("/UpdateSala",data)
    }
    create(data){
        return http.post('/CreateSala', data)
    }
    deleteById(id){
        return http.delete(`/DeleteSala/${id}`)
    }
    findById(id){
        return http.get(`/FindSala/${id}`)
    }

}

export default new SalaService();